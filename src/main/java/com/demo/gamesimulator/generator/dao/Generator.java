package com.demo.gamesimulator.generator.dao;


import java.util.concurrent.Callable;

public class Generator {
    private String generatorId;
    private String uuid;
    private int generatedValue;

    public Generator(String generatorId, String uuid, int seed) {
        this.generatorId = generatorId;
        this.uuid = uuid;
        this.generatedValue = getGeneratedValue(generatorId, seed);
    }

    private int getGeneratedValue(String generatorId, int seed) {
        if(generatorId.equals("1")) {
            return seed * seed;
        }

        if(generatorId.equals("2")) {
            return seed + 10;
        }

        if(generatorId.equals("3")) {
            return seed*2;
        }

        if(generatorId.equals("4")) {
            return seed - 44;
        }

        if(generatorId.equals("5")) {
            return seed*seed + seed;
        }

        return seed*2 + 56;
    }


}
