package com.kh.practice.member.controller;
//���� ����, �ҷ�����...
import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
    List<Member> mList; //���������� �迭 ��Ƴ����ǵ�. 
    
    public MemberController() {
    	mList = new ArrayList<Member>(); //�迭 ��� ��̸���Ʈ�� ������� 
    }
    public void registerMember(Member member) { //�Է°� �޾Ƽ� �����ϴ� ���� �Ұž�.
    	//�Ű������� ������ ���Ѱܹ޾�
        mList.add(member); //�迭�̾��� �ε��������� �ʱ�ȭ
    }
    
    public List<Member> printAllMember() {
    	return mList; //������ �Ѱ��ֱ⸸ �ϴ°�. ����Ϸ��� ������ ����.
    	
    }
    /////////////////////////////////���̵��ã��////////////////////////////////////////////////
//    //�ε��� ����
//    public int findMemberId(String memberId) { //inputMemberId���� �����ذ� ���⼭ �޾Ƽ� ����
//    	for(int i = 0; i < mList.size(); i++) {
//    		//memberId�� ���� ���̵� mList�� �ִ��� �ε����� ã�ƺ���
//    		Member mOne = mList.get(i);
//    		if(memberId.contentEquals(mOne.getMemberId())) {
//    			return i; //���̵� ã�Ҵ�
//    		}
//    	}
//    	return -1; //��ã�Ҵ�
//    }
    //���� ���� ������ �ش� ��ü ����
    public Member findMemberId(String memberId) {
    	for(int i = 0; i <mList.size(); i++) {
    		Member mOne = mList.get(i);
    		if(memberId.contentEquals(mOne.getMemberId())) {
    			return mOne;
    		}
    	}
    	return null;
    }
    
    //���̵� �ִ� ��ġ(�ε���) ã������ ���� �� �ε������� ã�ƿ���
    public Member printOneByIndex(int index) {
    	Member member = mList.get(index);
    	return member; //�׷��� �̰͵� ���ȭ�鿡 ��������
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
