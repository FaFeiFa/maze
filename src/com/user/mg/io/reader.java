package com.user.mg.io;


import com.user.mg.function.toMg;
import com.user.mg.pojo.maze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class reader {
    public static maze read() throws IOException {
        FileReader fileReader = new FileReader("mg/inputfile");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String everyLine = "";
        List<String> list = new ArrayList<>();
        while (true){
            everyLine = bufferedReader.readLine();
            if (everyLine != null) {
                list.add(everyLine);
            }else{
                break;
            }
        }
        bufferedReader.close();
        fileReader.close();
        List<int[]> its = new ArrayList<>();
        int wit = 0;
        int len = 0;
        for(String s : list){
            char[] chars = s.toCharArray();
            char[] cts = toMg.Cts(chars);
            if(cts.length != 0){
                wit++;
                int[] ints = new int[cts.length];
                for(int i = 0 ; i < cts.length ; i ++){
                    ints[i] = cts[i] - 48;
                }
                len = ints.length;
                its.add(ints);
            }
        }
        maze maze = new maze(len,wit);
        int t = 0;
        for(int[] it : its){
            maze.mg[t] = it;
            t++;
        }
        return maze;
    }

}
