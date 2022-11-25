package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("이름을 입력해 주세요 : ");
    	String name = sc.next();
    	System.out.println("태어난 월을 입력해 주세요 : ");
    	int month = sc.nextInt();
    	System.out.println("키를 입력해  주세요 : ");
    	double height = sc.nextDouble();
    	// int height = sc.nextInt(); 로 했었음. 소숫점 있으니까 더블이 더 낫다!
    	System.out.println("성별을 입력해 주세요 : ");
    	char gender = sc.next().charAt(0);
    	//String gender = sc.next(); 로 했었음. 남 or 여 만 추출하려면 이것보단 charAt 사용이 낫겠다
    	System.out.println("주소를 입력해 주세요 : ");
    	sc.nextLine(); //엔터 제거
    	String adress = sc.nextLine();
    	
    	System.out.println("이름은 " + name + " 입니다.");
    	System.out.println("태어난 월은 " + month + "월 입니다.");
    	System.out.println("키는 " + height + "cm 입니다.");
    	System.out.println("성별은 " + gender + "성 입니다.");
    	System.out.println("사는 곳은 " +adress+ " 입니다.");
    	
    }
}
