package com;

public class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int guessNumber() {

		return (int) (Math.random() * 10);
	}
}
