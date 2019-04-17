package com.company;
//package net.ilkmac.blog.loadimplementors.animals;

class Wolf implements Runner{
    private final int WOLF_SPEED;

    public Wolf(int WOLF_SPEED) {
        if (WOLF_SPEED < 0) {
            throw new IllegalArgumentException("Wolf speed must be >= 0");
        }
        this.WOLF_SPEED = WOLF_SPEED;
    }

    public int getWOLF_SPEED() {
        return  WOLF_SPEED;
    }

    @Override
    public int getSpeed() {
        return getWOLF_SPEED();
    }

    @Override
    public String toString() {
        return String.format("%s", getSpeed());
    }
}
