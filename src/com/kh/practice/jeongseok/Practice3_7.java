package com.kh.practice.jeongseok;
//화씨->섭씨(C=5/9 x (f-32)) ////와 이거 다시해야함ㅋㅋㅋ
public class Practice3_7 {
    public static void main(String [] args) {
    	int fahrenheit = 100;
    	float celcius = (5 / 9) * (fahrenheit-32);
    	
    	System.out.println("Fahrenheit: "+fahrenheit);
    	System.out.println("Celcius: "+celcius);
    }
}
