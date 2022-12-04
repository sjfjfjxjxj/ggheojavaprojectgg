package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
    Student [] students; //�迭����
    
    public StudentFunction() { 
    	students = new Student[3];//�����ڿ��� �ʱ�ȭ���ֱ� //�迭�Ҵ�
    }
    
    public int printMenu() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----�л� ���� Ȯ�� ���α׷�-----");
    	System.out.println("1. �л� �����Է�");
        System.out.println("2. �л� ���� ���");
        System.out.println("3. ���� ���� Ȯ��");
        System.out.println("4. ���α׷� ����");
        System.out.println("�޴� �Է� : ");
        int menu = sc.nextInt(); //�޴� ������ ���θ� �����. �׷��� ������
        return menu;
    }
    
    public void inputScore() {
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0; i < students.length; i++) { //3�� �����Ŵϱ�
    		System.out.println("-----" + (i+1) + "��° �л� ���� �Է�-----");//index�� 1���ʹϱ�
    		System.out.print("�л� �̸� �Է�: ");
    		String name = sc.next();
    		System.out.print("1�� ���� �Է�: ");
    		int firstScore = sc.nextInt();
    		System.out.print("2�� ���� �Է�: ");
    		int secondScore = sc.nextInt();
    		students[i] = new Student(); //�迭�� ������ �ϳ��ϳ� ����
    		students[i].setName(name);
    		students[i].setFirstScore(firstScore);
    		students[i].setSecondScore(secondScore);
    	}
    }
    
    public void printScore() {
    	for(int i = 0; i < students.length; i++){
    		System.out.println("-----" + (i+1) + "��° �л� ���� ���-----");
    		System.out.println(students[i].getName()+"�л��� ������");
    		System.out.println("1������: "+students[i].getFirstScore() +" / "+ "2������: "+students[i].getSecondScore() + "�Դϴ�");
    	}               //���ʿ��� setter ���� ���ȵǳ�??
    }
    
    public void checkPass() {
    	/*
    	 * 0. ���� ���δ� ��������. 
    	 * 1. ������ ������ 40�� �̸��� ��� ���� ����� �� students[i]getscore<40
    	 * 2. 1�� 2�� ���� ����� 60 �Ѿ�� pass
    	 * 3. 1�� 2�� ���� ����� 60 �̸��� ��� 60 �̸� ���� ���ؼ��� ����.
    	 */
//    	for(int i = 0; i<students.length;  i++) {
//    		if (students[i].getFirstScore()< 40 && students[i].getSecondScore()<40) {
//    			System.out.println("��ü ���� ����Դϴ�");
//    		} else if (students[i].getFirstScore()+students[i].getSecondScore()/students.length<60) {
//    			//60 �ȵǴ� ���� ����
//    			if(students[i]getFirstScore()<60) {
//    				System.out.println("1�� ���� ���� ����Դϴ�.");
//    			}else {
//    				System.out.println("2�� ���� ���� ����Դϴ�.");
//    			}
//    			
//    			
//    		} else {
//    			System.out.println("������Ͽ����ϴ�");
//    		}
//    		
//    	}
//    	int num1 = 1;
//    	int num2 = 2;
//    	int avg = (num1+num2) / (double)2;
//    	if(avg >=60) {
//    		1. ���� num<40 ���� �¸� ����
//    		2. �Ѵ� num >40�̸� ���� ���
//    	} else {
//    		1. num1<40 || num2< 40 - ���񸶴� ����
//    		2. num < 60 �¸� ����
//    	}
    	//�̷��� �ص���
//    	if(num1 < 40) {
//    		System.out.println("1�� ���� ���� ������Դϴ�.");
//    	}else if(num2 < 40) {
//    		System.out.println("2�� ���� ���� ������Դϴ�.");
//    	}else if(avg >= 60){
//    		System.out.println("����Ͽ����ϴ�.");
//    	}else {
//    		if(num1 < 60) {
//    			System.out.println("1�� ���� ���� ������Դϴ�.");
//    		}else if(num2 < 60) {
//    			System.out.println("2�� ���� ���� ������Դϴ�.");
//    		}
//    	}

    	for(int i = 0; i < students.length; i++) {
    		int num1 = students[i].getFirstScore();
    		int num2 = students[i].getSecondScore();
    		double avg = (num1+num2) / (double)2;
    		System.out.println((i+1) + "��°," + students[i].getName() + " �л��� Ȯ�� ���");
    		if(avg >= 60) {
    			//���ܹ߻�
    			//1��-20 2��-100 / 1��-100 2��-20...
    			if(num1 < 40) {
    				System.out.println("1�� ���� ���� ����Դϴ�.");
    			}else if(num2 < 40) {
    				System.out.println("2�� ���� ���� ����Դϴ�.");
    			}else {
    				System.out.println("����Ͽ����ϴ�.");
    			}
    		}else {
    			//������ѻ��: p-f / f-p / f-f
    			if(num1 < 60) {
    				System.out.println("1������ ���� ������Դϴ�.");
    			}
                if(num2 < 60) {//else�� ���� üũ �ѹ� �ϰ� ������ �ȳѾ. ���� üũ�Ϸ���!
    				System.out.println("2�� ���� ���� ������Դϴ�.");
    			}
    		}
    		
    		
    	}
    	
    	
    }
    
    public void printGoodBye() {}
    
    public void printException() {}
}













