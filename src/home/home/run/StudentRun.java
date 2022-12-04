package home.home.run;

import java.util.Scanner;

import home.home.noupdate.StudentFunction;

public class StudentRun {
    public static void main(String[] args){
    	StudentFunction sFunc = new StudentFunction();
    	Scanner sc = new Scanner(System.in);
    	Exit:
    	while(true) {
    		int input = sFunc.printMenu();
    		switch(input) {
    		case 1 : 
    			sFunc.inputScore();  			
    			break; 
    		case 2 : 
    			sFunc.printScore();
    			
    			break;
    		case 3 : 
    			System.out.println("빠2");
    			break Exit;
    		default :
    			System.out.println("1~3 사이 다시입력ㄱ");
    			break;
    		
    		
    		}
    		
    		
    		
    	}
    	
    }
}
