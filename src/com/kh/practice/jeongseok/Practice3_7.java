package com.kh.practice.jeongseok;
//화씨->섭씨(C=5/9 x (f-32)) /// 소숫점 셋째자리 '반올림'!!
public class Practice3_7 {
    public static void main(String [] args) {
    	int fahrenheit = 100;
    	float celcius = (int)(5/9f * (fahrenheit-32)*100+0.5)/100f;
    	
    	System.out.println("Fahrenheit: "+fahrenheit);
    	System.out.println("Celcius: "+celcius);
    }
}
