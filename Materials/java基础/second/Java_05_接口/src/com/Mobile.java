package com;

public class Mobile implements InterPlayMusic{
	public void call(){
		System.out.println("打电话");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("播放音乐");
	}
	
	
}
