package com.company;
//package net.ilkmac.blog.loadimplementors.animals;

public class RunnerInterfaceTest {
    public static void main(String[] args) {
        Runner[] runnerObjeect = new Runner[] {
                new Wolf(40),
                new PolarBear(35),
                new Grizzly(32),
        };

        System.out.println("Runner and Bear processed polymorphically: ");

        for (Runner currentRunner : runnerObjeect) {
            System.out.printf("%n%s %nAfter polymorphically processed his speed is: %s km/h",
                    currentRunner.toString(), // could invoke implicitly
                    currentRunner.getSpeed());
        }
    }
}
