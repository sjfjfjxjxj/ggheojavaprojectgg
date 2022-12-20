package com.kh.practice.music.model.vo;
//무슨 기능을 할것인가 먼저 생각
public class Music {
    //곡명
	private String title;
	//가수명
	private String singer;
	
	
	//매개변수 있는 생성자~
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	//개터쌔터~~
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
	
	//투스트링~~~
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
}
