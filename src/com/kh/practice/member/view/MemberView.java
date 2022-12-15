package com.kh.practice.member.view;
//	======= 회원관리 프로그램 =======

//			1. 회원정보 전체조회
//			2. 회원 아이디로 조회
//			3. 회원 이름으로 조회
//			4. 회원가입
//			5. 회원정보 변경
//			6. 회원탈퇴
//			0. 프로그램 종료
//			메뉴 선택 :

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

public class MemberView {
	Scanner sc = new Scanner(System.in);

	public int mainMenu() {
		System.out.println("=== === === 회원관리 프로그램 === === ===");
		System.out.println("1. 회원정보 전체조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원정보 변경");
		System.out.println("6. 회원탈퇴");
		System.out.println("0. 프로그램종료");
		System.out.print("메뉴 선택 : ");
		int value = sc.nextInt();
		return value;
	}
/////4. 회원가입///////////
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("성별 : ");
		String memberGender = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String memberAdress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		// 이것들 너무 많으니까 객체에 담자. 참조변수 이용!
		Member member = new Member(); // ←아홉개 데이터를 member라는 변수에 담는다
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAdress(memberAdress);
		member.setMemberHobby(memberHobby);
		// 이것드를 컨트롤러로 보낼거야. 리턴 안하면 기껏 인풋받은 멤버라는 변수는 사라져버려
		return member; // →반환타입은 Member가 될것
	}
/////2. 아이디로 조회//////
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 아이디 입력 : ");
		String memberId = sc.next();// mList에서 검색해서 사용해야해서 리턴해줘
		return memberId;
	}
/////3. 이름으로 조히/////
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름 입력 : ");
		String memberName = sc.next();
		return memberName;
	}
	
	
	
	
//    public void showAllMember(List<Member>mList) {//printAllMember에서 넘겨준 mList객체 여기서 받을거야
//    	System.out.println("=== === === 회원정보 전체조회 === === ===");
//    	for(Member mOne : mList) { //mOne에 값 아홉개가 있는지 알려면
//    		System.out.println(mOne.toString()); //투스트링으로 빼서 출력해볼것
//    	}
//    }
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === 회원정보 전체조회 === === ===");
		for (Member mOne : mList) {
			System.out.println("회원 아이디 : " + mOne.getMemberId());
			System.out.println("회원 이름 : " + mOne.getMemberName());
			System.out.println("회원 성별 : " + mOne.getMemberGender());
			System.out.println("회원 나이 : " + mOne.getMemberAge());
			System.out.println("회원 이메일 : " + mOne.getMemberEmail());
			System.out.println("회원 폰번호 : " + mOne.getMemberPhone());
			System.out.println("회원 주소 : " + mOne.getMemberAdress());
			System.out.println("회원 취미 : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");

		}

	}
	
	//findMemberId매소드에 출력까지 하면 편한데 mOne.toString() 출력은 여기서 하기로 약속한거야.
	public void printOneById(Member mOne) {//printOneByIndex 메소드에서 리턴된 값을 받는것
		System.out.println(mOne.toString());
	}
	
	public void printOneByName(Member mOne) {
		System.out.println(mOne.toString());
	}
}
