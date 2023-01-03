package com.user.mg;

import com.user.mg.process.useSystem;
import com.user.mg.process.useFile;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("在mg/inputfile文件键入你自己的迷宫,格式不限\n" +
                "0表示路,1表示墙,5表示起点,9表示终点"
        );
        System.out.println("在mg/outputfile将会输出迷宫的行走路线");
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字表示你想要进行的操作:");
            System.out.println("1:使用文件中的迷宫");
            System.out.println("2:使用随机生成的的迷宫");
            int chose = scanner.nextInt();
            if(chose == 1){
                try {
                    useFile.useFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(chose == 2){
                System.out.println("请输入迷宫的长:");
                int len = scanner.nextInt();
                System.out.println("请输入迷宫的宽:");
                int wit = scanner.nextInt();
                try {
                    useSystem.useFile(len,wit);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                System.out.println("没有这种操作!");
            }
            System.out.println("是否继续操作?继续操作请输入3");
            int con = scanner.nextInt();
            if(con != 3){
                break;
            }
        }


    }
}
