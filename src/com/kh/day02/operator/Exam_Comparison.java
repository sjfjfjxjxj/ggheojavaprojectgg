package com.kh.day02.operator;

public class Exam_Comparison {
  public static void main(String[] args) {
	  System.out.println("비교연산자 예제");
	  // 1 < 2, 3 < 2, 1 == 2, 1 != 1
	  // true,  false,  false,  false
	  // 비교연산자: 두 값을 비교하는 연산자, 관계연산자
	  // 비교연산자는 조건을 만족하면 true, 아니면 false를 반환함
	  //규칙! 자료형 변수명 대입연산자 데이터 ;
	  int num1 = 50;
	  int num2 = 30;
	  boolean result = num1 < num2;
	  System.out.println("(num1 < num2)의 결과 : "+result);
	  result = (num1 > num2);
	  System.out.println("(num1 > num2 의 결과 : "+result);
	  result = (num1 == num2);
	  System.out.println("(num1 == num2) 의 결과 : "+result);
	  result = (num1 != num2);
	  System.out.println("(num1 != num2)의 결과 : "+result);
	  //홀짝 판별 프로그램, 짝수란 무엇인가? 에 씀. 예를들어,
	  int num = 2;
	  result = (num % 2 == 0);  //나눴을때 나머지 구하는 연산자 %(모듈러스)
	  System.out.println("짝수인가요? : "+ result);
	 
  }
}
