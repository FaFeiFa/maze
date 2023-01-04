package com.user.mg.pojo;

public class mazeByFound {
    private int x;
    private int y;
    private int now;
    private int future;
    public mazeByFound nextMazeByFound;

    public mazeByFound(int x, int y, int now, int endX , int endY) {
        this.x = x;
        this.y = y;
        this.now = now;
        this.future = Math.abs(endX - x) + Math.abs(endY - y);
    }

    public int getValue(){
        return now + future;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNow() {
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }

    public int getFuture() {
        return future;
    }

    public void setFuture(int future) {
        this.future = future;
    }

    public mazeByFound getNextMazeByFound() {
        return nextMazeByFound;
    }

    public void setNextMazeByFound(mazeByFound nextMazeByFound) {
        this.nextMazeByFound = nextMazeByFound;
    }
}
