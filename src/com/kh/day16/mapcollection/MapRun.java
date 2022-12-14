package com.kh.day16.mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day16.setcollection.Student;

public class MapRun {
	public static void main(String [] args) {
		Map<String,Student> stdMap = new HashMap<String,Student>();
		stdMap.put("1", new Student("손예진", 44, 66));
		stdMap.put("2", new Student("현빈", 55, 100));
		
		System.out.println("첫번째학생" + stdMap.get("1").toString());
		
	}
	
	public void mapExample2() {
		Map<String,Object> objMap = new HashMap<String,Object>();
		objMap.put("name", "핫팩");
		objMap.put("price", 1500);
		objMap.put("isGood", true);
		System.out.println("상품 이름 : " +objMap.get("name"));
		System.out.println("상품 가격 : " +objMap.get("price") + "원");
		String result = (boolean)objMap.get("isGood") ? "추천" : "비추";
		System.out.println("추천 여부 : " + result);
	}
	
	
	public void mapExample1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("061", "전라도");
		map.put("053", "대구");
		System.out.println("저장된 데이터의 수 : " + map.size());
		System.out.println("02 누르면 서울 나와요 : " + map.get("02")); //키값을 겟에 넣어
		System.out.println("031 누르면 경기도 나와요 : " + map.get("031"));
		
		Scanner sc= new Scanner(System.in);
		System.out.print("지역번호 입력 :");
		String regionCode = sc.next();
		                                                       //잘나옴!/map이 저장소역할을 한다!
		System.out.println("입력하신 지역번호에 대한 지역은 : " + map.get(regionCode));
	}

}
