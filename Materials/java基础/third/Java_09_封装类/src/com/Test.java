package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Integer ii = new Integer(10);
		
		Integer i_01  = new Integer(11);
		Integer i_02  = new Integer(11);
		//比地址
		System.out.println(i_01 == i_02);
		
		//比内容
		System.out.println(i_01.equals(i_02));
		
		//自动装箱。将基本数据类型自动转化为引用数据类型
		Integer kk = 100;
		//自动拆箱。将引用数据类型自动转化为基本数据类型
		int ww = new Integer(100);
	}

}
