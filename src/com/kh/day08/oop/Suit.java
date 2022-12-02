package com.kh.day08.oop;
 //Suit s = new Suit(100);�� �����Ѵٸ�::
public class Suit {
    private int size;
    private String brand;
    private int price;
    
    public Suit(int size) { //��->100�� �Ѿ�ͼ� size=100
    	this(size, "Hazzys"); //������ ȣ��(this�� �����ϱ� ������ ȣ�� line 12��
    	System.out.println("��Suit(int) ȣ��!");
    }
    public Suit(int size, String brand) { //100, ������ ���� �Ѿ�´�
    	this(size, brand, 100000); //100, ������, 100000 (this�ϱ� �� ȣ��)
    	System.out.println("��Suit(int, String) ȣ��! " + size + brand);
    }
    public Suit(int size, String brand, int price) {//100, ������, 100000
    	this.size = size; //�� ���� �ʱ�ȭ����
    	this.brand = brand;
    	this.price = price;
    	System.out.println("��Suit(int,String,int) ȣ��! " + size + brand + price); //�갡 ȣ��
    }
}

//����! 
//this(�Ű�����); �䷱ �ڵ�� () �� ���� ����Ű�� �ָ� �� �޼ҵ忡�� ȣ����.
//�� �� �޼ҵ尡 �� ����ž� ȣ�� �ҷ������� ������ �������־�.