package com.game.store.model.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class GameRequest {
    private String title;
    private String genre;
    private Double price;
    private Long studioId;

    public GameRequest(String title, Double price, String genre, Long studioId) {
        this.title = title;
        this.price = price;
        this.genre = genre;
        this.studioId = studioId;
    }
}
