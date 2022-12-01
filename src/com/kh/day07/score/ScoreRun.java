package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
    public static void main(String [] args) {
    //	Scanner sc = new Scanner(System.in);
    	ScoreFunction sFunc = new ScoreFunction();
    	//ScoreFunction을 while문 안으로 넣으면 출력 후에 다시 초기화돼서 값이 저장이 안됨
    	ByeBye:
    	while(true) {
    	//	ScoreFunction.printMenu();
    		int choice =sFunc.printMenu();
    		
    		
    		switch (choice) {
    		case 1 :
    			sFunc.inputScore();
    			break;
    		case 2 :
    			sFunc.printScore();
    			break;
    		case 3 : 
    			sFunc.goodByeMsg();
    			break ByeBye;
    		default :
    			sFunc.exceptionMse();
    			break;
    		}
    		
    		
    		
    		
    		
    	}
    }
}
