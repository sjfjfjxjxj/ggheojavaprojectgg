//�� ���� �߸��Ȱ��� �𸣰ڴ� �ٽ� �غ��ڤФФФФФФФФФФФФФФ� 
//�� ��ģ���� �𸣰ڴµ� ��

package com.kh.day04.exercise;
/* while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� 
-1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
���� �ϳ� �Է� : 3
���� �ϳ� �Է� : 4
���� �ϳ� �Է� : 7
���� �ϳ� �Է� : -1
�Է��Ͻ� ���� ���� : 14 */

import java.util.Scanner;

public class Exercise_While3 { 
    public static void main(String[] args) {   	
        //System.out.print("������ �Է��� �ּ���."); //-1 ���� üũ�� �ѹ� �ؾ��ϴϱ� �ѹ� �Է��� �ۿ��� �ް�
        
    	//int input = sc.nextInt(); //�� int input = 0;���� �ᵵ �ȴ�.
        int sum = 0;     
        int input = 0;
        while (input != -1) { //num!=1�̸� ��� ����!
        	Scanner sc = new Scanner(System.in);
        	System.out.print("������ �Է��� �ּ���."); // �Է°��� -1���� ��� üũ�Ѵ�
        	input = sc.nextInt();
        	if(input != -1) {
        		sum = sum + input; // -> sum += input        		
        	}
        } 
        /*while(true) {
    		System.out.print("���� �ϳ� �Է� : ");
    		input = sc.nextInt();
    		if(input == -1) break;
    	}*/ 
    	//sum += input;
        System.out.println("�Է��� ���� ���� : " + sum);
    }
}
