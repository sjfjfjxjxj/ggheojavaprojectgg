package com.kh.day06.array;
//2���� �迭 ���� ��ȭ�¼�ǥ�� ������ֈ���
public class Exam_DimArray {
    public static void main(String [] args) {
    	int [][] arrs = new int[4][4]; //�Ҵ�! = �ּһ���. arrs.length=�տ���  arrs[0].length=�ڿ���
    	int k = 1;
    	System.out.println("���� ũ��(���� ũ��=����ũ��) : " + arrs.length);
    	System.out.println("���� ũ��(���� ũ��=����ũ��) : " + arrs[0].length);
    //	arrs[0][0] = 1; //�ּ����� ������ ����!
    //	arrs[0][1] = 2; //�ٵ� �ϳ��ϳ����� �ʹ� �����! ������ �̿�����!
    	for(int i =0; i < arrs.length; i++) {
    		for(int j = 0; j < arrs[i].length; j++) {
    			arrs[i][j] = k;
    			k++;
    		}
    	}
    	for(int i = 0; i < arrs.length; i++) {
    		for(int j = 0; j < arrs[i].length; j++) {
    			
    			System.out.printf("%2d",arrs[i][j]); //�ٸ����� printf��
    		}
    		System.out.println(); // ���� ���ϸ� ���ٷ� �������� ����
    	}
    }
}
