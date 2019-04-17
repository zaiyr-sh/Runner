package com.company;
//package net.ilkmac.blog.loadimplementors.animals;

class Grizzly extends Bear{
    private final int GRIZZLY_SPEED;

    public Grizzly(int GRIZZLY_SPEED){
        if (GRIZZLY_SPEED < 0) {
            throw new IllegalArgumentException("Grizzly speed must be >= 0");
        }

        this.GRIZZLY_SPEED = GRIZZLY_SPEED;
    }

    public int getGRIZZLY_SPEED(){
        return GRIZZLY_SPEED;
    }

    @Override
    public int getSpeed() {
        return getGRIZZLY_SPEED();
    }

    @Override
    public String toString() {
        return String.format("Grizzly speed is: %s km/h", getSpeed());
    }
}
