package com.kh.day15.listcollection;
                 //<T>▽아무거나 다 들어갈수있어요라는 표시: 제네릭
public class RList<T> {
	private Object [] objects;
	private int size;
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	//리턴값이 있으면(return xxxx) 리턴값으ㅣ자료형을 메소드 반환형에 적어줌
	public T get(int index) {
		return (T)objects[index];
	}
	public Object size() {
		return size;
	}
	public void clear() {
		objects = new Object[3];
		size = 0;
	}

}
