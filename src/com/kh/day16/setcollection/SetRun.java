package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
	public static void main(String[] args) {
		// Collection�� List, Set, Map�� ������� ����
		// �ӽ� �Ǵ� ���������� ����
		// �ڷᱸ���� Ư���� ���� List(����), Set, Map�� ������ �� �� ����
		
		
		Set<Student> set3 = new HashSet<Student>();
		//set3.add(new Student()); //StudentŬ�������� ���� �������� �� �ٿ��� ���� ������<-�⺻�����ڸ� ���� ��
		Student kdw = new Student("������", 35, 100);
		set3.add(new Student("���켺", 55, 70));
		set3.add(new Student("������", 60, 80));
		set3.add(kdw);
		System.out.println("�������� ũ�� : " + set3.size());
		set3.add(kdw);
		System.out.println("�������� ũ�� : " + set3.size());
		set3.add(kdw);
		System.out.println("�������� ũ�� : " + set3.size());
		//System.out.println(kdw.getName()+" "+kdw.getScore1()+" "+kdw.getScore2()); �����Ƽ� �Ʒ�ó�� ����
		System.out.println(kdw.information()); //�ٵ� �̷������� �޼ҵ� ���� �Ⱦ���.. toString �������ؼ� ����
//		System.out.println(new Student().hashCode());
//		System.out.println(new Student().hashCode());
//		System.out.println(new Student().hashCode());

	}
	public void setExample1() {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		System.out.println("����� ������ �� : " + set.size());
		Iterator<String> iterator = set.iterator(); // ��� set �����ؼ� �ϳ��� �����´�
		while (iterator.hasNext()) {
			// hasNext���� ���� ������.. ������ �ʿ��� ���� �ִ����������� üũ��
			System.out.println(iterator.next()); // ������ �������!
		}
		set.add("one"); // �ߺ� ��� x
		System.out.println("========================");
		Iterator<String> iterator2 = set.iterator(); // ��� set �����ؼ� �ϳ��� �����´�
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next()); // ������ �������!
		}
	}
	public void setExample2() {
		Set<Integer> set2 = new HashSet<Integer>();
		//set2.add(11); �̷������� �� ���� ��
	}
}
