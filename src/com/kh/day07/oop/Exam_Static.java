package com.kh.day07.oop;
//������۾� = ����� = �̹� ����� �ִ¾�
class StaticSample{ 
	public int num; 
	public void sampleMethod() {
		input = 20;
	}
	public void goodMethod() {
		input = 30;
	}
	
	public static int input; //static���� input�� �Ҵ���־ ���ʿ��� input �ᵵ ���� �ȳ�
	public static void originMethod() {
		input = 5;
	}
}

public class Exam_Static {
    public static void main(String[] args) {
    //	new StaticSample().num = 10;
    	StaticSample.input = 10; 
    	
    	StaticSample s1;
    	s1 = new StaticSample();
    	System.out.println(s1.input); //10���� �ʱ�ȭ�ؼ� 10 ���
    	s1.originMethod(); // static�����߱⶧���� s1�̶�� ��ü�� �� �θ��� StaticSample.originMethod();�� �ٷ� �ᵵ ��
    	System.out.println(s1.input); //�������޼ҵ� �ҷ��� input�� 5 �ҷ�����
    	
    	int value = Math.abs(-5); //abs: ���밪 ���ϴ°�
    	System.out.println("�� : " + value);
    }
}
