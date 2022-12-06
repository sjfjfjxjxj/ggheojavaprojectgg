package com.kh.day10.zoointerface;

public class ZooRun {
    public static void main(String [] args) {
    	ZooKeeper zk = new ZooKeeper();
    	zk.feed();
    	zk.feed(new Tiger());
    	zk.feed(new Lion());
    	zk.feed(new Bear());
    }
    
}
//동작 클래스는 달라지는거 없다. 인터페이스 구현으로 zk객체의 코드가 간결해짐