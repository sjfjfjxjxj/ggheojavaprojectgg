package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;//oop라는 패키지 안에 있는건 접근제한자 없으면(default) 쓸수있다
import com.kh.day07.oop.Rectangle;

public class run {
    public static void main(String [] args) {
    	Exercise_Lotto exLotto = new Exercise_Lotto(); //new를 붙이면 메모리 하나 할당해서 변수한테 주는거다
    	exLotto.lottoProgram();
    	                    //↓생성자!(필드값초기화역할)
    //	Person person = new Person();
    //	person.eat();    //참조변수.멤버
    //	person.sleep();    //주소를저장하는변수.멤버
    //	person.speak();  //레퍼런스변수.멤버
    //	person.walking();  //객체레퍼런스.멤버
    	//person.name = "일용자";
    //	person.jobName = "의사";
    	
    	Scanner sc = new Scanner(System.in);
  //↓左레퍼런스(참조)변수선언/주소가 저장되는 변수
    	Rectangle rect = new Rectangle(); //←右객체생성, 반드시 new 키워드 이용
    	                                  // new는 객체의 생성자 호출
    	System.out.print("너비를 입력해주세요 : ");
    	//객체의 멤버 접근(멤버 종류: ⓐ멤버변수 ⓑ멤버메소드)
    	//인스턴스(Rectangle 클래스의 객체)
    	rect.width = sc.nextInt(); //너비 받아서 저장!  //객체의 멤버접근은 .으로 한다
    	System.out.print("높이를 입력해주세요 : ");
        rect.height = sc.nextInt(); //높이 받아서 저장!
        //↑멤버 변수 접근
      	int result = rect.getArea(); //겟에어리어가 데이터 받아서 리턴!
      	//↑멤버 메소드 접근
    	System.out.println("사각형의 면적은 : " + result);
    }
}
