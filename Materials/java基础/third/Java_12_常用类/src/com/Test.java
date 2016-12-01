package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 字符串类 String, StringBuffer

		// 字符串的内容无法改变

		String s_01 = new String("abc");
		String s_02 = new String("abc");
		String s_03 = "abc";
		String s_04 = "abc";
		String s_05 = "a" + "bc";

		System.out.println(s_01 == s_02);
		System.out.println(s_03 == s_04);// 都指向常量区的"abc"
		System.out.println(s_03 == s_05);
		System.out.println(s_01 == s_03);// s_01指向堆区"abc", s_03指向常量区"abc"

		char c[] = { 'a', 'b', 'c', 'd' };
		// 构造字符串对象：1.字符数组转化为字符串 2.字节数组转化为字符串
		String s_06 = new String(c, 1, 2); // 字符数组c从下标为1的位置截取2个字符，转换为字符串
		System.out.println(s_06);

		String s_07 = "adecwu";
		char cc = s_07.charAt(2);
		System.out.println(cc);

		// compareTo(String anotherString)
		int r = s_07.compareTo("adfcwu");
		System.out.println(r);
		// concat(String str)
		String rr = s_07.concat("eee"); // 连接字符串，生成一个新串
		System.out.println(s_07);
		System.out.println(rr);

		// endsWith(String suffix)
		String s_08 = "abc.txt";
		boolean is = s_08.endsWith(".txt"); // 检测字符串尾
		System.out.println(is);
		// startsWith(String prefix)
		boolean isis = s_08.startsWith("ab");// 检测字符串头
		System.out.println(isis);

		// equals(Object anObject)
		System.out.println(s_08.equals("abc.txt"));

		// indexOf(char ch)
		String s_09 = "abcabc";
		System.out.println(s_09.indexOf("bc")); // 从前往后搜索字符或者字符串，返回下标值

		// lastIndexOf(int ch)
		System.out.println(s_09.lastIndexOf("bc"));// 从后往前搜

		// length()
		System.out.println(s_09.length());

		// split(String regex)
		String s_10 = "abcaaacde";
		String sss[] = s_10.split("c"); // 用c分割字符串
		for (int i = 0; i < sss.length; i++) {
			System.out.println(sss[i]);
		}

		// substring(int beginIndex, int endIndex)
		System.out.println(s_10.subSequence(2, 5)); // 通过下标截取字符串

		// toLowerCase()
		String s_11 = "AVBee";
		System.out.println(s_11.toUpperCase()); // 小写转化为大写
		// toUpperCase()
		System.out.println(s_11.toLowerCase()); // 大写转小写
		System.out.println(s_11);
		// valueOf()
		String s_12 = String.valueOf(2.13); // 将基本数据类型转化为字符串

		// trim()
		String s_13 = "  a bc  ";
		System.out.println(s_13.trim()); // 去掉字符串左右两边的空格

		String s_14 = "ui";
		String result = "abc" + s_14 + "kk" + "ee"; // 运算时，产生7个字符串对象

		// StringBuffer 字符缓冲
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append(s_14); // 连接字符串
		System.out.println(sb);
		sb.append("kk");
		sb.append("ee");
		System.out.println(sb); // 4
		// sb.append(s_14).append("kk").append("ee");

		System.out.println(sb.length()); // 得到字符缓冲区中字符的数量
		System.out.println(sb.capacity()); // 容积，字符缓冲区可以容纳的字符数量

		// sb.charAt(index)
		// sb.indexOf(str)

		// 容器类 ArrayList, HashMap
		// 容器类中存放的元素必须是引用数据类型(容器中只能放对象)
		ArrayList<String> al = new ArrayList<String>();
		//向链表中添加元素
		al.add("abc");
		al.add("www");
		String ssss = "iiii";
		al.add(ssss);
		//统计链表中元素的个数
		System.out.println(al.size());
		//通过下标删除链表中的元素
		al.remove(0);
		//取出链表中所有元素
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.add("aew");
		System.out.println(al); //输出链表所有元素
		
		al.set(0, "ooo");      //通过下标修改链表中的元素
		System.out.println(al);
		
		//通过对象名删除链表中的元素
		al.remove(ssss);
		System.out.println(al);
		
		//（key，value)
		HashMap<String, Integer> si = new HashMap<String, Integer>();
		//向hashmap中存放元素
		si.put("01", 100);
		si.put("02", 110);
		si.put("03", 120);
		
		System.out.println(si);
		//通过key值，从hashmap中取出元素
		System.out.println(si.get("02"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名");
		String rs = scanner.next(); //等待键盘输入字符串，按回车结束。
		System.out.println("rs = " + rs);
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		System.out.println("age = " + age);
		
	}
}
