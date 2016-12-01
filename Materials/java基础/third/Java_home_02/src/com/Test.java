package com;

import exp.XiaoMingDoor;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WuMingFen wmf_01 = new WuMingFen();
		wmf_01.check();
		
		WuMingFen wmf_02 = new WuMingFen("≈£»‚√Ê", 3, false);
		wmf_02.check();
		
		WuMingFen wmf_03 = new WuMingFen("À·¿±∑€", 4);
		wmf_03.check();
		
		
		XiaoMingDoor door = new XiaoMingDoor("–°√˜");
		door.open();
		door.bulletProof();
		
	}

}
