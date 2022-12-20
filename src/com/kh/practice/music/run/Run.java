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
    		case 1 : //마지막위치에곡추가
    			music = view.inputMusicInfo("마지막");
    			mCon.addAtLast(music);
    			view.displaySuccess("추가 성공!");
    			break;
    		case 2 : //첫위치에 곡추가
    			music = view.inputMusicInfo("첫");
    			mCon.addAtFirst(music);
    			view.displaySuccess("추가 성공!");
    			break;
    		case 3 : //전체곡출력
    			List<Music> allList = mCon.printMusicList();
    			view.showAllMusicList(allList);
    			view.displaySuccess("조회 성공!");
    			break;
    		case 4 : 
    			title = view.inputMusicName("검색");
    			List<Music> findList = mCon.searchMusicsByName(title);
    			view.showAllMusicList(findList);
    			view.displaySuccess("조회 성공!");
//    			index = mCon.searchOneByName(title);//특정 곡명 검색 .. 인덱스로
//    			music = mCon.selectOneByIndex(index);//특정 곡명 검색 .. 인덱스로
//    			view.showOneMusic(music);
    			break;
    		case 5 : //곡 삭제
    			title = view.inputMusicName("삭제");
    			index = mCon.searchOneByName(title);
    			if(index == -1) {
    				view.displayError("존재하지 않습니다");
    				break;
    			}
    			mCon.removeMusic(index);
    			view.displaySuccess("삭제 성공!");
    			break;
    		case 6 : //곡정보 수정
    			title = view.inputMusicName("수정"); //이름받기
    			index = mCon.searchOneByName(title);//이름으로 인덱스검색
    			if(index == -1) {
    				view.displayError("조회 실패!");
    				break;
    			}
//    			music = mCon.selectOneByIndex(index);//인덱스로 데이터 가져오기 ->필요없는작업
    			//수정하는 작업
//    			music = view.modifyMusicInfo(music); //가져온 데이터 수정 ⓐ가수명만 바꾸고싶음
    			music = view.modifyMusicInfo(); //가져온 데이터 수정 ⓑ 데이터 안가져오고 바꿀때, 내용 다 바꾸고싶을때
    			mCon.updateMusic(index, music); //저장소로 수정 덮어써
    			view.displaySuccess("수정 성공!");
    			break;
    		case 7 : //곡명 오름차순정렬! 
    			view.printMessage("=== === 곡명 오름차순 정렬=== ===");
    			mCon.sortByTitleASC();
    			break;
    		case 8 : //곡명 내림차순
    			view.printMessage("=== === 곡명 내림차순 정렬=== ===");
    			mCon.sortByTitleDESC();
    			break;
    		case 9 : //가수 오름차순
    			view.printMessage("=== === 가수명 오름차순 정렬=== ===");
    			mCon.sortBySingerASC();
    			break;
    		case 10 : 
    			view.printMessage("=== === 가수명 내림차순 정렬=== ===");
    			mCon.sortBySingerDESC();
    			break;
    		}
    		
    	}while(select != 0);// 0.종료라서ㅇㅇ 브레이크필요없음
    }
}
