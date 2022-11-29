package com.kh.day05.exercise;

public class Again_ArraySort {
    public static void main(String[] args) {
    	int num1 = 11;
    	int num2 = 23;
    	System.out.println("num1 : " + num1 + ", num2 : " + num2);
    	int temp = num1; //temp=11
    	num1 = num2; // num1 = 23
    	num2 = temp; // num2 = 11
    	System.out.println("num1 : " + num1 + ", num2 : " + num2);
    
    	int [] nums = {2, 1, 3};
    	temp = nums[0]; // num0= 2, temp=2
    	nums[0] = nums[1]; //num0=1, num1=1
    	nums[1] = temp;
    	for(int i = 0; i<nums.length; i++) {
    		System.out.println(nums[i] + " ");
    	}
    }
}
