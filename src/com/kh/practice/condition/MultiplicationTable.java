package com.kh.practice.condition;
//구구단ㅋㅋ 코드 웨이럼ㅜㅜ (지금까지 배운거  if문, swhitch-case문)
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("알고싶은 단수를 입력하세요 : ");
    	int num = sc.nextInt();  //num=단수, multiple = 곱셈, 결과 =  result
    	int multiple = 1;
    	int result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);
    	multiple++;
    	result = num*multiple;
    	System.out.println(num + " * " + multiple + " = " + result);

    	
//포기ㅠ    	
    	/*switch (num){
    		case 1: result = multiple * 1;  		
    		   break;

    	}
    	System.out.println(num + " * " + multiple + " = " + result);*/
    }
}
