package com.example.scribble.repository;

import com.example.scribble.model.Guess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuessRepository extends JpaRepository<Guess, Long> {}

