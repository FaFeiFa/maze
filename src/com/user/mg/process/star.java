package com.user.mg.process;

import com.user.mg.io.reader;
import com.user.mg.pojo.maze;
import com.user.mg.pojo.mazeByFound;

import java.io.IOException;

import static com.user.mg.function.AStar.go;

public class star {
    public static void main(String[] args) throws IOException {
        maze maze = reader.read();
        mazeByFound head = go(maze.cloneMe());
        System.out.println(head.getX() +","+head.getY());
        while (head.nextMazeByFound != null){
            System.out.println(head.nextMazeByFound.getX() +","+head.nextMazeByFound.getY());
            head = head.nextMazeByFound;
        }
    }
}
