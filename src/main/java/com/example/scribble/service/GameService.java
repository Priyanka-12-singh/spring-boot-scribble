package com.example.scribble.service;

import com.example.scribble.model.Guess;
import com.example.scribble.model.Player;
import com.example.scribble.model.Stroke;
import com.example.scribble.repository.StrokeRepository;
import com.example.scribble.repository.GuessRepository;
import com.example.scribble.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final PlayerRepository playerRepo;
    private final GuessRepository guessRepo;
    private final StrokeRepository strokeRepo;

    public GameService(PlayerRepository playerRepo, GuessRepository guessRepo,StrokeRepository strokeRepo) {
        this.playerRepo = playerRepo;
        this.guessRepo = guessRepo;
        this.strokeRepo = strokeRepo;
    }

    public Player addPlayer(String name) {
        return playerRepo.save(new Player(name));
    }

    public Guess addGuess(String guess, String playerName) {
        return guessRepo.save(new Guess(guess, playerName));
    }
    public Stroke saveStroke(Stroke stroke) {
        return strokeRepo.save(stroke);
    }
    public List<Stroke> getAllStrokes() {
        return strokeRepo.findAll();
    }

    public List<Guess> getAllGuesses() {
        return guessRepo.findAll();
    }
}

