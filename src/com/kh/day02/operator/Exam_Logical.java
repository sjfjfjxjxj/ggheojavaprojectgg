package com.kh.day02.operator;

public class Exam_Logical {
    public static void main(String[] args) {
	  System.out.println("논리연산자 예제");
	  // 남자이면서 평점 4.3이상인 사람->AND
	  // 컴공 또는 경영학과인 사람->OR
	  int num1 = 50;
	  int num2 = 30;
	  boolean result1, result2, result3, result4; //변수의 선언. 초기화는 나중에 해도 돼야
      //num1과 num2가 다르면서 num2가 num1보다 클때
	  result1 = (num1 != num2) && (num2 > num1);
	  System.out.println("result1의 결과값 : "+ result1);
	  result2 = (num1 < num2) || (num1 == num2); //false
	  result3 = (num1 > num2) && (num1 != num2); //true
	  result4 = (num1 > num2) || (num1 == num2); //true
	  System.out.println("result2의 결과값 : "+ result2);
	  System.out.println("result3의 결과값 : "+ result3);
	  System.out.println("result4의 결과값 : "+ result4);
	  System.out.println();
	  System.out.println("논리연산자 예제2");
	  int aNum = 70;
	  int bNum = 55;
	  result1 = (aNum == bNum) || (aNum++ < 100);  // true (71, 55)
	  result2 = (aNum < bNum) && (--bNum < 55); // false (71, 55) ->뒤엔 연산 안됨 
	  result3 = (aNum != bNum) && (bNum-- < aNum++); // true (72, 54)
	  result4 = (aNum++ != bNum) || (bNum++ >= 85); // true (73, 54)->뒤엔 연산 안됨
	  System.out.println("result1의 결과값 : "+ result1);
	  System.out.println("result2의 결과값 : "+ result2);
	  System.out.println("result3의 결과값 : "+ result3);
	  System.out.println("result4의 결과값 : "+ result4);
	  System.out.println("aNum의 값 : " + aNum +" , bNum의 값 : " + bNum);
	  
	 
  }
}
