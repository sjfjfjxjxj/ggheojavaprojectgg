package com.kh.day05.array;

public class Exam_SortBubble {
    public static void main(String[] args) {
    	//���� �˰��� 3. ��������
    	//������ �ΰ��� ���Ҹ� �˻��Ͽ� ����
    	//���� ����. �̹� ���ĵ� �����͸� �����ҋ� ���� ����
    	//�ٸ� ���Ŀ� ���� ���� �ӵ��� ������ �������� �����Ҷ� ���� ����
    	//{2, 5, 4, 1, 3} ---- 5��¥�� �迭�϶�
    	// i = 0�϶� ---- �׹� �� ----������ 5(�ǿ�����) ����
    	// '2,5'4,1,3 -> 2,'4,5',1,3 -> 2,4,'1,5,3 -> 2,4,1,'3,5'
    	// i = 1�϶� ---- ���� �� ----������ 4,5(�����ʿ��� �ΰ�) ����
    	// '2,4',1,3,5 ->  2,'1,4',3,5 -> 2,1,'3,4',5
    	// i = 2�϶� ---- �ι� ��
    	// '1,2',3,4,5 -> 1,'2,3',4,5
    	// i = 3�϶� ---- �ѹ� �� ~��~
        int [] arrs = {2, 5, 4, 1, 3};
//        for(int i = 0; i < arrs.length-1; i++) {
//        	for(int j = arrs.length-1; j>=1; j--) { //�̷��� �����ϸ� �� �����U���� 
//        		if(arrs[j-1] > arrs[j]) {           //�� �����ؼ� ���ʿ� �߸��Ȱ�
//        			int temp = arrs[j];
//        			arrs[j] = arrs[j-1];
//        			arrs[j-1] = temp;
//        		}
//        	}
//        }
        for(int i = 0; i < arrs.length-1; i++) {
        	for(int j = 0; j < (arrs.length-1)-i; j++) {
        		if(arrs[j]>arrs[j+1]) {
        			int temp = arrs[j+1];
        			arrs[j+1] = arrs[j];
        			arrs[j] = temp;
        		}
        	}
        }
        for(int i = 0; i < arrs.length; i++) {
        	System.out.print(arrs[i] + " ");
        }
    }
}
