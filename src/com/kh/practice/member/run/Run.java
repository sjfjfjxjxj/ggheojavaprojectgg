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
        		String memberId = view.inputMemberId("검색");
        		Member mOne = mCon.findMemberId(memberId);
        		if(mOne == null) {
        			//없습니다 메시지 출력(뷰클래스에 해줄거야)
        		}
        		//int mOne = mCon.printOneByIndex(index);
        		view.showOneMember(mOne);
        		break;
        	case 3 : 
        		String memberName = view.inputMemberName("검색");
        		int indexname = mCon.findMemberName(memberName);
        		if(indexname == -1) {
        			////없습니다 메시지 출력
        		}
        		Member mOne1 = mCon.printOneByIndex(indexname);
        		view.showOneMember(mOne1);
        		break;
        	case 4 : //MemberView에서 받은거 
        		Member member = view.inputMember(); //멤버뷰클래스에서 입력받은값을 멤버컨트롤러에서 만들었던 멤버변수로 담아(이건어레이리스트)
        		mCon.registerMember(member); //매개변수로 넘겨줘서 최종저장이 되게끔...
        		view.displaySuccess("가입이 완료되었습니다");
        		break;
        	case 5 : 
        		member = view.modifyMember();
        		mCon.updateMember(member);
        		view.displaySuccess("수정이 완료되었습니다");
        		break;
        	case 6 : 
        		memberId = view.inputMemberId("삭제");
        		int index = mCon.findMemberIndex(memberId);
        		mCon.removeMember(index);
        		//System.out.println("계정이 삭제되었습니다"); 이대신성공출력메소드!
        		view.displaySuccess("계정이 삭제되었습니다");
        		break;
        	case 0 : break done;
        	}
        	
        }
	}
}
