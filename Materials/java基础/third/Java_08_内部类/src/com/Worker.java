package com;

import com.Student.BirthDay;

public class Worker {
	private int id;
	private String name;
	private BirthDay birth;
	
	public static void main(String[] args) {
		Worker worker = new Worker();
	}
	
	public Worker() {
		// TODO Auto-generated constructor stub
		id = 0;
		name = "jack";
		//ʹ�������ڲ��ഴ������
		//����һ��û�����ֵ��ࣨ�����ࣩ�̳���BirthDay��������һ�����������
		birth = new BirthDay(){
			int a;
			{
				System.out.println(a);
			};
			void getName(){
				name = "Ivy";
			}
			
			void getId(){
				System.out.println("id = " + id);
			}
		};
		
		//����һ���������ڲ�����󡣸�������ʵ����InterA�ӿڡ�
		InterA a = new InterA(){
			@Override
			public void a() {
				// TODO Auto-generated method stub
				System.out.println("aaaa");
			}
		};
	}
	
	interface InterA{
		public void a();
	}
	
	
	// �ڲ���
	class BirthDay {
		int year;
		int month;
		int day;

		void getId() {
			//���ڲ����п��Է��ʵ�ǰ������г�Ա������˽�У�
			id = 10;
		}
	}
}
