package com.user.mg.process;

import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(0,1);
        for (int i:list
             ) {
            System.out.println(i);
        }
    }
}
