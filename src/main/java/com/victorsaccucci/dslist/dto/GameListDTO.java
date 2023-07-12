package com.victorsaccucci.dslist.dto;

import com.victorsaccucci.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){

    }
    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }
}
