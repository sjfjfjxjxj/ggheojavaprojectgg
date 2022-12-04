package com.kh.day08.oop;
 //Suit s = new Suit(100);을 실행한다면::
public class Suit {
    private int size;
    private String brand;
    private int price;
    
    public Suit(int size) { //런->100값 넘어와서 size=100
    	this(size, "Hazzys"); //밑으로 호출(this가 있으니까 생성자 호출 line 12로
    	System.out.println("ⓐSuit(int) 호출!");
    }
    public Suit(int size, String brand) { //100, 해지스 갖고 넘어온다
    	this(size, brand, 100000); //100, 해지스, 100000 (this니까 또 호출)
    	System.out.println("ⓑSuit(int, String) 호출! " + size + brand);
    }
    public Suit(int size, String brand, int price) {//100, 해지스, 100000
    	this.size = size; //걍 변수 초기화ㅇㅇ
    	this.brand = brand;
    	this.price = price;
    	System.out.println("ⓒSuit(int,String,int) 호출! " + size + brand + price); //얘가 호출
    }
}

//아하! 
//this(매개변수); 요런 코드는 () 요 속이 가리키는 애를 딴 메소드에서 호출해.
//그 딴 메소드가 다 실행돼야 호출 불렀던쪽이 실행을 끝낼수있어.