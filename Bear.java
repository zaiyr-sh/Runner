package com.company;
//package net.ilkmac.blog.loadimplementors.animals;

abstract class Bear implements Runner {
    public Bear(){
    }

    @Override
    public String toString() {
        return String.format("%s",getSpeed());
    }
}
