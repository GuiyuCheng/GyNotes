package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(8888);
			
			//�����Ƿ��пͻ������ӡ��������������û�пͻ������ӣ����������ڸ��С�
			System.out.println("�ȴ��ͻ�������...");
			Socket socket = ss.accept();
			
			//���տͻ��˵�����
			InputStream is = socket.getInputStream();
			byte b[] = new byte[1024];
			int len = is.read(b);
			String s = new String(b, 0, len);
			System.out.println(s);
			
			//��ͻ��˷�������
			OutputStream os = socket.getOutputStream();
			os.write("��ã����Ƿ�����".getBytes());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
