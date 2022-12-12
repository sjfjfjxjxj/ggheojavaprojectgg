package com.kh.day14.listcollection;
//ObjectList)))IntList, StringList, SthList....
//오브젝트리스트를 쓰면 배열에 아무거나 넣어도 된다!
public class ObjectList {
    private Object [] objects;
    private int size;
    
    //업캐스팅 이용해서,
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
