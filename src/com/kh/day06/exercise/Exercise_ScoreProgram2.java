package com.kh.day06.exercise;
//���������α׷����� �غ���. ��ü�������� ���� ����,,
import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	static int korean = 0; //������ �ٷ� ����ϱ����� static ����
	static int english = 0;
	static int math = 0; //��������(=Ŭ��������) ����
    public static void main(String [] args) {
    	Scanner sc = new Scanner(System.in);
        TERMINATE:
    	while(true) {
    		printMenu(); //���θ޴��� ����غ���
    		int choice = sc.nextInt();
    		switch(choice) {
    		case 1 : 
    			inputScore();
    			break;
    		case 2 : 
    			printScore();
    			break;
    		case 3 : 
    			goodByeMsg();
    			break TERMINATE;
    		default : 
    			printException();
    			break;
    		}
    	}//static�� �ʹ� ���� ���� �뷮 Ŀ���� �۵� �� �ȵȴ�.
    }   //���ο��� �ٷ� ����� ����ƽ�� �ٿ����Ѵ�. �� �Ⱥٿ��� �ǰԲ�
    public static void printMenu() {
    	System.out.println("===== ���� �޴� =====");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
    }
    public static void inputScore() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("=====�����Է�=====");
		System.out.print("����: ");
		korean = sc.nextInt();
		System.out.print("����: ");
		english = sc.nextInt();
		System.out.print("����: ");
		math = sc.nextInt();
    }
    public static void printScore() {
    	int sum = korean + english + math;
    	System.out.println("==== ������� ====");
		System.out.println("����: " + korean);
		System.out.println("����: " + english);
		System.out.println("����: " + math);
		System.out.println("����: " + sum);
		System.out.printf("���: : %.2f\n", (double)sum / 3);
    }
    public static void goodByeMsg() {
    	System.out.println("Good Bye~");		
    }
    public static void printException() {
    	System.out.println("1 ~ 3 ������ ���ڸ� �Է��ϼ����Ф�");
    }
}
