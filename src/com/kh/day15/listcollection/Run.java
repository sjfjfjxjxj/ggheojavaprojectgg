package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

import com.kh.day14.listcollection.Student;

public class Run {
	public static void main(String [] args) {
		List<Integer> list = null;
		/////////////////////////////////////////////////////////////
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student());
		
		for(Student std : studentList) {////////////////////���̺κ� ���� �߿��ϰ� ���� �� �κ��̷��� 
			System.out.println(std.toString());//////////�ٵ� ���ؾȰ�. ������
		}
		////////////////////////////////////////////////////////////
		
		list = new ArrayList<Integer>(); //��ӹ޴°Ŷ� ��ĳ���� ����
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);
		
		int size = list.size();
		System.out.println("size : " + size);
		System.out.println("1��° ��: " + list.get(0));
		list.add(2023);
		System.out.println("size : " + list.size());
		
//		list.clear();
//		System.out.println("size : " + list.size());
		
		System.out.println("����ϰٽ����ϴ�");
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"��° �� : " + list.get(i));
		}
		list.add(2, 2022);
		System.out.println("Foreach�� �����");
		for(Integer iOne : list) {
			System.out.println("��� : " + iOne);
		}
		list.set(4, 7); //list�� �¸޼ҵ� (�׹�° ���� 7�� �ٲٰڴ�)<-��������
		System.out.println("~~~ �ٽ��ѹ� ����ϰڽ��ϴ� ~~~");
		for(Integer iOne : list) {
			System.out.println("��� : " + iOne);
		}

		
	}
	public void genericExample() { //�������ϰ� ����ȯ�� �����ʰ�..�� ���·� ���� �� ��
		RList<Integer> list = new RList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);
		
		int num = list.get(0);
		num = list.get(1);
		
		System.out.println("num : " + num);
	}
	
	public void intExample() {
		ObjectList list = new ObjectList();
		list.add(1);
		list.add("��");
		list.add(new Student());
		int num = (int)list.get(0);
		String word = (String)list.get(1);
		Student sOne = (Student)list.get(2);
		System.out.println("ù��° : " + list.get(0));
		System.out.println("�ι�° : " + list.get(1));
		System.out.println("����° : " + list.get(2));
		System.out.println("ũ�� : " + list.size());
		//�����ϱ�
		list.clear();
		System.out.println("ũ�� : " + list.size());
	}
}
