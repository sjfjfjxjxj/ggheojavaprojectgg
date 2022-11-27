package com.kh.practice.condition;

import java.util.Scanner;
//입력한 정수가 1~100사이의 숫자인지 확인하세요
//두가지 방법으로 해봄. 근데 boolean으로 하는게 중복 없어서 더 깔끔한듯!
public class InputNumberAndFigureOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = sc.nextInt();
        // boolean result = (input >= 1) && (100 >= input);       
        // System.out.println("1부터 100 사이의 숫자인가요 : " +  result);
        if ((input >= 1) && (100 >= input)) {
        	System.out.println("1부터 100 사이의 숫자인가요 : true");
        } else {
        	System.out.println("1부터 100 사이의 숫자인가요 : false");
        }
    }
}
