package com.user.mg.function;

import static com.user.mg.function.change.pr;

public class findRoad {
    /*public static int meX = 0,meY = 0,endX = 0,endY = 0;*/
    public static int[][] find(int[][] old , int[][] used){
        if(used == null){
            System.out.println("NONONO!");
            return null;
        }
        int meX = 0,meY = 0,endX = 0,endY = 0;
        for(int a = 0 ; a < old.length ; a++){
            for(int b = 0 ; b < old[0].length ; b++){
                if(old[a][b] == 5){
                    meX = a;
                    meY = b;
                }
                if(old[a][b] == 9){
                    endX = a;
                    endY = b;
                }
            }
        }
        int x = endX;
        int y = endY;
        while(x != meX || y != meY){
            if( used[x][y] == 8 ){
                x++;
                old[x][y] =  8 ;
            }
            if( used[x][y] == 2 ){
                x--;
                old[x][y] =  2 ;
            }
            if( used[x][y] == 4 ){
                y++;
                old[x][y] =  4 ;
            }
            if( used[x][y] == 6 ){
                y--;
                old[x][y] =  6 ;
            }
        }
        for (int i = 0 ; i < old[0].length+2 ; i++){
            System.out.print("¨€¨€ ");
        }
        System.out.println();
        for(int it[] : old){
            System.out.print("¨€¨€ ");
            for(int i : it){
                System.out.print(pr(i)+" ");
            }
            System.out.print("¨€¨€ ");
            System.out.println();
        }
        for (int i = 0 ; i < old[0].length+2 ; i++){
            System.out.print("¨€¨€ " );
        }
        System.out.println();
        return old;
    }

}
