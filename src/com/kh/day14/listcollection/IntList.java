package com.kh.day14.listcollection;
//복습必
import java.util.Arrays;

public class IntList {
	private int [] nums; //필드에서 변수선언
	//private int current; //current = 인덱스값. 사이즈 불변
	private int size; //요소 개수 확인
	public IntList() {
		nums = new int[3];//필드초기화 必!
		//current = 0;
		size = 0;
	}
	
	private void resize() {
		int array_capacity = nums.length;
		//용량 꽉찰경우
		if(size == array_capacity) {//용량이 꽉차면
			//용량 2배로 해줨
			int new_capacity = array_capacity * 2;
			//새롭게 배열 만들어줌
			nums = Arrays.copyOf(nums, new_capacity);  
		}//안에 값이 있으면 고대로 복사해서 배열 길이 늘어날수있는
		
	}
	
	public void add(int input) {
		//int input = 1~3
		//꽉찬 상태면 크기 재할당 배열 생성
		if(size == nums.length) {
			resize();
		}
		//마지막 위치에 요소 추가		
		nums[size] = input;
		size++;
	}
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
