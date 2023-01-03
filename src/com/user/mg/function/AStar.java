package com.user.mg.function;

public class AStar {
    public static void go(int[][] maze){
        int meX = 0,meY = 0,endX = 0,endY = 0;
        for(int a = 0 ; a < maze.length ; a++){
            for(int b = 0 ; b < maze[0].length ; b++){
                if(maze[a][b] == 5){
                    meX = a;
                    meY = b;
                }
                if(maze[a][b] == 9){
                    endX = a;
                    endY = b;
                }
            }
        }



    }
}
