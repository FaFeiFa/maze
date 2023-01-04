package com.user.mg.function;

import com.user.mg.pojo.mazeByFound;

public class AStar {
    public static mazeByFound go(int[][] maze){
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

        mazeBFUtils mazeBFUtils = new mazeBFUtils();
        mazeByFound head = new mazeByFound(meX, meY, 0, endX, endY);
        mazeByFound last = head;
        mazeBFUtils.add(head);
        maze[endX][endY] = 0;
        while(maze[endX][endY] == 0){
            mazeByFound pull = mazeBFUtils.pull();
            last.nextMazeByFound = pull;
            last = pull;
            maze[pull.getX()][pull.getY()] = 2;
            if(pull.getX()+1 < maze[0].length && maze[pull.getX()+1][pull.getY()] == 0){
                mazeBFUtils.add(new mazeByFound(pull.getX()+1,pull.getY(), pull.getNow()+1, endX,endY));
            }
            if(pull.getX()-1 > 0 && maze[pull.getX()-1][pull.getY()] == 0){
                mazeBFUtils.add(new mazeByFound(pull.getX()-1,pull.getY(), pull.getNow()+1, endX,endY));
            }
            if(pull.getY()+1 < maze.length && maze[pull.getX()][pull.getY()+1] == 0){
                mazeBFUtils.add(new mazeByFound(pull.getX(),pull.getY()+1, pull.getNow()+1, endX,endY));
            }
            if(pull.getY()-1 > 0 && maze[pull.getX()][pull.getY()-1] == 0){
                mazeBFUtils.add(new mazeByFound(pull.getX(),pull.getY()-1, pull.getNow()+1, endX,endY));
            }
        }
        return head;
    }
}
