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
        		String memberId = view.inputMemberId();
        		Member mOne = mCon.findMemberId(memberId);
        		if(mOne == null) {
        			//없습니다 메시지 출력(뷰클래스에 해줄거야)
        		}
        		//Int mOne = mCon.printOneByIndex(index);
        		view.printOneById(mOne);
        		break;
        	case 3 : 
        		String memberName = view.inputMemberName();
        		int indexname = mCon.findMemberName(memberName);
        		if(indexname == -1) {
        			////없습니다 메시지 출력
        		}
        		Member mOne1 = mCon.printOneByIndex(indexname);
        		view.printOneByName(mOne1);
        		break;
        	case 4 : //MemberView에서 받은거 
        		Member member = view.inputMember(); //멤버뷰클래스에서 입력받은값을 멤버컨트롤러에서 만들었던 멤버변수로 담아(이건어레이리스트)
        		mCon.registerMember(member); //매개변수로 넘겨줘서 최종저장이 되게끔...
        		break;
        	case 5 : break;
        	case 6 : break;
        	case 0 : break done;
        	}
        	
        }
	}
}
