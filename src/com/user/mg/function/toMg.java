package com.user.mg.function;

public class toMg {
    public static char[] Cts(char[] chars){
        int len = chars.length;
        int left = 0 , right = 0;
        while (right != len){
            if(chars[right] == '0'){
                chars[left] = '0';
                left++;
            }else if(chars[right] == '1'){
                chars[left] = '1';
                left++;
            }else if(chars[right] == '5'){
                chars[left] = '5';
                left++;
            }else if(chars[right] == '9'){
                chars[left] = '9';
                left++;
            }

            right++;
        }
        char[] chs = new char[left];
        for(int i = 0 ; i < left ;i++){
            chs[i] = chars[i];
        }
        return chs;
    }
}
