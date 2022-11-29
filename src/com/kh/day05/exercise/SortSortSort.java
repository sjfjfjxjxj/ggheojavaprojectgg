package com.kh.day05.exercise;
//{2,5,4,1,3}이 있다.

//삽입정렬을 해보자
//i=1; -> '2,5',4,1,3   -----맨앞 1번 비교
//i=2; -> 2,'4,5',1,3   '2,4',5,1,3 -----두-세번째 첫-두번째  2번 비교
//i=3; -> 2,4,'1,5',3    2,'1,4',5,3    '1,2',4,5,3 ------세넷 두셋 첫둘 3번 비교
//i=4; -> 1,2,4,'3,5'   1,2,'3,4',5  1,'2,3',4,5    '1,2',3,4,5 -----4번 비교

//그러니까 i=0일때----- j=i+1번 비교 ..... 
//i=array.length-1일때 j= array.length번 비교함
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
