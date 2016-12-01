package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shape = displayShap(9);
		
		File file = new File("E:/shape.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(shape);
//			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fw.close(); //关闭流的时候，会将缓冲区的内容全部输出
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	public static String displayShap(int h){
		
		StringBuffer sb = new StringBuffer();
		
		int right = h/2, left = h/2;
		for (int i = 0; i < h; i++) {
			
			for(int j=0; j<h; j++){
				if(j >= left && j <= right){
					sb.append("*");
				}else{
					sb.append(" ");
				}
			}
			if(i<h/2){
				left--;
				right++;
			}else{
				left++;
				right--;
			}
			sb.append("\r\n");
		}
		
		return sb.toString();
	}
}
