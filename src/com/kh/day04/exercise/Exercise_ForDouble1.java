 package com.kh.day04.exercise;
//구구단 중첩.. 근데 이제 가로로...
public class Exercise_ForDouble1 {
    public static void main(String[] args) {
        int i = 1;
        int dan = 1;
        for (i = 1; i < 10; i++) {
        	for (dan = 1; dan < 10; dan++) {                       //tab된거! "    "보다 줄정렬됨
        		System.out.print(i + " * " + dan + " = " + i*dan + "\t");
        	}
        	System.out.println();
        }
    	
    }
}
