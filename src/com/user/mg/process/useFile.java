package com.user.mg.process;

import com.user.mg.function.findRoad;
import com.user.mg.io.reader;
import com.user.mg.io.write;
import com.user.mg.pojo.maze;

import java.io.IOException;

import static com.user.mg.function.bfs.go;

public class useFile {
    public static void useFile() throws IOException {
        maze maze = reader.read();
        int[][] used = go(maze.cloneMe());
        int[][] ints = findRoad.find(maze.mg, used);
        write.writer(ints);
    }
}
