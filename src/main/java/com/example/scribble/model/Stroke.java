package com.example.scribble.model;

import jakarta.persistence.*;

@Entity
public class Stroke {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private String color;

    public Stroke() {}

    public Stroke(int startX, int startY, int endX, int endY, String color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color = color;
    }

    // Getters and setters
    public Long getId() { return id; }
    public int getStartX() { return startX; }
    public void setStartX(int startX) { this.startX = startX; }
    public int getStartY() { return startY; }
    public void setStartY(int startY) { this.startY = startY; }
    public int getEndX() { return endX; }
    public void setEndX(int endX) { this.endX = endX; }
    public int getEndY() { return endY; }
    public void setEndY(int endY) { this.endY = endY; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

