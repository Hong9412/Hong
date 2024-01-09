package org.hong.day11.music.controller;

import java.util.ArrayList;
import java.util.List;

import org.hong.day11.music.model.vo.Music;


//저장소 만들기
public class MusicController {
	List<Music> mList;
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	// 마지막 위치에 곡 추가
	public void addMusic(Music music) {
		mList.add(music);
	}
	// 첫 위치에 곡 추가
	public void firstaddMusic(Music music) {
		mList.add(0, music);
	}
	// 곡명으로 검색
	public Music findOneByTitle(String title) {
		// TODO Auto-generated method stub
		for(Music music : mList) {
			if(title.equals(music.getTitle())) {
				return music;
			}
		}
		return null;
	}
	// 전체 곡 출력
	public List<Music> printAllMusics(){
		return mList;
	}
	
	// 특정 곡 삭제
	public void deleteMusic() {
		
	}
	
	// 특정 곡 정보수정
	public void modifyMusic(Music music) {
		int i = 0;
		for(Music mOne : mList) {
			if(music.getTitle().equals(mOne.getTitle())) {
				mList.set(i, music);
				break;
			}else {
				i++;
			}
		}
	}
	// 곡명으로 삭제
	public void removeOne(String title) {
		// TODO Auto-generated method stub
		int i = 0;
		for(Music music : mList) {
			if(title.equals(music.getTitle())) {
				mList.remove(i);
				break;
			}else {
				i++;
			}
		}
	}
	
}