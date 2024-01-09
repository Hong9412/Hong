package org.hong.day11.music.view;

import java.util.List;

import org.hong.day11.music.model.vo.Music;

public interface MusicViewInterface {
	public void launchApp();
	public void printMainMenu();
	public String inputSinger();
	public void printAllMusics(List<Music> mList);
	public void inputMusic();
	public void modifyMusic();
	
}
