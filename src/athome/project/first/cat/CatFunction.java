package athome.project.first.cat;

import java.util.Scanner;

public class CatFunction {
	CatInfo[] catinfos; // 고양이들 여러마리 저장하게끔 배열 선언

	public CatFunction() {
		catinfos = new CatInfo[2]; // 두마리만 출력해보자^_T
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

	// 고양이들 정보 입력받아서 setter에 저장
	public void inputCat() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < catinfos.length; i++) {
			System.out.println("-----" + (i + 1) + "번째 고양이 정보 입력-----");
			System.out.println("고양이 이름: ");
			String name = sc.next();
			System.out.println("고양이 체중(kg): ");
			double weight = sc.nextInt();
			System.out.println("고양이 나이 선택 (1세미만:1 / 1세이상:2 / 11세이상:3) : ");
			int age = sc.nextInt();
			System.out.println("고양이 중성화 여부(y/n): "); //이거 외에 입력하면 오류나야하는데 출력이 됨
			char neutral = sc.next().charAt(0);
			catinfos[i] = new CatInfo(); // 정보들을 저장하자
			catinfos[i].setName(name);
			catinfos[i].setWeight(weight);
			catinfos[i].setAge(age);
			catinfos[i].setNeutral(neutral);
		}
	}
	
    //저장된 정보 불러오기
	public void printCat() {
		for (int i = 0; i < catinfos.length; i++) {
			System.out.println("-----" + (i + 1) + "번째 고양이 정보 출력-----");
			System.out.println("사랑스러운 " + catinfos[i].getName() + "의 정보");
			System.out.println("체중: " + catinfos[i].getWeight());

			switch (catinfos[i].getAge()) { // 아 뭔가 이게 아닌거같은데...
			case 1:
				System.out.println("나이: 1세 미만의 아기고양이");
				break;
			case 2:
				System.out.println("나이: 1세 이상의 성묘");
				break;
			case 3:
				System.out.println("나이: 10세 이상의 노령묘");
				break;
			default: // 디폴트는 왜 아예 출력이 안될까
				System.out.println("잘못된 정보입니다. 정보 입력 메뉴로 돌아가세용!");
				break;
			}
			System.out.println("중성화 여부: " + catinfos[i].getNeutral());
		}
	}
	
    //칼로리 계산, 그람 계산
	public void printKcal() {
		for (int i = 0; i < catinfos.length; i++) {
			double e = 0;
			if (catinfos[i].getAge() == 1) {
				e = (30 * catinfos[i].getWeight() + 70) * 2.5; // 1살미만 애기
			} else if (catinfos[i].getAge() == 3 || (catinfos[i].getAge() == 2 && catinfos[i].getNeutral() == 'y')) {
				e = (30 * catinfos[i].getWeight() + 70) * 1.2; // 노령묘거나 중성화한 성묘
			} else {
				e = (30 * catinfos[i].getWeight() + 70) * 1.4;
			} // 1~10살 중성화 안한 성묘

			System.out.println("-----" + (i + 1) + "번째 고양이의 하루 필요 칼로리-----");
			System.out.println(catinfos[i].getName() + "은 하루에 " + e + "kcal가 필요해요.");
			double amount = e/3.93;// 우리애기 사료 칼로리 기준으로 표기함(아카나 그래스랜드 캣-g당 3.933kcal)
			System.out.println("건사료는 하루에 " + (int)amount + "g 만큼 주세요.");
		} // 소숫점 두자리까지 할라고 이거 쓰면 오류남 System.out.printf("건사료는 하루에 %.2f\n", amount + "g 만큼 주세요.");
	} //그래서 일단 강제 형변환 해서 소숫점 버려버림ㅜㅜ
		
    //종료
	public void printExit() {
		System.out.println("~안녕히가세요~");
		System.out.println(" 　　∧＿∧");
		System.out.println("((ｏ(´ªωª)o))");
		System.out.println("♪　 ㅣ　 ㅣ");
		System.out.println("　♪  し―-Ｊζ");

	}
	
    //예외처리
	public void printException() {
		System.out.println("1~4 사이의 숫자를 선택해주세요.");
	}

}
//----------고양이 하루치 사료 양 계산하기-----------
//0. 메뉴 printMenu
//1. 고양이 정보 입력 inputCat
//2. 고양이 정보 출력 printCat
//3. 고양이 필요 칼로리 출력 -> 사료 양 계산 printKcal 
//3. 프로그램 종료 printExit
//-----------------------------------------------------