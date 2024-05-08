package com.example.labtest;

public abstract class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
    }

    public String showColor() {
        return name;
    }
}