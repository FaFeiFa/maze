package com.user.mg.io;

import java.io.FileWriter;
import java.io.IOException;

import static com.user.mg.function.change.pr;

public class write {
    public static void writer(int[][] its) throws IOException {

        FileWriter fileWriter = new FileWriter("mg/outputfile");
        if(its == null){
            fileWriter.write("这个迷宫没有可以通关的路线!");
        }else{
            for(int it[] : its){
                for(int i : it){
                    fileWriter.write(pr(i) + " ");
                }
                fileWriter.write("\n");
            }
        }

        fileWriter.close();
    }


}
