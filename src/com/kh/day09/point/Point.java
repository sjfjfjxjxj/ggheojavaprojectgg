package com.kh.day09.point;


public class Point{
	public int pub;
	int def;
	protected int pro;
	private int pri; //요부분은 접근 실험


    private int x, y;
    //기본생성자
    public Point() {
    	this.x = this.y = 0;
    }
    //매개변수 있는 생성자
    public Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    	
    	
    
    
//    public void set(int x, int y) {
//    	this.x = x;
//    	this.y = y;
//    }
    
 
    
    public void showPoint() { //좌표출력
    	System.out.println("(" + x + "," + y + ")");
    	
    }
}
