package com.example.werehereforfood.appallnight;

/**
 * Created by Sam on 7/18/2015.
 */
public class Game {

    private String name;
    private boolean complete;

    public Game(String name) {
        this.name = name;
        this.complete = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
