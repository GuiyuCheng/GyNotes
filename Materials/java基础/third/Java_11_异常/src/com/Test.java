package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	static Student student;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ʱ�쳣
		// int array[] = {0, 1, 2};
		// array[3] = 10; //�׳�һ���쳣�����ж�ָ������˳���֮��Ĵ��벻��ִ��
		//
		// System.out.println("ָ��жϣ������˳�");

		// ��ָ���쳣
		// student.getScore(); //NullPointerException

		// �����쳣
		// int a = 10, b = 0; //ArithmeticException
		// int c = a/b;

		// �����鳤���쳣
		// int array[] = new int[-4];//NegativeArraySizeException

		// ����ת���쳣
		// People p = new Worker(); //ClassCastException
		// Student s = (Student)p;
		
		//���ָ�ʽ�쳣
//		String s = "123a"; //NumberFormatException
//		//���ַ���ת��Ϊ����
//		int iii = Integer.parseInt(s);
//		System.out.println(iii);

		//---------��������ʱ�쳣�����Ƽ��ģ�����ʱ�쳣�����ڱ�̴����µģ����Կ����޸�bug������----------
		//try�з��ÿ��ܲ����쳣�����
		//һ���׳��쳣��ִ��catch��䣬�����쳣�����������ֹ��
		try {
			int array[] = new int[-4];// NegativeArraySizeException

		} catch (NegativeArraySizeException e) {
			System.out.println("�����쳣");
		} finally{
			System.out.println("�����Ƿ��׳��쳣������ִ�и���䡣");
		}

		System.out.println("�������ִ��");
		
		//-----------���������ʱ�쳣--------------------------------------------
		try {
			FileInputStream fis = new FileInputStream(new File("E:/a.txt"));
			byte b[] = new byte[1024];
			fis.read(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("E���Ҳ���a.txt�ļ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//
	}

}
