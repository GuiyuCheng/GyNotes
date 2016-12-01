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
			
			//监听是否有客户端连接。阻塞函数，如果没有客户端连接，程序被阻塞在该行。
			System.out.println("等待客户端连接...");
			Socket socket = ss.accept();
			
			//接收客户端的数据
			InputStream is = socket.getInputStream();
			byte b[] = new byte[1024];
			int len = is.read(b);
			String s = new String(b, 0, len);
			System.out.println(s);
			
			//向客户端发送数据
			OutputStream os = socket.getOutputStream();
			os.write("你好！我是服务器".getBytes());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
