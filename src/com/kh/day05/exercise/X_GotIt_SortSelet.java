package com.kh.day05.exercise;

public class X_GotIt_SortSelet {
    public static void main(String[] args) {
    	//��������
    	//�迭 ���� �˻�->�ּҰ� ��� �ڸ��ٲ�->���ʺ��� ä��
    	//i=0; �迭�ȿ��� ���� �տ� ��(j=arrs[i+1])�� ���� ���� �� ã�Ƽ� �ڸ��ٲ�
    	//i=1; �ι�° �ְ� ���� ������ ã�Ƽ� �ڸ��ٲ�(j=arrs[i+1])
    	//i=2; ����°��
    	//i=3; �׹�°�ְ�
    	//{2,5,4,1,3}-ù�������{1,5,4,2,3}-{1,2,4,5,3}-{1,2,3,5,4}-4��°���{1,2,3,4,5}
    	//
    	int [] arrs = {2, 5, 4, 1, 3};
    	int min;
    	for(int i = 0; i < arrs.length; i++) {
    		min = i; //���� �տ��� i�� �ʱ�ȭ
    		for(int j = i+1; j < arrs.length; j++ ) {
    			if(arrs[min] > arrs[j]) { //(�迭�����κ��ؼ�)�� �տ� �ְ� j�ڸ��ֺ��� ũ��
    				min = j; //�Ǿտ� ���ڸ��� j�����ܳ���
    			}
    		}
    		int temp = arrs[min]; //�̴ϸ� �� Ȯ�������ϱ� ���ʰ� ���Ҿ������ temp�� ����
    		arrs[min] = arrs[i]; //�״��� �ڸ� ���� �ٽ� �̴ϸذ� �ٲ� 
    		arrs[i] = temp; // �׸��� ���� i�ڸ������� ��ó�� temp�� ����
    	}
    	for(int i = 0; i < arrs.length; i++) {   //�׷��� i0~i3 ���� ���� ���ʴ�� ���
    		System.out.println(arrs[i] + " ");
    	}
    }
}
