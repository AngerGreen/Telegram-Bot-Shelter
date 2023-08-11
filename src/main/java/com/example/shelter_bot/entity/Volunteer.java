package com.example.shelter_bot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import java.util.Optional;

@Entity
public class Volunteer {

    @Id
    private Long id;
    private String volunteerName;
    private Long chatId;
    private boolean available;

    public Volunteer(Long id, String volunteerName, Long chatId, boolean available) {
        this.id = id;
        this.volunteerName = volunteerName;
        this.chatId = chatId;
        this.available = available;
    }

    public Volunteer() {
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o) return  false;
        Volunteer test = (Volunteer) o;
        return id.equals(id) &&
                Objects.equals(volunteerName, test.getVolunteerName()) &&
                Objects.equals(chatId, test.getChatId()) &&
                Objects.equals(available, test.isAvailable());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, volunteerName, chatId, available);
    }
}
