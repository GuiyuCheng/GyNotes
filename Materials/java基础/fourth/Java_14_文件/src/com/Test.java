package com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f_01 = new File("E:/a.txt");
		File f_02 = new File("E:/b.txt");
		File f_03 = new File("E:/my");
		
		//检测文件是否存在
		System.out.println(f_01.exists());
		System.out.println(f_02.exists());
		System.out.println(f_03.exists());
		
		//创建文件
		try {
			f_02.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//创建文件夹
		f_03.mkdir();
		
		File fE = new File("E:/");
		//列出E:下的所有文件，包括隐藏和受保护的文件
		File fs[] = fE.listFiles();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i].getName());
		}
		
		File f360 = new File("E:/360downloads");
		
		//得到文件夹修改时间距离1970.1.1号的时间差（以毫秒为单位）
		long modifyTime = f_02.lastModified();
		System.out.println(modifyTime);
		
		//格式化时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String mt = sdf.format(new Date(modifyTime));
		System.out.println(mt);
		
		//得到文件的大小，以字节为单位
		long length = f_01.length();
		System.out.println(length);
		
		//
		File fileP = new File("E:/my").getParentFile();
		System.out.println("++++" + fileP);
		
	}

}
