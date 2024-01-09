package org.hong.day11.music.model.vo;

public class Music {
	private String title;
	private String singer;
	
	public String getTitle() {
		return title;
	}
	// 기본 생성자
	public Music() {}
	
	// 매개변수 있는 생성자(2개의 값을 받음)
	public Music(String title, String singer) {	
		super();
		this.title = title;
		this.singer = singer;
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

	@Override
	public String toString() {
		return "Music [제목=" + title + ", 가수명=" + singer + "]";
	}
}
