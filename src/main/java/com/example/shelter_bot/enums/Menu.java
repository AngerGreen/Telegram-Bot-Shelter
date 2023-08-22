package com.example.shelter_bot.enums;

//enum-список выбора в меню
public enum Menu {
    GREETINGS("Приветствую в приюте г. Алматы!"),
    START("Старт"),
    BACK("Назад"),
    CHOOSE_CAT("Хочу взять из приюта кошку"),
    CHOOSE_DOG("Хочу взять из приюта собаку"),
    CHOOSE_ACTION("Выберите действие: "),
    BASIC_INFO("Узнать информацию о приюте"),
    GUARD_INFO("Узнать о правилах посещения"),
    TAKE_ANIMAL_HOME("Как взять животное из приюта"),
    SEND_ANIMAL_REPORT("Прислать отчет о питомце"),
    CALL_VOLUNTEER("Позвать волонтера"),
    SEND_DATA("Отправить контактные данные для связи");

    private final String text;

    Menu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


}
