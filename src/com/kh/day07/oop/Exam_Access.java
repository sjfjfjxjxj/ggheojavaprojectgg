package com.kh.day07.oop;

class Sample{  //����Ʈ Ŭ���� �ϳ� ���巶��!
	public int a;
	private int b;
	int c;
}
          //static: ���ⰰ�� ��.. ���ʿ� �����ߴ���ó�� Ŭ������ �� �Ⱥ��̰� ����Ҽ� �ִ�
public class Exam_Access {
    public static void main(String [] args) {
    	Sample aClass = new Sample();
    	aClass.a = 10; //public�̶� ���ٰ���.
    //	aClass.b = 10; //is not visible. private�̶�
    	aClass.c = 10; // ���ٰ���. defaultfktj
    }
}
