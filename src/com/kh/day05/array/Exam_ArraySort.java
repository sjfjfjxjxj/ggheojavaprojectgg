package com.kh.day05.array;
//�ѹ�������
public class Exam_ArraySort {
    public static void main(String[] args) {
    	int num1 = 11;
    	int num2 = 23;
    	System.out.println("num1 : " + num1 + ", num2 : " + num2);
    	int temp = num1; 
    	//num1 �ʱⰪ�� temp�� ������ �ϴ� �ؾ���. �� �� ���� �ι�°��num2 ��°� 23
    	num1 = num2;
    	num2 = temp;
    	System.out.println("num1 : " + num1 + ", num2 : " +num2);
    	
    	int [] nums = {2, 1, 3};
   // 	temp = nums[0];
   // 	nums[0]= nums[1];
   // 	nums[1]=temp;
   // 	for(int i = 0; i<nums.length; i++) {
   //		System.out.print(nums[i] + " ");
   // 	}
        temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        for(int i = 0; i < nums.length; i++) {
        	System.out.print(nums[i] + " ");
        }
    }
}
