package com.kh.day05.exercise;
//{2,5,4,1,3}�� �ִ�.

//���������� �غ���
//i=1; -> '2,5',4,1,3   -----�Ǿ� 1�� ��
//i=2; -> 2,'4,5',1,3   '2,4',5,1,3 -----��-����° ù-�ι�°  2�� ��
//i=3; -> 2,4,'1,5',3    2,'1,4',5,3    '1,2',4,5,3 ------���� �μ� ù�� 3�� ��
//i=4; -> 1,2,4,'3,5'   1,2,'3,4',5  1,'2,3',4,5    '1,2',3,4,5 -----4�� ��

//�׷��ϱ� i=0�϶�----- j=i+1�� �� ..... 
//i=array.length-1�϶� j= array.length�� ����
public class SortSortSort {
	public static void main(String[] args) {
		int[] arrs = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length - 1; j++) {
				if (arrs[j] > arrs[j + 1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arrs.length; i++) {
		System.out.print(arrs[i] + " ");
		}
	}
}
