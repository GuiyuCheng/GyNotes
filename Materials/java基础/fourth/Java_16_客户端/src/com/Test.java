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
			//指定客户端要连接的服务器的ip地址和端口号
			Socket socket = new Socket("192.168.0.105", 8888);
			
			//客户端向服务器发送数据
			OutputStream os = socket.getOutputStream();
			os.write("你好！我是客户端".getBytes());
			
			//客户端接收数据
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
