package com.kh.day16.setcollection;

public class Student {
//오류방지용
	private String name;
	private int score1;
	private int score2;
	
	//우클릭->source->generate constructor field-> select nth
	public Student() {
		super();
	}
	
	//우클릭->source->generate constructor field-> select all
	public Student(String name, int score1, int score2) {
		super();
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	//우클릭->source->generate constructor field-> select score1, 2
	public Student(int score1, int score2) {
		super();
		this.score1 = score1;
		this.score2 = score2;
	}
	
	//우클릭->source->generate getters and setters->sellect all하면 자동만들어짐
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public int getScore2() {
		return score2;
	}
	
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	@Override
	public int hashCode() {
		return(this.name+this.score1+this.score2).hashCode();
	}
	public String information() {
		return "name : " + this.name + ", score1 : " + this.score1 + ", score2 : "+ this.score2;
	}
	@Override //위에 인포메이션 메소드처럼 안만들고 투스트링 재정의 자주 한대
	public String toString() {
		return "name : " + this.name + ", score1 : " + this.score1 + ", score2 : "+ this.score2;
	}
	
	@Override //데이터 크기 안늘어나게 ▽
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return this.hashCode() == std.hashCode();
		}else {
			return false;
			
		}
	}
	
	
	
}
