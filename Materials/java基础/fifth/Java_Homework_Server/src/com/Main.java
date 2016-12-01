package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		try {
			ss = new ServerSocket(3456);
			System.out.println("�ȴ��ͻ�������...");
			//�����Ƿ��пͻ������Ӹ÷�����
			socket = ss.accept();
			
			//�������Կͻ��˵�����
			is = socket.getInputStream();
			byte b[] = new byte[1024];
			int num = is.read(b);
			String s = new String(b, 0, num);
			System.out.println(s);
			
			//����
			String result = "����������õ���" + getResult(s, getOperator(s));
			
			//��ͻ��˷�������
			os = socket.getOutputStream();
			os.write(result.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				os.close();
				is.close();
				socket.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	private static String getOperator(String athi){
		if(athi.indexOf("+") != -1){
			return "+";
		}
		else if(athi.indexOf("-") != -1){
			return "-";
		}
		else if(athi.indexOf("*") != -1){
			return "*";
		}
		else if(athi.indexOf("/") != -1){
			return "/";
		}
		return "+";
	}
	
	private static String getResult(String athi, String operator){
		
		//12+14
		int index = athi.indexOf(operator);
		int temp_01 = Integer.parseInt(athi.substring(0, index));
		int temp_02 = Integer.parseInt(athi.substring(index+1));
		System.out.println(temp_01);
		System.out.println(temp_02);
		
		if(operator.equals("+")){
			return String.valueOf(temp_01+temp_02);
		}else if(operator.equals("-")){
			return String.valueOf(temp_01-temp_02);
		}else if(operator.equals("*")){
			return String.valueOf(temp_01*temp_02);
		}else if(operator.equals("/")){
			return String.valueOf(temp_01/temp_02);
		}
		
		return "����ʧ��";
	}
}
