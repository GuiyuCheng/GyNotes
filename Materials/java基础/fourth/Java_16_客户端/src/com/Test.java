package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ָ���ͻ���Ҫ���ӵķ�������ip��ַ�Ͷ˿ں�
			Socket socket = new Socket("192.168.0.105", 8888);
			
			//�ͻ������������������
			OutputStream os = socket.getOutputStream();
			os.write("��ã����ǿͻ���".getBytes());
			
			//�ͻ��˽�������
			InputStream is = socket.getInputStream();
			byte b[] = new byte[1024];
			int len = is.read(b);
			String s = new String(b, 0, len);
			System.out.println(s);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
