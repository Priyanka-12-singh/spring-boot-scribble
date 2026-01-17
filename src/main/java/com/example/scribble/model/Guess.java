package com.example.scribble.model;

import jakarta.persistence.*;

@Entity
public class Guess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String guess;
    private String playerName;

    public Guess() {}
    public Guess(String guess, String playerName) {
        this.guess = guess;
        this.playerName = playerName;
    }

    public Long getId() { return id; }
    public String getGuess() { return guess; }
    public void setGuess(String guess) { this.guess = guess; }
    public String getPlayerName() { return playerName; }
    public void setPlayerName(String playerName) { this.playerName = playerName; }
}

