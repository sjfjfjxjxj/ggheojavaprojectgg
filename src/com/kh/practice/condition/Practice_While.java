package com.kh.practice.condition;
//아 됐다
import java.util.Scanner;

/* while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 
-1이 입력되면 입력한 수의 합을 출력하시오.
정수 하나 입력 : 3
정수 하나 입력 : 4
정수 하나 입력 : 7
정수 하나 입력 : -1
입력하신 수의 합은 : 14 */
public class Practice_While {
    public static void main(String[] args) {
    	int input = 0;
    	int sum = 0;
    	while (input != -1) {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("정수입력해봐: ");
    		input = sc.nextInt();
    		if (input != -1) {
    			sum = input + sum;
    		}
    	}
    	System.out.println("합은 : " + sum);
    }
}
