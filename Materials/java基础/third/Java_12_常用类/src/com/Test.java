package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// �ַ����� String, StringBuffer

		// �ַ����������޷��ı�

		String s_01 = new String("abc");
		String s_02 = new String("abc");
		String s_03 = "abc";
		String s_04 = "abc";
		String s_05 = "a" + "bc";

		System.out.println(s_01 == s_02);
		System.out.println(s_03 == s_04);// ��ָ��������"abc"
		System.out.println(s_03 == s_05);
		System.out.println(s_01 == s_03);// s_01ָ�����"abc", s_03ָ������"abc"

		char c[] = { 'a', 'b', 'c', 'd' };
		// �����ַ�������1.�ַ�����ת��Ϊ�ַ��� 2.�ֽ�����ת��Ϊ�ַ���
		String s_06 = new String(c, 1, 2); // �ַ�����c���±�Ϊ1��λ�ý�ȡ2���ַ���ת��Ϊ�ַ���
		System.out.println(s_06);

		String s_07 = "adecwu";
		char cc = s_07.charAt(2);
		System.out.println(cc);

		// compareTo(String anotherString)
		int r = s_07.compareTo("adfcwu");
		System.out.println(r);
		// concat(String str)
		String rr = s_07.concat("eee"); // �����ַ���������һ���´�
		System.out.println(s_07);
		System.out.println(rr);

		// endsWith(String suffix)
		String s_08 = "abc.txt";
		boolean is = s_08.endsWith(".txt"); // ����ַ���β
		System.out.println(is);
		// startsWith(String prefix)
		boolean isis = s_08.startsWith("ab");// ����ַ���ͷ
		System.out.println(isis);

		// equals(Object anObject)
		System.out.println(s_08.equals("abc.txt"));

		// indexOf(char ch)
		String s_09 = "abcabc";
		System.out.println(s_09.indexOf("bc")); // ��ǰ���������ַ������ַ����������±�ֵ

		// lastIndexOf(int ch)
		System.out.println(s_09.lastIndexOf("bc"));// �Ӻ���ǰ��

		// length()
		System.out.println(s_09.length());

		// split(String regex)
		String s_10 = "abcaaacde";
		String sss[] = s_10.split("c"); // ��c�ָ��ַ���
		for (int i = 0; i < sss.length; i++) {
			System.out.println(sss[i]);
		}

		// substring(int beginIndex, int endIndex)
		System.out.println(s_10.subSequence(2, 5)); // ͨ���±��ȡ�ַ���

		// toLowerCase()
		String s_11 = "AVBee";
		System.out.println(s_11.toUpperCase()); // Сдת��Ϊ��д
		// toUpperCase()
		System.out.println(s_11.toLowerCase()); // ��дתСд
		System.out.println(s_11);
		// valueOf()
		String s_12 = String.valueOf(2.13); // ��������������ת��Ϊ�ַ���

		// trim()
		String s_13 = "  a bc  ";
		System.out.println(s_13.trim()); // ȥ���ַ����������ߵĿո�

		String s_14 = "ui";
		String result = "abc" + s_14 + "kk" + "ee"; // ����ʱ������7���ַ�������

		// StringBuffer �ַ�����
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append(s_14); // �����ַ���
		System.out.println(sb);
		sb.append("kk");
		sb.append("ee");
		System.out.println(sb); // 4
		// sb.append(s_14).append("kk").append("ee");

		System.out.println(sb.length()); // �õ��ַ����������ַ�������
		System.out.println(sb.capacity()); // �ݻ����ַ��������������ɵ��ַ�����

		// sb.charAt(index)
		// sb.indexOf(str)

		// ������ ArrayList, HashMap
		// �������д�ŵ�Ԫ�ر�����������������(������ֻ�ܷŶ���)
		ArrayList<String> al = new ArrayList<String>();
		//�����������Ԫ��
		al.add("abc");
		al.add("www");
		String ssss = "iiii";
		al.add(ssss);
		//ͳ��������Ԫ�صĸ���
		System.out.println(al.size());
		//ͨ���±�ɾ�������е�Ԫ��
		al.remove(0);
		//ȡ������������Ԫ��
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.add("aew");
		System.out.println(al); //�����������Ԫ��
		
		al.set(0, "ooo");      //ͨ���±��޸������е�Ԫ��
		System.out.println(al);
		
		//ͨ��������ɾ�������е�Ԫ��
		al.remove(ssss);
		System.out.println(al);
		
		//��key��value)
		HashMap<String, Integer> si = new HashMap<String, Integer>();
		//��hashmap�д��Ԫ��
		si.put("01", 100);
		si.put("02", 110);
		si.put("03", 120);
		
		System.out.println(si);
		//ͨ��keyֵ����hashmap��ȡ��Ԫ��
		System.out.println(si.get("02"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String rs = scanner.next(); //�ȴ����������ַ��������س�������
		System.out.println("rs = " + rs);
		System.out.println("����������");
		int age = scanner.nextInt();
		System.out.println("age = " + age);
		
	}
}
