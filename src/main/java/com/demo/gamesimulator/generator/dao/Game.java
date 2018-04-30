package com.demo.gamesimulator.generator.dao;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import java.util.UUID;

public class Game {
    private int seed;
    private String uuid;

    public Game() {

    }

    @JsonCreator
    public Game(@JsonProperty("uuid") String uuid,
                    @JsonProperty("seed") int seed) {
        this.uuid = uuid;
        this.seed = seed;
    }


    public Game(int seed){
        this.seed = seed;
        this.uuid = UUID.randomUUID().toString();
    }

    public int getSeed() {
        return seed;
    }

    public String getUuid() {
        return uuid;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "{\"seed\":" + seed + ",\"uuid\":"  +"\""+ uuid + "\"}";
    }

}
