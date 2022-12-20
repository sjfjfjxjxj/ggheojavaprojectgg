package com.kh.practice.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.music.model.vo.Music;

//뷰에서 메뉴작성
public class MusicView {
    public int musicMenu() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("=== === 메인 메뉴 === ===");
    	System.out.println("1. 마지막 위치에 곡 추가");
    	System.out.println("2. 첫 위치에 곡 추가");
    	System.out.println("3. 전체 곡 목록 출력");
    	System.out.println("4. 특정 곡명 검색");
    	System.out.println("5. 특정 곡 삭제");
    	System.out.println("6. 특정 곡 정보 수정");
    	System.out.println("7. 곡명 오름 차순 정렬");
    	System.out.println("8. 곡명 내림 차순 정렬");
    	System.out.println("9. 가수명 오름차순 정렬");
    	System.out.println("10. 가수명 내림차순 정렬");
    	System.out.println("0. 종료");
    	System.out.print("메뉴선택>> ");
    	int value = sc.nextInt();
    	return value;
    	
    }
    
    public Music inputMusicInfo(String location) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(location + " 위치에 곡 추가");
    	System.out.print("곡명 : ");
    	String title =sc.nextLine(); //nextLine만 썼음 개행제거 不必
    	System.out.print("가수명 : ");
    	String singer =sc.nextLine();
    	//두개의 정보를 하나의 변수로 다루기 위해 객체 필요
    	Music music = new Music(title, singer);
    	return music;
    }
    
    public String inputMusicName(String gubun) {
    	Scanner sc = new Scanner(System.in);
		System.out.print(gubun+"할 곡 입력 : ");
		String title = sc.nextLine();
		return title;
	}
    
    /**
     * 가수명만 바꾸게끔 하는거
     * @param music
     * @return
     */
//    public Music modifyMusicInfo(Music music) {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("수정할 가수명 입력 : ");
//    	String singer = sc.nextLine();
//    	music.setSinger(singer);
//    	return music;
//    }
    /**
     * 위에 애 오버로딩한거. 가수명, 곡명 다 바꾸고싶을떄!
     * @return
     */
    public Music modifyMusicInfo() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("수정할 곡명 입력 : ");
    	String title = sc.nextLine();
    	System.out.println("수정할 가수명 입력 : ");
    	String singer = sc.nextLine();
    	Music music = new Music(title, singer);
    	return music;
    }
    

	public void showAllMusicList(List<Music> mList) {
    	System.out.println("=== === === 전체 곡 목록 출력 === === ===");
    	for(int i = 0; i < mList.size(); i++) {
    		Music music = mList.get(i);
    		System.out.println((i+1) + "번째 노래-> 곡명 : " + music.getTitle() + ", "+ "가수명 : " + music.getSinger());
    		
    		System.out.println("=========================================");
    	}
    }
    
	public void showOneMusic(Music music) {
		System.out.println("검색한 곡의 곡명은 : " + music.getTitle() + ", "+ "가수명은 : " + music.getSinger() + "입니다");
		
	}
    public void displaySuccess(String message) {
    	System.out.println("[서비스 성공] : " + message);
    }
    public void displayError(String message) {
    	System.out.println("[서비스 실패] : " + message);
    }
    
    public void printMessage(String message) {
    	System.out.println(message);
    }
}
