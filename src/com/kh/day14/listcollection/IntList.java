package com.kh.day14.listcollection;
//������
import java.util.Arrays;

public class IntList {
	private int [] nums; //�ʵ忡�� ��������
	//private int current; //current = �ε�����. ������ �Һ�
	private int size; //��� ���� Ȯ��
	public IntList() {
		nums = new int[3];//�ʵ��ʱ�ȭ ��!
		//current = 0;
		size = 0;
	}
	
	private void resize() {
		int array_capacity = nums.length;
		//�뷮 �������
		if(size == array_capacity) {//�뷮�� ������
			//�뷮 2��� �آW
			int new_capacity = array_capacity * 2;
			//���Ӱ� �迭 �������
			nums = Arrays.copyOf(nums, new_capacity);  
		}//�ȿ� ���� ������ ���� �����ؼ� �迭 ���� �þ���ִ�
		
	}
	
	public void add(int input) {
		//int input = 1~3
		//���� ���¸� ũ�� ���Ҵ� �迭 ����
		if(size == nums.length) {
			resize();
		}
		//������ ��ġ�� ��� �߰�		
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
