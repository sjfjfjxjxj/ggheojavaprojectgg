package com.kh.day04.exercise;

import java.util.Scanner;
//정수 두개 연산하는 계산기 만들기 다시! (3번 반복하고 멈추기)
public class Exercise_CalculatorFor {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int count = 0;
        for(;;) {
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
        	
            count++; // 출력에 성공했을때 카운트 늘림
        	if(count ==3) break;
        }
    }
}
