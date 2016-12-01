package com;

public class GuessGame {

	public void startGame() {
		Player p_01 = new Player("A");
		Player p_02 = new Player("B");
		Player p_03 = new Player("C");

		int systemRadomNumber = (int) (Math.random() * 10);
		System.out.println("系统产生随机数：" + systemRadomNumber);
		while (true) {
			int number_01 = p_01.guessNumber();
			int number_02 = p_02.guessNumber();
			int number_03 = p_03.guessNumber();

			System.out.println(p_01.getName() + "猜到的数字为" + number_01);
			System.out.println(p_02.getName() + "猜到的数字为" + number_02);
			System.out.println(p_03.getName() + "猜到的数字为" + number_03);

			boolean is = false;
			if (number_01 == systemRadomNumber) {
				System.out.println(p_01.getName() + "猜中");
				is = true;
			}
			if (number_02 == systemRadomNumber) {
				System.out.println(p_02.getName() + "猜中");
				is = true;
			}
			if (number_03 == systemRadomNumber) {
				System.out.println(p_03.getName() + "猜中");
				is = true;
			}
			if (is) {
				break;
			}

			System.out.println("都没猜中，继续");
		}
	}
}
