package com.kh.day11.exercise;
//나 이거 못하네
public class Exercise_Wrapper {
    public void parseExample() {
    	String strNum = "221123";
    	String strNum2 = "230502";
    	//두 값을 계산해서(num2-num1 출력하라(결과: 9379)
        //int result = strNum2 - strNum; 을 해야하는거. 그래서 인트로 바까야해
    	int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
    	
    		System.out.println(result); 
    
    }
    
    
    public void dataPartsingExample() {
    	String strData = "13";
    	String strData2 = "23.502";
    	String strData3 = "SPRING";
    	//strData를 byte, short, int, long으로 변환하라
    	byte bNum = Byte.parseByte(strData);
    	short sNum = Short.parseShort(strData);
    	int iNum = Integer.parseInt(strData);
    	long lNum = Long.parseLong(strData);
    	//strData2를 float, double로 변환
    	float fNum = Float.parseFloat(strData2);
    	double dNume = Double.parseDouble(strData2);
    	//strData3을 char로 변환★★
    	char word = strData3.charAt(0/*범위내에서 숫자아무거나써도상관x*/);
    	
    			
    	
    }
}




