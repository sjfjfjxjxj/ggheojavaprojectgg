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
		
		for(Student std : studentList) {////////////////////△이부분 제일 중요하고 자주 쓸 부분이래▽ 
			System.out.println(std.toString());//////////근데 이해안감. 복습必
		}
		////////////////////////////////////////////////////////////
		
		list = new ArrayList<Integer>(); //상속받는거라 업캐스팅 가능
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);
		
		int size = list.size();
		System.out.println("size : " + size);
		System.out.println("1번째 값: " + list.get(0));
		list.add(2023);
		System.out.println("size : " + list.size());
		
//		list.clear();
//		System.out.println("size : " + list.size());
		
		System.out.println("출력하겟슴ㅁ니다");
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"번째 값 : " + list.get(i));
		}
		list.add(2, 2022);
		System.out.println("Foreach로 출력함");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		list.set(4, 7); //list에 셋메소드 (네번째 값을 7로 바꾸겠다)<-수정가넝
		System.out.println("~~~ 다시한번 출력하겠습니다 ~~~");
		for(Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}

		
	}
	public void genericExample() { //☆지정하고 형변환은 쓰지않고..의 형태로 쓰게 될 것
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
		list.add("월");
		list.add(new Student());
		int num = (int)list.get(0);
		String word = (String)list.get(1);
		Student sOne = (Student)list.get(2);
		System.out.println("첫번째 : " + list.get(0));
		System.out.println("두번째 : " + list.get(1));
		System.out.println("세번째 : " + list.get(2));
		System.out.println("크기 : " + list.size());
		//삭제하기
		list.clear();
		System.out.println("크기 : " + list.size());
	}
}
