package com.cc.java;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {

        return "Im a bird i can fly";
    }

    @Override
    public String hasFeathers() {

        return "Im a bird I have feathers";
    }

}
