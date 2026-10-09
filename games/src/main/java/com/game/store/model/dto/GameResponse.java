package com.game.store.model.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class GameResponse {
    private Long id;
    private String title;
    private String genre;
    private Double price;
    private String studioName;

    public GameResponse(Long id, String genre, String title, Double price, String studioName) {
        this.id = id;
        this.genre = genre;
        this.title = title;
        this.price = price;
        this.studioName = studioName;
    }
}
