package com.kh.practice.member.view;
//	======= ȸ������ ���α׷� =======

//			1. ȸ������ ��ü��ȸ
//			2. ȸ�� ���̵�� ��ȸ
//			3. ȸ�� �̸����� ��ȸ
//			4. ȸ������
//			5. ȸ������ ����
//			6. ȸ��Ż��
//			0. ���α׷� ����
//			�޴� ���� :

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

public class MemberView {
	Scanner sc = new Scanner(System.in);

	public int mainMenu() {
		System.out.println("=== === === ȸ������ ���α׷� === === ===");
		System.out.println("1. ȸ������ ��ü��ȸ");
		System.out.println("2. ȸ�� ���̵�� ��ȸ");
		System.out.println("3. ȸ�� �̸����� ��ȸ");
		System.out.println("4. ȸ������");
		System.out.println("5. ȸ������ ����");
		System.out.println("6. ȸ��Ż��");
		System.out.println("0. ���α׷�����");
		System.out.print("�޴� ���� : ");
		int value = sc.nextInt();
		return value;
	}
/////4. ȸ������///////////
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String memberId = sc.next();
		System.out.print("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.print("�̸� : ");
		String memberName = sc.next();
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		System.out.print("���� : ");
		String memberGender = sc.next();
		System.out.print("�̸��� : ");
		String memberEmail = sc.next();
		System.out.print("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.print("�ּ� : ");
		sc.nextLine();
		String memberAdress = sc.nextLine();
		System.out.print("��� : ");
		String memberHobby = sc.next();
		// �̰͵� �ʹ� �����ϱ� ��ü�� ����. �������� �̿�!
		Member member = new Member(); // ���ȩ�� �����͸� member��� ������ ��´�
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAdress(memberAdress);
		member.setMemberHobby(memberHobby);
		// �̰͵带 ��Ʈ�ѷ��� �����ž�. ���� ���ϸ� �ⲯ ��ǲ���� ������ ������ ���������
		return member; // ���ȯŸ���� Member�� �ɰ�
	}
/////2. ���̵�� ��ȸ//////
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� ���̵� �Է� : ");
		String memberId = sc.next();// mList���� �˻��ؼ� ����ؾ��ؼ� ��������
		return memberId;
	}
/////3. �̸����� ����/////
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� �̸� �Է� : ");
		String memberName = sc.next();
		return memberName;
	}
	
	
	
	
//    public void showAllMember(List<Member>mList) {//printAllMember���� �Ѱ��� mList��ü ���⼭ �����ž�
//    	System.out.println("=== === === ȸ������ ��ü��ȸ === === ===");
//    	for(Member mOne : mList) { //mOne�� �� ��ȩ���� �ִ��� �˷���
//    		System.out.println(mOne.toString()); //����Ʈ������ ���� ����غ���
//    	}
//    }
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === ȸ������ ��ü��ȸ === === ===");
		for (Member mOne : mList) {
			System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
			System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
			System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
			System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
			System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
			System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
			System.out.println("ȸ�� �ּ� : " + mOne.getMemberAdress());
			System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");

		}

	}
	
	//findMemberId�żҵ忡 ��±��� �ϸ� ���ѵ� mOne.toString() ����� ���⼭ �ϱ�� ����Ѱž�.
	public void printOneById(Member mOne) {//printOneByIndex �޼ҵ忡�� ���ϵ� ���� �޴°�
		System.out.println(mOne.toString());
	}
	
	public void printOneByName(Member mOne) {
		System.out.println(mOne.toString());
	}
}
