package com.zergatstage.labs.crud.dto;

public class CommandsDTO {
    private int id;
    private String commandName;
    public CommandsDTO(){}

    public CommandsDTO(int id, String commandName){
        this.id = id;
        this.commandName = commandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }
}
