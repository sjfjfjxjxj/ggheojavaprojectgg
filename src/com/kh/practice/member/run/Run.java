package com.kh.practice.member.run;

import java.util.List;

import com.kh.practice.member.controller.MemberController;
import com.kh.practice.member.model.vo.Member;
import com.kh.practice.member.view.MemberView;

public class Run {
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController mCon = new MemberController();
		done:
        while(true) {
        	int choice = view.mainMenu();
        	switch(choice) {
        	case 1 : 
        		List<Member> mList = mCon.printAllMember();
        		view.showAllMember(mList);
        		break;
        	case 2 : 
        		String memberId = view.inputMemberId("�˻�");
        		Member mOne = mCon.findMemberId(memberId);
        		if(mOne == null) {
        			//�����ϴ� �޽��� ���(��Ŭ������ ���ٰž�)
        		}
        		//int mOne = mCon.printOneByIndex(index);
        		view.showOneMember(mOne);
        		break;
        	case 3 : 
        		String memberName = view.inputMemberName("�˻�");
        		int indexname = mCon.findMemberName(memberName);
        		if(indexname == -1) {
        			////�����ϴ� �޽��� ���
        		}
        		Member mOne1 = mCon.printOneByIndex(indexname);
        		view.showOneMember(mOne1);
        		break;
        	case 4 : //MemberView���� ������ 
        		Member member = view.inputMember(); //�����Ŭ�������� �Է¹������� �����Ʈ�ѷ����� ������� ��������� ���(�̰Ǿ�̸���Ʈ)
        		mCon.registerMember(member); //�Ű������� �Ѱ��༭ ���������� �ǰԲ�...
        		view.displaySuccess("������ �Ϸ�Ǿ����ϴ�");
        		break;
        	case 5 : 
        		member = view.modifyMember();
        		mCon.updateMember(member);
        		view.displaySuccess("������ �Ϸ�Ǿ����ϴ�");
        		break;
        	case 6 : 
        		memberId = view.inputMemberId("����");
        		int index = mCon.findMemberIndex(memberId);
        		mCon.removeMember(index);
        		//System.out.println("������ �����Ǿ����ϴ�"); �̴�ż�����¸޼ҵ�!
        		view.displaySuccess("������ �����Ǿ����ϴ�");
        		break;
        	case 0 : break done;
        	}
        	
        }
	}
}
