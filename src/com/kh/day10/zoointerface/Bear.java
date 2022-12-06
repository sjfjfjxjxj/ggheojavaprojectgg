package com.kh.day10.zoointerface;

public class Bear extends Animal implements Predator{

	@Override
	public String animailFood() {
		
		return "salmon";
	}

}
