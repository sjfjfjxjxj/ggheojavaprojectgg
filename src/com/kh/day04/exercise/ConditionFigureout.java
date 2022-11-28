package com.kh.day04.exercise;
//아 더 간결하게 쓸수있는 방법이 없을까ㅜㅜ
import java.util.Scanner;

//A, B, C 사원의 연봉을 입력 받고
//각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력
//인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 
//미만이면 “3000 미만”을 출력
//A 사원의 인센티브는 0.4
//B 사원의 인센티브는 없으며
// C 사원의 인센티브는 0.15)
public class ConditionFigureout {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("A사원 연봉을 입력하세요: ");
    	float input = sc.nextFloat();
    	System.out.println("A사원 연봉: " + input +" + "+ input*0.4 +" : "+ input*1.4);;
    	if(input*1.4>=3000) { 
    		System.out.println("3000 이상");
    	} else {
    		System.out.println("3000 미만");
    	}
    	System.out.print("B사원 연봉을 입력하세요: ");
    	input = sc.nextInt(); 
    	System.out.println("B사원 연봉: " + input +" + "+ input*0 +" : "+ input*1);;
    	if(input*1.0>=3000) { 
    		System.out.println("3000 이상");
    	} else {
    		System.out.println("3000 미만");
    	}
    	System.out.print("C사원 연봉을 입력하세요: ");
    	input = sc.nextInt(); 
    	System.out.println("C사원 연봉: " + input +" + "+ input*0.15 +" : "+ input*1.15);
    	if(input*1.15>=3000) { 
    		System.out.println("3000 이상");
    	} else {
    		System.out.println("3000 미만");
    	}
    }
}
