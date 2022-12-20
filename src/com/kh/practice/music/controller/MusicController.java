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
	 * �ڹٵ� �ּ�! �޼ҵ� ȣ���ѵ��� ���� �����ִ� ������ ��ġ�� �� �߰�
	 * 
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}

	/**
	 * ù��ġ�� �� �߰�
	 * 
	 * @param music
	 */
	public void addAtFirst(Music music) {
		mList.add(0, music);
	}

	/**
	 * �� ����
	 * 
	 * @param index
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}

	/**
	 * �� ����
	 * 
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music); // �����Ҷ� ��! �������
	}

	/**
	 * �̸����� ���� �˻�(�ߺ� ���� �� ����!)
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
	 * �̸����� �ε��� ��ȸ
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
	 * �ε����� ����Ʈ���� ��ȸ
	 * 
	 * @param index
	 * @return
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index);
	}

	/**
	 * ��ü ������ ��ȸ
	 * 
	 * @return
	 */
	public List<Music> printMusicList() {
		return mList;
	}

	/**
	 * �������ķ�,, �������,,,������������,,: ��Ʈ���� �ƴϳ�,, �ѱ�String�񱳴� compareTo��� �޼ҵ尡 �ִ�! The
	 * operator < is undefined for the argument type(s) java.lang.String,
	 * java.lang.String
	 */
	public void sortByTitleASC() {
//    	int [] nums = { 4, 3, 2, 1};
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e); // 0=����, <0: �̷��� ���������� �ɰ�
				if (mOne.getTitle().compareTo(mTwo.getTitle()) < 1) {
					Music temp = mOne; // �������ڸ�(!)�� ù���� ��.
					mList.set(i, mTwo); // i�� �ι�°������ �ٲ۴�
					mList.set(e, temp); // e�� ��ù�ڸ��� �д�

				}
//    			if(nums[i] > nums[i+1]);
//    			int temp = nums[i+1];
//    			nums[i+1] = nums[i];
//    			nums[i] = temp;		�̰��� ��Ʈ �������� �̤�
			}
		}
	}

	public void sortByTitleDESC() {
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e); // ��������!
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 1) {
					Music temp = mOne; // �������ڸ�(!)�� ù���� ��.
					mList.set(i, mTwo); // i�� �ι�°������ �ٲ۴�
					mList.set(e, temp); // e�� ��ù�ڸ��� �д�

				}
			}
		}
	}

	/**
	 * �����̸����� ��������
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
