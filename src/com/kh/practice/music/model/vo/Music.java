package com.kh.practice.music.model.vo;
//���� ����� �Ұ��ΰ� ���� ����
public class Music {
    //���
	private String title;
	//������
	private String singer;
	
	
	//�Ű����� �ִ� ������~
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	//���ͽ���~~
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	//����Ʈ��~~~
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
}
