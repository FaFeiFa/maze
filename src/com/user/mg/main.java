package com.user.mg;

import com.user.mg.process.useSystem;
import com.user.mg.process.useFile;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("��mg/inputfile�ļ��������Լ����Թ�,��ʽ����\n" +
                "0��ʾ·,1��ʾǽ,5��ʾ���,9��ʾ�յ�"
        );
        System.out.println("��mg/outputfile��������Թ�������·��");
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("���������ֱ�ʾ����Ҫ���еĲ���:");
            System.out.println("1:ʹ���ļ��е��Թ�");
            System.out.println("2:ʹ��������ɵĵ��Թ�");
            int chose = scanner.nextInt();
            if(chose == 1){
                try {
                    useFile.useFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(chose == 2){
                System.out.println("�������Թ��ĳ�:");
                int len = scanner.nextInt();
                System.out.println("�������Թ��Ŀ�:");
                int wit = scanner.nextInt();
                try {
                    useSystem.useFile(len,wit);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                System.out.println("û�����ֲ���!");
            }
            System.out.println("�Ƿ��������?��������������3");
            int con = scanner.nextInt();
            if(con != 3){
                break;
            }
        }


    }
}
