//아 뭐가 잘못된건지 모르겠다 다시 해보자ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ 
//뭘 고친건지 모르겠는데 됨

package com.kh.day04.exercise;
/* while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 
-1이 입력되면 입력한 수의 합을 출력하시오.
정수 하나 입력 : 3
정수 하나 입력 : 4
정수 하나 입력 : 7
정수 하나 입력 : -1
입력하신 수의 합은 : 14 */

import java.util.Scanner;

public class Exercise_While3 { 
    public static void main(String[] args) {   	
        //System.out.print("정수를 입력해 주세요."); //-1 전에 체크를 한번 해야하니까 한번 입력을 밖에서 받고
        
    	//int input = sc.nextInt(); //걍 int input = 0;으로 써도 된다.
        int sum = 0;     
        int input = 0;
        while (input != -1) { //num!=1이면 계속 돈다!
        	Scanner sc = new Scanner(System.in);
        	System.out.print("정수를 입력해 주세요."); // 입력값이 -1인지 계속 체크한다
        	input = sc.nextInt();
        	if(input != -1) {
        		sum = sum + input; // -> sum += input        		
        	}
        } 
        /*while(true) {
    		System.out.print("정수 하나 입력 : ");
    		input = sc.nextInt();
    		if(input == -1) break;
    	}*/ 
    	//sum += input;
        System.out.println("입력한 수의 합은 : " + sum);
    }
}
