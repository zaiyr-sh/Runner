package com.company;
//package net.ilkmac.blog.loadimplementors.animals;

class PolarBear extends Bear{
    private final int POLAR_BEAR_SPEED;

    public PolarBear(int POLAR_BEAR_SPEED){
        if (POLAR_BEAR_SPEED< 0) {
            throw new IllegalArgumentException("Polar Bear speed must be >= 0");
        }

        this.POLAR_BEAR_SPEED = POLAR_BEAR_SPEED;
    }

    public int getPOLAR_BEAR_SPEED(){
        return POLAR_BEAR_SPEED;
    }

    @Override
    public int getSpeed() {
        return getPOLAR_BEAR_SPEED();
    }

    @Override
    public String toString() {
        return String.format("%s", getSpeed());
    }
}
