package com.user.mg.function;

import java.util.LinkedList;
import java.util.List;

public class bfs {
    public static int[][] go(int[][] its){
        int meX = 0,meY = 0,endX = 0,endY = 0;
        for(int a = 0 ; a < its.length ; a++){
            for(int b = 0 ; b < its[0].length ; b++){
                if(its[a][b] == 5){
                    meX = a;
                    meY = b;
                }
                if(its[a][b] == 9){
                    endX = a;
                    endY = b;
                }
            }
        }
        its[1][3] = 5;
        List<int[]> list1 = new LinkedList();
        List<int[]> list2 = new LinkedList();
        list1.add(new int[]{meX, meY});
        its[endX][endY] = 0;
        while(its[endX][endY] == 0){
            for(int[] it : list1){
                if(it[0] - 1 >= 0 && its[it[0]-1][it[1]] == 0){
                    its[it[0]-1][it[1]] = 8;
                    list2.add(new int[]{it[0] - 1, it[1]});
                }
                if((it[0] + 1) < its.length && its[it[0]+1][it[1]] == 0){
                    its[it[0]+1][it[1]] = 2;
                    list2.add(new int[]{it[0] + 1, it[1]});
                }

                if((it[1] - 1) >= 0 && its[it[0]][it[1] - 1] == 0){
                    its[it[0]][it[1] - 1] = 4;
                    list2.add(new int[]{it[0], it[1] - 1});
                }

                if((it[1] + 1) <its[0].length && its[it[0]][it[1] + 1] == 0){
                    its[it[0]][it[1] + 1] = 6;
                    list2.add(new int[]{it[0], it[1] + 1});
                }
            }
            list1 = list2;
            list2 = new LinkedList<int[]>();
            if(list1.isEmpty()){
                return null;
            }
        }
        return its;
    }

}
