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

		// 运行时异常
		// int array[] = {0, 1, 2};
		// array[3] = 10; //抛出一个异常对象，中断指令，程序退出，之后的代码不会执行
		//
		// System.out.println("指令被中断，程序退出");

		// 空指针异常
		// student.getScore(); //NullPointerException

		// 算术异常
		// int a = 10, b = 0; //ArithmeticException
		// int c = a/b;

		// 负数组长度异常
		// int array[] = new int[-4];//NegativeArraySizeException

		// 类型转换异常
		// People p = new Worker(); //ClassCastException
		// Student s = (Student)p;
		
		//数字格式异常
//		String s = "123a"; //NumberFormatException
//		//将字符串转换为整型
//		int iii = Integer.parseInt(s);
//		System.out.println(iii);

		//---------捕获运行时异常，不推荐的，运行时异常是由于编程错误导致的，所以可以修改bug来避免----------
		//try中放置可能产生异常的语句
		//一旦抛出异常，执行catch语句，捕获异常，避免程序终止。
		try {
			int array[] = new int[-4];// NegativeArraySizeException

		} catch (NegativeArraySizeException e) {
			System.out.println("捕获到异常");
		} finally{
			System.out.println("无论是否抛出异常，都会执行该语句。");
		}

		System.out.println("程序继续执行");
		
		//-----------捕获非运行时异常--------------------------------------------
		try {
			FileInputStream fis = new FileInputStream(new File("E:/a.txt"));
			byte b[] = new byte[1024];
			fis.read(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("E盘找不到a.txt文件");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//
	}

}
