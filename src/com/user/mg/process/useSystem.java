package com.user.mg.process;

import com.user.mg.function.findRoad;
import com.user.mg.function.mazeByRandom;
import com.user.mg.io.write;
import com.user.mg.io.writeToReader;
import com.user.mg.pojo.maze;

import java.io.IOException;

import static com.user.mg.function.bfs.go;

public class useSystem {
    public static void useFile(int len , int wit) throws IOException {
        int[][] used ;
        maze maze;
        while (true){
            maze = mazeByRandom.make(len,wit);
            used = go(maze.cloneMe());
            if (used != null) break;
        }
        writeToReader.writer(maze.mg);
        int[][] ints = findRoad.find(maze.mg, used);
        write.writer(ints);

    }
}
