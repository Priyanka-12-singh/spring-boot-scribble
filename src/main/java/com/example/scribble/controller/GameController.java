package com.example.scribble.controller;

import com.example.scribble.model.Guess;
import com.example.scribble.model.Player;
import com.example.scribble.model.Stroke;
import com.example.scribble.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/game")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/player")
    public Player addPlayer(@RequestParam String name) {
        return gameService.addPlayer(name);
    }

    @PostMapping("/guess")
    public Guess addGuess(@RequestParam String guess, @RequestParam String playerName) {
        return gameService.addGuess(guess, playerName);
    }

    @GetMapping("/guesses")
    public List<Guess> getGuesses() {
        return gameService.getAllGuesses();
    }
    @PostMapping("/stroke")
    public Stroke saveStroke(@RequestBody Stroke stroke) {
        return gameService.saveStroke(stroke);
    }
    @GetMapping("/strokes")
    public List<Stroke> getStrokes() {
        return gameService.getAllStrokes();
    }
}

