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
		//�ȵ�ַ
		System.out.println(i_01 == i_02);
		
		//������
		System.out.println(i_01.equals(i_02));
		
		//�Զ�װ�䡣���������������Զ�ת��Ϊ������������
		Integer kk = 100;
		//�Զ����䡣���������������Զ�ת��Ϊ������������
		int ww = new Integer(100);
	}

}
