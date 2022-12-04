package home.home.noupdate;

import java.util.Scanner;

public class StudentFunction {
	Scanner sc;

	int choice = 0;
	int kor = 0;
	int math = 0;
	public int printMenu() {
		System.out.println("--메인메뉴--");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		choice = sc.nextInt();
		return choice;

	};

	public void inputScore() {
		System.out.println("--성적입력--");
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("수학 : ");
		int math = sc.nextInt();
	}
	
	public void printScore() {
		System.out.print("--성적출력--");
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
	}
}









