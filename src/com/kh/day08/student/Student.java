package com.kh.day08.student;
//이름, 성적 저장하는 클래스!(여긴 게터, 세터 메소드를 적게 될것)
public class Student {
    private String name;
    private int firstScore;
    private int secondScore;
    //1. 기본생성자 적기
    public Student() {}
    
    //public Student(String name) {
    	//this.name = name;
        //ex. this(100,100); 이런식으로도 ㅇㅇ
    //}
    //public Student(int firstScore, int secondScore) {
    	//this.firstScore = firstScore;
    	//this.secondScore = secondScore;
    //}
    
    //매개변수. 위처럼 따로 써도 됨
    public Student(String name, int firstScore, int secondScore) {
    	this.name = name;
    	this.firstScore = firstScore;
    	this.secondScore = secondScore;
    }
    
    //getter 메소드. get+멤버변수명 적어주기
    public String getName() {
    	return this.name;
    }
    public int getFirstScore() {
    	return this.firstScore;
    }
    public int getSecondScore() {
    	return this.secondScore;
    }
    
    //setter 메소드
    public void setName(String name) {
    	this.name = name;
    }
    public void setFirstScore(int firstScore) {
    	this.firstScore = firstScore;
    }
    public void setSecondScore(int secondScore) {
    	this.secondScore = secondScore;
    }
    
}























