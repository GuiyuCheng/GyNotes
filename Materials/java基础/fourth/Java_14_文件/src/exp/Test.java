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
		// ��ȡ�ļ��е�����
		// InputStream �ֽڶ�ȡ ͼƬ����Ƶ����Ƶ��
		// Reader �ַ���ȡ ͨ���������ı��ļ�

		// ʹ���ַ�����ȡa.txt�ļ��е�����
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

		// ʹ���ֽ�����ȡ�ı��ļ�
		try {
			FileInputStream fis = new FileInputStream(new File("E:/a.txt"));
			// fis.available()�õ��������Ч�ַ�����
			byte b[] = new byte[fis.available()];
			fis.read(b);
			// �ֽ�����ת��Ϊ�ַ���
			String s = new String(b);
			System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ʹ���ַ���д�ļ�����
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String value = scanner.next();
		try {
			FileWriter fw = new FileWriter(new File("E:/b.txt"));
			fw.write(value);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ʹ���ֽ���д�ļ�
		try {
			FileOutputStream fos = new FileOutputStream(new File("E:/c.txt"));
			// getBytes���ַ���ת��Ϊ�ֽ�����
			fos.write(value.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��ϰ����E�̵�ͼƬ���Ƶ�E:/my�ļ�����

		//�����
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
		
		//����д
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
