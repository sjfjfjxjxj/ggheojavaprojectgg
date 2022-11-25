package com.kh.day02.variable;

public class TestDataType {
  public static void main(String[] args) {
	  //자료형 변수명 대입연산자 데이터 ;
	  //1. 자료형의 종류
	  //ⓐ 정수 int
	  byte bNum = 127; //-128~127
	  short sNum = 32767; //-32768~32767
	  int iNum = 2147483647; //-2147483648~2147483647
	  long lNum = 2147483648l; //접미사 l을 붙여야함
	  short num = 128; //byte 빼곤 다 됨
	  //ⓑ실수
	  float fNum = 22.1123f; //접미사 f를 붙여야 함->귀찮으니까 double 많이씀
	  double dNum = 23.502; //평균 구할때 많이 씀
	  //ⓒ문자
	  char fChar = 'A'; //홑따옴표 안에는 1개의 문자
	  String sChar = "Hello Java"; //쌍따옴표 안에 n개의 문자=문자열
	  //ⓓBoolean형
	  boolean result = false; //1>0, 2<1(비교연산자)의 결과값을 나타내기위한 자료형
	  //ⓔ문자열 String은 참조형. 나중에
	  System.out.println("정수의 값 : "+iNum);
	  System.out.println("정수의 값(9999억) : "+lNum);
	  System.out.println("실수의 값 : "+fNum);
	  System.out.println("실수의 값 : "+dNum);
	  System.out.println("문자의 값 : "+fChar);
	  System.out.println("문자열의 값 : "+sChar);
	  System.out.println("논리의 값 : "+result);
	  
	  fChar = 66;
	  System.out.println("문자에 숫자 : "+fChar);
	  fChar = 75;
	  System.out.println("문자에 숫자 : "+fChar);
	  //ASKII(아스키)코드
	  //->문자(char)는 숫자를 저장할 수 있고 ASKII코드에
	  //매핑되어있는 문자로 출력이 가능하다.
  }
}
