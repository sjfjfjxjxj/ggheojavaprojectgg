package com.kh.day07.oop;

public class Rectangle { //Ŭ��������, ����������: public
	//�̺κ��� �ʵ�
    public int width; //�ʺ�, ����������: public
    public int height;  //����, ����������: public
    
    //�������� ����: ��ü ����, ��ü �ʱ�ȭ(�ʵ��ʱ�ȭ)
    //�̰Ŵ� �޼ҵ�
    public Rectangle() {} //������. ��������., ����������: public, ��ȯ�� ����!
   
          //�Ű����� �ִ� ������(=���ް��� ���� �� �ִ� ������)
        public Rectangle(int width, int height) {
        	this.width = width;
        	this.height = height;   //(�̰� rectRunŬ����)
        }
    
          //��ȯ���� �ִ� �޼ҵ�
        public int getArea() {
    	int area = width*height;
    	return area; //getArea�� ȣ���� ������ ������!
    }  //(�̰� run Ŭ����)
    
    
}
