package com.user.mg.function;

import com.user.mg.pojo.maze;

import java.util.Random;

public class mazeByRandom {
    public static maze make(int len , int wit){
        Random random = new Random();
        maze maze = new maze(len, wit);
        for(int a = 0 ; a < wit ; a ++){
            for(int b = 0 ; b < len ; b ++){
                if(random.nextInt(10) > 5){
                    maze.mg[a][b] = 1;
                }
            }
        }


        maze.mg[random.nextInt(wit)][0] = 5;
        maze.mg[random.nextInt(wit)][len-1] = 9;
        return maze;
    }

}
