package com.kh.practice.member.controller;
//최종저장소 역할. mList(디비)랑 연결돼있음
import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
    List<Member> mList; //옛날같으면 배열 담아놨을건데. 
    
    public MemberController() {
    	mList = new ArrayList<Member>(); //배열 대신 어레이리스트를 만들었다 
    }
    public void registerMember(Member member) { //입력값 받아서 저장하는 역할 할거야.
    	//매개변수가 없으면 못넘겨받아
        mList.add(member); //배열이었음 인덱스값마다 초기화
    }
    public void updateMember(Member member) {//입력받은 member 
    	for(int i = 0; i<mList.size(); i++) {
    		String memberId = member.getMemberId(); //입력값
    		Member storedMember = mList.get(i);
    		String storedId = mList.get(i).getMemberId(); //저장된값
    		if(storedId.contentEquals(memberId)) { //입력값 저장값 같으면
    			storedMember.setMemberPwd(member.getMemberPwd());
    			storedMember.setMemberEmail(member.getMemberEmail());
    			storedMember.setMemberPhone(member.getMemberPhone());
    			storedMember.setMemberAdress(member.getMemberAdress());
    			storedMember.setMemberHobby(member.getMemberHobby());
    		}
    	}
    }
    
    public void removeMember(int index) {
    	mList.remove(index);
    }
    
    
    
    
    public List<Member> printAllMember() {
    	return mList; //데이터 넘겨주기만 하는것. 출력하려면 멤버뷰로 가자.
    	
    }
    /////////////////////////////////아이디로찾기////////////////////////////////////////////////
    //인덱스 리턴
    public int findMemberIndex(String memberId) { //inputMemberId에서 보내준거 여기서 받아서 쓹야
    	for(int i = 0; i < mList.size(); i++) {
    		//memberId와 같은 아이디가 mList에 있는지 인덱스를 찾아보자
    		Member mOne = mList.get(i);
    		if(memberId.contentEquals(mOne.getMemberId())) {
    			return i; //아이디 찾았다
    		}
    	}
    	return -1; //못찾았다
    }
    //같은 값이 있을때 해당 객체 리턴
    public Member findMemberId(String memberId) {
    	for(int i = 0; i <mList.size(); i++) {
    		Member mOne = mList.get(i);
    		if(memberId.contentEquals(mOne.getMemberId())) {
    			return mOne;
    		}
    	}
    	return null;
    }
    
    //아이디가 있는 위치(인덱스) 찾았으니 이제 그 인덱스값을 찾아오자
    public Member printOneByIndex(int index) {
    	Member member = mList.get(index);
    	return member; //그래서 이것도 출력화면에 보여주자
    }
////////////////////////////////////////////////////////////////////////////////////////////////
    
    public int findMemberName(String memberName) {
    	for(int i = 0; i < mList.size(); i++) {
    		Member mOne = mList.get(i);
    		if(memberName.contentEquals(mOne.getMemberName())) {
    			return i;
    		}
    	}
    	return -1;
    }
    
    
    
}
