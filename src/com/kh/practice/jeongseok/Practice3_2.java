package com.kh.practice.jeongseok;

public class Practice3_2 {
    public static void main(String[] args) {
    	int numOfApples = 123; //�������
    	int sizeOfBucket = 10; //�ѹٱ��Ͽ� �������ִ� ��� ����
        int numOfBucket = 0;
    	if (numOfApples%sizeOfBucket != 0) {
    		numOfBucket = (numOfApples/sizeOfBucket+1); //��� ��� ��µ� �ʿ��� �ٱ��ϼ�
    		
    	} else {numOfBucket = (numOfApples/sizeOfBucket);
    			}
    	
    	System.out.println("�ʿ��� �ٱ��� �� : " + numOfBucket);
    }
}//�ش� p.173�ε� ���� ���Ҹ��� �𸣰ڴ�

//int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
//�̷��� ������. ???�̰Ը��
//
