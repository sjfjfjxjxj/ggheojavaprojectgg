//焼 更亜 設公吉闇走 乞牽畏陥 陥獣 背左切ばばばばばばばばばばばばばばば 
//校 壱庁闇走 乞牽畏澗汽 喫

package com.kh.day04.exercise;
/* while庚聖 戚遂馬食 -1戚 脊径吃 凶猿走 舛呪研 脊径閤壱 
-1戚 脊径鞠檎 脊径廃 呪税 杯聖 窒径馬獣神.
舛呪 馬蟹 脊径 : 3
舛呪 馬蟹 脊径 : 4
舛呪 馬蟹 脊径 : 7
舛呪 馬蟹 脊径 : -1
脊径馬重 呪税 杯精 : 14 */

import java.util.Scanner;

public class Exercise_While3 { 
    public static void main(String[] args) {   	
        //System.out.print("舛呪研 脊径背 爽室推."); //-1 穿拭 端滴研 廃腰 背醤馬艦猿 廃腰 脊径聖 鉱拭辞 閤壱
        
    	//int input = sc.nextInt(); //袷 int input = 0;生稽 潤亀 吉陥.
        int sum = 0;     
        int input = 0;
        while (input != -1) { //num!=1戚檎 域紗 儀陥!
        	Scanner sc = new Scanner(System.in);
        	System.out.print("舛呪研 脊径背 爽室推."); // 脊径葵戚 -1昔走 域紗 端滴廃陥
        	input = sc.nextInt();
        	if(input != -1) {
        		sum = sum + input; // -> sum += input        		
        	}
        } 
        /*while(true) {
    		System.out.print("舛呪 馬蟹 脊径 : ");
    		input = sc.nextInt();
    		if(input == -1) break;
    	}*/ 
    	//sum += input;
        System.out.println("脊径廃 呪税 杯精 : " + sum);
    }
}
