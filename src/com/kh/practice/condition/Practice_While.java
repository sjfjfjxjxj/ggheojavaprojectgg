package com.kh.practice.condition;
//�� �ƴ�
import java.util.Scanner;

/* while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� 
-1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
���� �ϳ� �Է� : 3
���� �ϳ� �Է� : 4
���� �ϳ� �Է� : 7
���� �ϳ� �Է� : -1
�Է��Ͻ� ���� ���� : 14 */
public class Practice_While {
    public static void main(String[] args) {
    	int input = 0;
    	int sum = 0;
    	while (input != -1) {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("�����Է��غ�: ");
    		input = sc.nextInt();
    		if (input != -1) {
    			sum = input + sum;
    		}
    	}
    	System.out.println("���� : " + sum);
    }
}
