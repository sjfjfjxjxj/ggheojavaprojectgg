package com.kh.day10.wrapperex;

public class Exam_Wrapper {
    public static void main(String [] args) {
    	//Wrapper��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
    	//Integer i = new Integer(1123); //Ŭ����!
    	Integer i = Integer.valueOf(1123); // ��ü �θ����ʰ� �����ִ� ����ƽ�޼ҵ屸��!
    	int e = i.intValue(); //��ü ���� ����ϴٰ�
    	//�⺻�����ε� ��ȯ ����
    	Integer f = null;
    	//Type mismatch: cannot convert from null to int ��
    	//int m = null;
    	
    	Character c = Character.valueOf('c'); //��ü
    	char che = c.charValue(); //�⺻��
    	
    	Double d = Double.valueOf(3.14); //��ü
    	double dd = d.doubleValue(); //�⺻��
    	
    	//���ڿ��� �⺻ ������Ÿ��(int, boolean, double)���� ��ȯ
    	int num = Integer.parseInt("123"); //����Ϸ��� ���� �ٲ�
    	int result = num + 1; 
    	System.out.println("��ȯ�� �� : "+num);
    	boolean isYn = Boolean.parseBoolean("true");
    	double fNum = Double.parseDouble("3.14");
    	
    	//�⺻ ������Ÿ��(int, double, char)�� ���ڿ��� ��ȯ
    	String data1 = Integer.toBinaryString(123);
    	String data2 = Integer.toHexString(123); // 16���� 7b�� ��ȯ
    	String data3 = Double.toString(3.14);
    	String data4 = Character.toString('a');
    	String data5 = Boolean.toString(true);
    }
}
