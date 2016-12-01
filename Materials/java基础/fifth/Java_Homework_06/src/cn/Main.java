package cn;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������������ʽ��");
		Scanner scanner = new Scanner(System.in);
		String athi = scanner.next();
		System.out.println(athi);
		
		Socket socket = null;
		OutputStream ops = null;
		InputStream is = null;
		try {
			//��������
			socket = new Socket("127.0.0.1", 3456);
			
			//���������������
			ops = socket.getOutputStream();
			ops.write(athi.getBytes());
			
			
			//���շ��������͵�����
			is = socket.getInputStream();
//			System.out.println(is.available());
			byte b[] = new byte[1024];
			int num = is.read(b);
			String r = new String(b, 0, num);
			System.out.println(r);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				is.close();
				ops.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
