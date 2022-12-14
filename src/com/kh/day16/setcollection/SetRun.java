package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
	public static void main(String[] args) {
		// Collection의 List, Set, Map은 저장소의 역할
		// 임시 또는 영구적으로 저장
		// 자료구조의 특성에 따라 List(用多), Set, Map을 선택해 쓸 수 있음
		
		
		Set<Student> set3 = new HashSet<Student>();
		//set3.add(new Student()); //Student클래스에서 값을 넣으려면 뉴 붙여서 값을 만들어야<-기본생성자만 넣은 것
		Student kdw = new Student("강동원", 35, 100);
		set3.add(new Student("정우성", 55, 70));
		set3.add(new Student("소지섭", 60, 80));
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		set3.add(kdw);
		System.out.println("데이터의 크기 : " + set3.size());
		//System.out.println(kdw.getName()+" "+kdw.getScore1()+" "+kdw.getScore2()); 귀찮아서 아래처럼 쓰자
		System.out.println(kdw.information()); //근데 이런식으로 메소드 따로 안쓴대.. toString 재정의해서 쓴대
//		System.out.println(new Student().hashCode());
//		System.out.println(new Student().hashCode());
//		System.out.println(new Student().hashCode());

	}
	public void setExample1() {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		System.out.println("저장된 데이터 수 : " + set.size());
		Iterator<String> iterator = set.iterator(); // 얘로 set 접근해서 하나씩 꺼내온다
		while (iterator.hasNext()) {
			// hasNext다음 값이 있으면.. 순서가 필요없어서 값이 있는지없는지만 체크함
			System.out.println(iterator.next()); // 있으면 출력해줘!
		}
		set.add("one"); // 중복 허용 x
		System.out.println("========================");
		Iterator<String> iterator2 = set.iterator(); // 얘로 set 접근해서 하나씩 꺼내온다
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next()); // 있으면 출력해줘!
		}
	}
	public void setExample2() {
		Set<Integer> set2 = new HashSet<Integer>();
		//set2.add(11); 이런식으로 값 넣음 됨
	}
}
