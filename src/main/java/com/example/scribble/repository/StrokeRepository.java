package com.example.scribble.repository;

import com.example.scribble.model.Stroke;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StrokeRepository extends JpaRepository<Stroke, Long> {}

