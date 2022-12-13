package com.kh.day15.listcollection;
                 //<T>��ƹ��ų� �� �����־���� ǥ��: ���׸�
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
	//���ϰ��� ������(return xxxx) ���ϰ������ڷ����� �޼ҵ� ��ȯ���� ������
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
