package com.kh.day04.exercise;

import java.util.Scanner;
//정수 두개 연산하는 계산기 만들기 다시!
public class Exercise_Calculator {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("정수를 입력하세용 : ");
    	int num1 = sc.nextInt();
    	System.out.print("정수를 한번 더 입력해 주세용: ");
    	int num2 = sc.nextInt();
    	System.out.print("연산자를 입력해주세요(+,-,*,/,%) : ");
    	char operator = sc.next().charAt(0);
    	int result = 0;
        switch(operator) {
            case '+' : 
            	result = num1 + num2;
                break;
            case '-' : 
            	result = num1 - num2;
                break;
            case '*' : 
            	result = num1 * num2;
                break;
            case '/' : 
            	result = num1 / num2;
                break;
            case '%' : 
            	result = num1 % num2;
                break;
            }
        System.out.println("결과 : " + num1 + " " + operator +" "+ num2 + " = " + result);    
    	        //정수랑 문자열이 붙으면 자주 계산이 이상하게 돼서 " "라는 띄어쓰기 필요!                
                //이 경우 맨 앞 문자열이 있어서 " " 없어도 계산이 제대로 됨(왠진 잘 모르겟다)
                //Exercise_PrintSample 클래서 참조!
    }
}
