package com;

/**
 * @author Administrator
 * 定义一个播放音乐的接口
 * 
 * 接口中只能存放抽象方法  可以省略abstract关键字
 * 接口中只能放静态常量     可以省略static final关键字
 */
public interface InterPlayMusic {
	
	int a = 10;
	
	public abstract void playMusic();
}
