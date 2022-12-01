package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice1() {

    //	for(;;)
    	while(true) {
    		try {
    			Scanner sc = new Scanner(System.in);
    			System.out.print("���� �ϳ� �Է�: ");
    			int num1 = sc.nextInt();
    			System.out.print("���� �ϳ� �� �Է�: ");
    			int num2 = sc.nextInt();
    			System.out.println("����������^^");
    			int result = num1 / num2;
    			System.out.println("���� " + result + "�Դϴ�~");
    			break; //����� ������ �ݺ� �ȵǰ� 0 �Է��ϸ� �ݺ��ǰ��ϴ� �극��
    		} catch(ArithmeticException e){
    			System.out.println("0 �ȵ�. �ٽ� �Է� �ٶ���: ");   		
    	}
    	}
    }
    
	public void practice2() {
		//���� 3���� �Է��ϼ���
		//0>>5
		//1>>R
		//������ �ƴմϴ�. �ٽ� �Է��ϼ���!
		//1>>4
		//2>>6
		//���� 15
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
		System.out.println("���� ���� �Է��ϼ��� : ");
        for(int i = 0; i < 3; i++) {
        	System.out.print(i + " >>");
        	try {
        		num = sc.nextInt();
        	}catch(InputMismatchException e) {
        	      System.out.println("���� �ƴմϴ�. �ٽ� �Է��ϼ�: ");	
        	      sc.next(); //�Է��� �̻��ѱ��� ����
        	      i--; //�̰� �־�� �߸��Է��� ���� �Ȱ��� i�� ���� ���� ������ �����ϱ�!
        	      continue; //�̰� ������ ��� ���ع���. �߸��Է������� sum += num; ��ŵ�ϰ� �ϱ�
        	} //[��Ƽ�� = �� �ؿ��� �������� ������!] �� ��
        	sum += num;
        }
        System.out.println("���� " + sum);		
		
		
	}
}
