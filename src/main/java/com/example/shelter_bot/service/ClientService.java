package com.example.shelter_bot.service;

import com.example.shelter_bot.entity.Client;

import java.util.Optional;

public interface ClientService {

    Client saveClientToRepository(Client client);

    Client parseClientData(Long fromId, String clientData);

    Optional<Client> findClient(Long id);
}