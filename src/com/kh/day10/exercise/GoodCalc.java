package com.kh.day10.exercise;
//이거 다시 해보기
public class GoodCalc extends Calculator{

	public static void main(String [] args) {
		GoodCalc calc = new GoodCalc(); //객체 이렇게 안만들고 바로 쓰려면 메소드마다 static 붙여주면 됨
//        int [] a = new int[5];할당
//        a[0] =a[1] =a[2] =a[3] =a[4] =1;과 초기화는 같이 할수있다▽
		int [] a = {1,2,3,4,7};
		System.out.println("합 : " + calc.add(1, 2));
		System.out.println("차 : " + calc.substract(1, 2));
		System.out.println("평균 : " + calc.average(a));
		
	}

	@Override
	public int add(int a, int b) {
		int result = a + b;		
		return result; //변수 사용한 리턴
	}

	@Override
	public int substract(int a, int b) {
		return a - b; // 변수 없이 리턴
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			 sum += a[i];
		}
		return (double)sum/a.length;
		//혹은 sum/(double)a.length; 
		// (double)(sum/a.length); 이건 안됑
	}
}
