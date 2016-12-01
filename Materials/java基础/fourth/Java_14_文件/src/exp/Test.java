package exp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 读取文件中的内容
		// InputStream 字节读取 图片，音频，视频等
		// Reader 字符读取 通常用来读文本文件

		// 使用字符流读取a.txt文件中的内容
		try {
			FileReader fr = new FileReader(new File("E:/a.txt"));
			char c[] = new char[10];
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while ((len = fr.read(c)) != -1) {
				String s = new String(c, 0, len);
				sb.append(s);
			}
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 使用字节流读取文本文件
		try {
			FileInputStream fis = new FileInputStream(new File("E:/a.txt"));
			// fis.available()得到读入的有效字符个数
			byte b[] = new byte[fis.available()];
			fis.read(b);
			// 字节数组转化为字符串
			String s = new String(b);
			System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 使用字符流写文件内容
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入内容");
		String value = scanner.next();
		try {
			FileWriter fw = new FileWriter(new File("E:/b.txt"));
			fw.write(value);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 使用字节流写文件
		try {
			FileOutputStream fos = new FileOutputStream(new File("E:/c.txt"));
			// getBytes将字符串转化为字节数组
			fos.write(value.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 练习：将E盘的图片复制到E:/my文件夹下

		//缓冲读
		try {
			BufferedReader br = new BufferedReader(new FileReader("E:/d.txt"));
			String s = null;
			while((s = br.readLine()) != null){
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//缓冲写
		String ss = "ab1\r\nab2\r\nab3\r\n";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:/e.txt")));
			bw.write(ss);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
