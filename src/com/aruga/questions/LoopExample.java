package com.aruga.questions;

public class LoopExample {
    public static void main(String[] args) {
        int k = -1;
        if(true){
            for(int m=0;m<10;m++){
                for (int i=1; i < 10; i++){
                    for (int j=i; j > 0;j=j-1){
                        k=(j+1);
                    }
                }
            }
        }
        System.out.println(k);
        // OUTPUT:: 2
    }
}
