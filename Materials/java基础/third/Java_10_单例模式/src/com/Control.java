package com;

public class Control {
	public static Control instance;
	
	private Control() {
		// TODO Auto-generated constructor stub
	}
	
	public static Control getInstance(){
		if(instance == null){
			instance = new Control();
		}
		return instance;
	}
}
