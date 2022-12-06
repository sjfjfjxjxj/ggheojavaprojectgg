package com.kh.day10.exercise;

public class GoodCalc2 extends Calculator {
    public static void main(String [] args) {
    	GoodCalc2 calc = new GoodCalc2();
    	int a [] = {1,2,3,5}; 
    	System.out.println("합 : " + calc.add(1, 2));
    	System.out.println("차 : " + calc.substract(1, 2));
    	System.out.println("평균 : " + calc.average(a));
    }

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for (int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/(double)a.length;
	}
}
