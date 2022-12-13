package com.kh.day15.listcollection;
//순서를 유지하고 중복도 가능하게 데이터를 나열하게 리스트(자료구조 中)를 사용해.
public class IntList {
	private int [] nums;
	private int size;
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	public void add(int input) {
		nums[size] = input;
		size++;
	}
	//리턴값이 있으면(return xxxx) 리턴값으ㅣ자료형을 메소드 반환형에 적어줌
	public int get(int index) {
		return nums[index];
	}
	public int size() {
		return size;
	}
	public void clear() {
		nums = new int[3];
		size = 0;
	}

}
