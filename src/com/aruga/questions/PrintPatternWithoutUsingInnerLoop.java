package com.aruga.questions;
/*
 *

 **

 ***

 ****
*/
public class PrintPatternWithoutUsingInnerLoop {
    public static void main(String[] args) {
        int row = 4;

        for (int i = 0; i <= row; i++) {
            String pattern = new String(new char[i]).replace("\0", i+"");
            System.out.println(pattern);
        }
    }
}
