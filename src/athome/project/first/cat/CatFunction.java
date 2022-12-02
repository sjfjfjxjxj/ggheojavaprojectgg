package athome.project.first.cat;

import java.util.Scanner;

public class CatFunction {
    CatInfo [] catinfos; //고양이들 여러마리 저장하게끔 배열 선언
    
    public CatFunction() {
        catinfos = new CatInfo[2]; //두마리만 출력해보자^_T
    }
    
    public int printMenu() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-----고양이 하루치 사료 양 계산하기-----");
    	System.out.println("1. 고양이 정보 입력");
        System.out.println("2. 고양이 정보 출력");
        System.out.println("3. 칼로리 출력 및 사료 양 계산");
        System.out.println("4. 프로그램 종료");
        System.out.println("메뉴 입력 : ");
        int menu = sc.nextInt();
        return menu;
    }
    
    public void inputCat() {
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0; i<catinfos.length; i++) {
    		System.out.println("-----" + (i+1) + "번째 고양이 정보 입력-----");
    		System.out.println("고양이 이름: ");
    		String name = sc.next();
    		System.out.println("고양이 체중(kg): ");
    		double weight = sc.nextInt();
    		System.out.println("고양이 나이(1세미만:0 / 1세이상:1 / 11세이상:2) : ");
    		int age = sc.nextInt();
    		System.out.println("고양이 중성화 여부(y/n): ");
    		char neutral = sc.next().charAt(0);
    		catinfos[i] = new CatInfo(); //고양이 정보들을 저장하자
    		catinfos[i].setName(name);
    		catinfos[i].setWeight(weight);
    		catinfos[i].setAge(age);
    		catinfos[i].setNeutral(neutral);   				
    	}
    }
    
    public void printCat() {
    	for(int i = 0; i<catinfos.length; i++) {
    		System.out.println("-----" + (i+1) + "번째 고양이 정보 출력-----");
    		System.out.println("애기 " + catinfos[i].getName() + "의 정보");
    		System.out.println("체중: " + catinfos[i].getWeight() );
    		System.out.println("나이: " + catinfos[i].getAge() ); //여기 어쩌지
    		System.out.println("중성화 여부: " + catinfos[i].getNeutral() );
    	}
    }
    
    public void printKcal() {
    	for(int i = 0; i < catinfos.length; i++) {
    		int active = 0;
    		if(catinfos[i].getAge() == 0) {아기고양이. 2.5가 활동계수}
    		else if(catinfos[i].getAge()>=11) {노령묘. 1.2로 }
    		else {중성화했음 1.2, 미중성화 1.4} //1~10살
    		
    		System.out.println("-----" + (i+1) + "번째 고양이의 하루 필요 칼로리-----");
    		System.out.println(catinfos[i].getName()+"은 하루에 "+((30*catinfos[i].getWeight()+70)*활동계수값)  + "kcal 이 필요해요.");
    	}
    }
    
    public void printExit() {}
    
}
//----------고양이 하루치 사료 양 계산하기-----------
//0. 메뉴 printMenu
//1. 고양이 정보 입력 inputCat
//2. 고양이 정보 출력 printCat
//3. 고양이 필요 칼로리 출력 -> 사료 양 계산 printKcal 
//3. 프로그램 종료 printExit
//-----------------------------------------------------