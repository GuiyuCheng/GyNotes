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
		
		//����ļ��Ƿ����
		System.out.println(f_01.exists());
		System.out.println(f_02.exists());
		System.out.println(f_03.exists());
		
		//�����ļ�
		try {
			f_02.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�����ļ���
		f_03.mkdir();
		
		File fE = new File("E:/");
		//�г�E:�µ������ļ����������غ��ܱ������ļ�
		File fs[] = fE.listFiles();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i].getName());
		}
		
		File f360 = new File("E:/360downloads");
		
		//�õ��ļ����޸�ʱ�����1970.1.1�ŵ�ʱ���Ժ���Ϊ��λ��
		long modifyTime = f_02.lastModified();
		System.out.println(modifyTime);
		
		//��ʽ��ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String mt = sdf.format(new Date(modifyTime));
		System.out.println(mt);
		
		//�õ��ļ��Ĵ�С�����ֽ�Ϊ��λ
		long length = f_01.length();
		System.out.println(length);
		
		//
		File fileP = new File("E:/my").getParentFile();
		System.out.println("++++" + fileP);
		
	}

}
