package com.kh.day07.oop;

public class Circle {//Ŭ���� ����(class Circle), Ŭ���� ���� ���� public
   public int radius;//��������=Ŭ�������� //���������� public
   public String name = "��" ;//�� ������ ��Ŭ Ŭ������ �ʵ��� ��

   //��Ŭ�������̶� �̸� ���� �޼ҵ�=������
   //��ü�� �����ϰ� �ʵ带 �ʱ�ȭ��
   public Circle() {//�ʵ带 �ʱ�ȭ�ϴ� ����. ���� ����. ���������� public
	   this.radius = 1;//�ʱ�ȭ ���� �̷��� �ؾ��ϴµ�
	   //this.name = "��";  <-������� �������ؼ� �� ���ʿ� �ʱ�ȭ �ص� �ǰԲ� �ٲ�
   }   //���ȯ���� �ִ� �޼ҵ�(��ȯ����=return)
   public double getArea() {//����Ÿ���� �����̴�! ���̵尡 �ƴϴ�->��ȯ��return �־���Ѵ�
	   return 3.14*radius*radius; //3.14���� ���ϰŴϱ� double��
       //double area = 3.14*radius*radius;
	   //return area; �̰� ������ �� ���ٿ� ���°�(���� ����� ����)
   }
}


