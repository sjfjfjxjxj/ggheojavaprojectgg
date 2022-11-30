package com.kh.day06.array;
//2차원 배열 배우면 영화좌석표를 만들수있댘ㅋ
public class Exam_DimArray {
    public static void main(String [] args) {
    	int [][] arrs = new int[4][4]; //할당! = 주소생성. arrs.length=앞에거  arrs[0].length=뒤에거
    	int k = 1;
    	System.out.println("행의 크기(앞의 크기=세로크기) : " + arrs.length);
    	System.out.println("열의 크기(뒤의 크기=가로크기) : " + arrs[0].length);
    //	arrs[0][0] = 1; //주소지에 데이터 생성!
    //	arrs[0][1] = 2; //근데 하나하나쓰기 너무 힘들다! 포문을 이용하자!
    	for(int i =0; i < arrs.length; i++) {
    		for(int j = 0; j < arrs[i].length; j++) {
    			arrs[i][j] = k;
    			k++;
    		}
    	}
    	for(int i = 0; i < arrs.length; i++) {
    		for(int j = 0; j < arrs[i].length; j++) {
    			
    			System.out.printf("%2d",arrs[i][j]); //줄맞출라고 printf씀
    		}
    		System.out.println(); // 개행 안하면 한줄로 열여섯개 나옴
    	}
    }
}
