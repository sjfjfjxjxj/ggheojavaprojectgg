package com.kh.day04.exercise;

public class Exercise_PrintSample {
    public static void main(String[] args) {
    	// System.out.println���� ���� + ���ڿ� -> ���ڿ�
    	System.out.println(1 + "1"); //���: 11(���ȵ�)
    	// ���� + ���� -> ����
    	System.out.println('1' + '1'); //���: 98(11�� ���ڿ��̴ϱ� ���ڷ� ������ ��)
    	                               //1=�ƽ�Ű�ڵ�ǥ���� 49 �ش�
    	//���� + ���� + ���ڿ�+ ���� -> ���ڿ�. �߰��� ���ڿ� �ϳ��� ������ ���������� ���ڿ���
    	System.out.println(10 + 20 + "Hello" + 10); //���: 30Hello10

    	//printf�� �������!(println/print -> �ٹٲ� ����
    	System.out.print("���� �Է� : "); //�ٷ� ���� �Է� ����
    	System.out.println("���� �Է� : "); //�� �ٲٰ� �Է� ����
    	System.out.printf("���� ��� : %d \n", 1); //1�̶�� ���� %d�� ���� �������:1�� ��µ�
    	//\n: �ٹٲ��ּ���
    	System.out.printf("���ڿ� ��� : %s", "Hello World"); //���ڿ��� s!
    }
}

//��Ŭ�������� �ٴ����� �����ϴ� ���: ctrl + d