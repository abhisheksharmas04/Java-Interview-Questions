package com.aruga.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeprateZeroAndOnes {
    public static void main(String[] args) {
        String str = "0101010";
        usingRegularExpression(str);

    }

    static  void usingBuilder(String str){
        StringBuilder zeros = new StringBuilder();
        StringBuilder ones = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '0'){
                zeros.append(c);
            } else if (c == '1') {
                ones.append(c);
            }
        }
        System.out.println("Zeros: " + zeros.toString());
        System.out.println("Ones: " + ones.toString());
    }
    static void usingRegularExpression(String s){
        Pattern pattern = Pattern.compile("[01]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            String digit = matcher.group();
            System.out.print(digit + "");
        }
    }

}
