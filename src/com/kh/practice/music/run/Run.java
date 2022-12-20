package com.kh.practice.music.run;

import java.util.List;

import com.kh.practice.music.controller.MusicController;
import com.kh.practice.music.model.vo.Music;
import com.kh.practice.music.view.MusicView;

public class Run {
    public static void main(String [] args) {
    	MusicView view = new MusicView();
    	MusicController mCon = new MusicController();
    	int select = 0;
    	String title = "";
    	int index = 0;
    	Music music = null;
    	do {
    		select = view.musicMenu();
    		switch(select) {
    		case 1 : //��������ġ�����߰�
    			music = view.inputMusicInfo("������");
    			mCon.addAtLast(music);
    			view.displaySuccess("�߰� ����!");
    			break;
    		case 2 : //ù��ġ�� ���߰�
    			music = view.inputMusicInfo("ù");
    			mCon.addAtFirst(music);
    			view.displaySuccess("�߰� ����!");
    			break;
    		case 3 : //��ü�����
    			List<Music> allList = mCon.printMusicList();
    			view.showAllMusicList(allList);
    			view.displaySuccess("��ȸ ����!");
    			break;
    		case 4 : 
    			title = view.inputMusicName("�˻�");
    			List<Music> findList = mCon.searchMusicsByName(title);
    			view.showAllMusicList(findList);
    			view.displaySuccess("��ȸ ����!");
//    			index = mCon.searchOneByName(title);//Ư�� ��� �˻� .. �ε�����
//    			music = mCon.selectOneByIndex(index);//Ư�� ��� �˻� .. �ε�����
//    			view.showOneMusic(music);
    			break;
    		case 5 : //�� ����
    			title = view.inputMusicName("����");
    			index = mCon.searchOneByName(title);
    			if(index == -1) {
    				view.displayError("�������� �ʽ��ϴ�");
    				break;
    			}
    			mCon.removeMusic(index);
    			view.displaySuccess("���� ����!");
    			break;
    		case 6 : //������ ����
    			title = view.inputMusicName("����"); //�̸��ޱ�
    			index = mCon.searchOneByName(title);//�̸����� �ε����˻�
    			if(index == -1) {
    				view.displayError("��ȸ ����!");
    				break;
    			}
//    			music = mCon.selectOneByIndex(index);//�ε����� ������ �������� ->�ʿ�����۾�
    			//�����ϴ� �۾�
//    			music = view.modifyMusicInfo(music); //������ ������ ���� �Ͱ����� �ٲٰ����
    			music = view.modifyMusicInfo(); //������ ������ ���� �� ������ �Ȱ������� �ٲܶ�, ���� �� �ٲٰ������
    			mCon.updateMusic(index, music); //����ҷ� ���� �����
    			view.displaySuccess("���� ����!");
    			break;
    		case 7 : //��� ������������! 
    			view.printMessage("=== === ��� �������� ����=== ===");
    			mCon.sortByTitleASC();
    			break;
    		case 8 : //��� ��������
    			view.printMessage("=== === ��� �������� ����=== ===");
    			mCon.sortByTitleDESC();
    			break;
    		case 9 : //���� ��������
    			view.printMessage("=== === ������ �������� ����=== ===");
    			mCon.sortBySingerASC();
    			break;
    		case 10 : 
    			view.printMessage("=== === ������ �������� ����=== ===");
    			mCon.sortBySingerDESC();
    			break;
    		}
    		
    	}while(select != 0);// 0.����󼭤��� �극��ũ�ʿ����
    }
}
