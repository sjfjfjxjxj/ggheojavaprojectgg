package com.kh.day14.listcollection;
//ObjectList)))IntList, StringList, SthList....
//������Ʈ����Ʈ�� ���� �迭�� �ƹ��ų� �־ �ȴ�!
public class ObjectList {
    private Object [] objects;
    private int size;
    
    //��ĳ���� �̿��ؼ�,
    public ObjectList() {
    	objects = new Object[3];
    	size = 0;
    }
    public void add(Object input) {
    	objects[size] = input;
    	size++;
    }
    public Object get(int index) {
    	return objects[index];
    }
    public int size() {
    	return size;
    }
    public void clear() {
    	objects = new Object[3];
    	size = 0;
    }
}
