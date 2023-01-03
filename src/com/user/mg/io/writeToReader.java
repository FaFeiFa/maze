package com.user.mg.io;

import java.io.FileWriter;
import java.io.IOException;

public class writeToReader {
    public static void writer(int[][] its) throws IOException {
        FileWriter fileWriter = new FileWriter("mg/inputfile");
        for(int it[] : its){
            for(int i : it){
                fileWriter.write(i + "  ");
            }
            fileWriter.write("\n");
        }
        fileWriter.close();
    }
}
