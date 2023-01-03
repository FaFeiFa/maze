package com.user.mg.pojo;

public class maze {

    public int[][] mg;
    private int len;
    private int wit;


    public maze(int len , int wit) {
        this.len = len;
        this.wit = wit;
        mg = new int[wit][len];
    }

    public int[][] cloneMe(){
        int[][] its = new int[wit][len];
        for(int a = 0 ; a < wit ; a++){
            for(int b = 0 ; b < len ; b++){
                its[a][b] = mg[a][b];
            }
        }
        return its;
    }

    public void showMe(){
        for(int it[] : mg){
            for(int i : it){
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }




}
