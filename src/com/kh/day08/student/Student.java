package com.kh.day08.student;
//�̸�, ���� �����ϴ� Ŭ����!(���� ����, ���� �޼ҵ带 ���� �ɰ�)
public class Student {
    private String name;
    private int firstScore;
    private int secondScore;
    //1. �⺻������ ����
    public Student() {}
    
    //public Student(String name) {
    	//this.name = name;
        //ex. this(100,100); �̷������ε� ����
    //}
    //public Student(int firstScore, int secondScore) {
    	//this.firstScore = firstScore;
    	//this.secondScore = secondScore;
    //}
    
    //�Ű�����. ��ó�� ���� �ᵵ ��
    public Student(String name, int firstScore, int secondScore) {
    	this.name = name;
    	this.firstScore = firstScore;
    	this.secondScore = secondScore;
    }
    
    //getter �޼ҵ�. get+��������� �����ֱ�
    public String getName() {
    	return this.name;
    }
    public int getFirstScore() {
    	return this.firstScore;
    }
    public int getSecondScore() {
    	return this.secondScore;
    }
    
    //setter �޼ҵ�
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























