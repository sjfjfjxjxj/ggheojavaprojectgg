package com.kh.practice.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.music.model.vo.Music;

public class MusicController {
	private List<Music> mList;

	public MusicController() {
		mList = new ArrayList<Music>();
	}

	/**
	 * 자바독 주석! 메소드 호출한데서 내용 볼수있대 마지막 위치에 곡 추가
	 * 
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}

	/**
	 * 첫위치에 곡 추가
	 * 
	 * @param music
	 */
	public void addAtFirst(Music music) {
		mList.add(0, music);
	}

	/**
	 * 곡 삭제
	 * 
	 * @param index
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}

	/**
	 * 곡 수정
	 * 
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music); // 수정할땐 셋! 쏐ㅆ쎼쏐
	}

	/**
	 * 이름으로 음악 검색(중복 있을 때 전부!)
	 * 
	 * @param title
	 * @return
	 */
	public List<Music> searchMusicsByName(String title) {
		List<Music> findList = new ArrayList<Music>();
		for (Music mOne : mList) {
			if (mOne.getTitle().contentEquals(title)) {
				findList.add(mOne);
			}
		}
		return findList;
	}

	/**
	 * 이름으로 인덱스 조회
	 * 
	 * @param musicName
	 * @return
	 */
	public int searchOneByName(String musicName) {
		for (int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if (musicName.equals(music.getTitle())) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 인덱스로 리스트에서 조회
	 * 
	 * @param index
	 * @return
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index);
	}

	/**
	 * 전체 데이터 조회
	 * 
	 * @return
	 */
	public List<Music> printMusicList() {
		return mList;
	}

	/**
	 * 삽입정렬로,, 곡명으로,,,오름차순으로,,: 인트값이 아니넹,, 한글String비교는 compareTo라는 메소드가 있다! The
	 * operator < is undefined for the argument type(s) java.lang.String,
	 * java.lang.String
	 */
	public void sortByTitleASC() {
//    	int [] nums = { 4, 3, 2, 1};
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e); // 0=같다, <0: 이러면 오름차순이 될것
				if (mOne.getTitle().compareTo(mTwo.getTitle()) < 1) {
					Music temp = mOne; // 태초의자리(!)에 첫곡을 둬.
					mList.set(i, mTwo); // i를 두번째곡으로 바꾼다
					mList.set(e, temp); // e를 맨첫자리로 둔다

				}
//    			if(nums[i] > nums[i+1]);
//    			int temp = nums[i+1];
//    			nums[i+1] = nums[i];
//    			nums[i] = temp;		이것이 인트 버블정렬 ㅜㅜ
			}
		}
	}

	public void sortByTitleDESC() {
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e); // 내림차순!
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 1) {
					Music temp = mOne; // 태초의자리(!)에 첫곡을 둬.
					mList.set(i, mTwo); // i를 두번째곡으로 바꾼다
					mList.set(e, temp); // e를 맨첫자리로 둔다

				}
			}
		}
	}

	/**
	 * 가수이름으로 오름차순
	 */
	public void sortBySingerASC() {
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e);
				if (mOne.getSinger().compareTo(mTwo.getSinger()) < 1) {
					Music temp = mOne; 
					mList.set(i, mTwo); 
					mList.set(e, temp); 
				}
			}
		}
	}

	public void sortBySingerDESC() {
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e);
				if (mOne.getSinger().compareTo(mTwo.getSinger()) > 1) {
					Music temp = mOne; 
					mList.set(i, mTwo);
					mList.set(e, temp); 
				}
			}
		}
	}

}
