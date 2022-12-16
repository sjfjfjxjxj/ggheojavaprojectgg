package com.kh.practice.member.controller;
//��������� ����. mList(���)�� ���������
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
    public void updateMember(Member member) {//�Է¹��� member 
    	for(int i = 0; i<mList.size(); i++) {
    		String memberId = member.getMemberId(); //�Է°�
    		Member storedMember = mList.get(i);
    		String storedId = mList.get(i).getMemberId(); //����Ȱ�
    		if(storedId.contentEquals(memberId)) { //�Է°� ���尪 ������
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
    	return mList; //������ �Ѱ��ֱ⸸ �ϴ°�. ����Ϸ��� ������ ����.
    	
    }
    /////////////////////////////////���̵��ã��////////////////////////////////////////////////
    //�ε��� ����
    public int findMemberIndex(String memberId) { //inputMemberId���� �����ذ� ���⼭ �޾Ƽ� ����
    	for(int i = 0; i < mList.size(); i++) {
    		//memberId�� ���� ���̵� mList�� �ִ��� �ε����� ã�ƺ���
    		Member mOne = mList.get(i);
    		if(memberId.contentEquals(mOne.getMemberId())) {
    			return i; //���̵� ã�Ҵ�
    		}
    	}
    	return -1; //��ã�Ҵ�
    }
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
