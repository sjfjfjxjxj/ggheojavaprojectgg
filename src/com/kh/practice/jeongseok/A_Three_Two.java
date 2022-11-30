package com.kh.practice.jeongseok;

public class A_Three_Two {
    public static void main(String[] args) {
    	int numOfApples = 123; //사과개수
    	int sizeOfBucket = 10; //한바구니에 담을수있는 사과 개수
        int numOfBucket = 0;
    	if (numOfApples%sizeOfBucket != 0) {
    		numOfBucket = (numOfApples/sizeOfBucket+1); //모든 사과 담는데 필요한 바구니수
    		
    	} else {numOfBucket = (numOfApples/sizeOfBucket);
    			}
    	
    	System.out.println("필요한 바구니 수 : " + numOfBucket);
    }
}//해답 p.173인디 답이 뭔소린지 모르겠다

//int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
//이렇게 한줄임. ???이게모람
//
