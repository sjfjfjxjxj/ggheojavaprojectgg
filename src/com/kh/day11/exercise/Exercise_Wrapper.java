package com.kh.day11.exercise;
//�� �̰� ���ϳ�
public class Exercise_Wrapper {
    public void parseExample() {
    	String strNum = "221123";
    	String strNum2 = "230502";
    	//�� ���� ����ؼ�(num2-num1 ����϶�(���: 9379)
        //int result = strNum2 - strNum; �� �ؾ��ϴ°�. �׷��� ��Ʈ�� �ٱ����
    	int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
    	
    		System.out.println(result); 
    
    }
    
    
    public void dataPartsingExample() {
    	String strData = "13";
    	String strData2 = "23.502";
    	String strData3 = "SPRING";
    	//strData�� byte, short, int, long���� ��ȯ�϶�
    	byte bNum = Byte.parseByte(strData);
    	short sNum = Short.parseShort(strData);
    	int iNum = Integer.parseInt(strData);
    	long lNum = Long.parseLong(strData);
    	//strData2�� float, double�� ��ȯ
    	float fNum = Float.parseFloat(strData2);
    	double dNume = Double.parseDouble(strData2);
    	//strData3�� char�� ��ȯ�ڡ�
    	char word = strData3.charAt(0/*���������� ���ھƹ��ų��ᵵ���x*/);
    	
    			
    	
    }
}




