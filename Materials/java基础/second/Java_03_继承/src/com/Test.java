package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��ѧ���ࣺ���ԣ�ѧ�ţ�����������
		//		            ��Ϊ:�ϿΣ����ԣ��¿Σ��Է���˯��
		//����һ�������ࣺ���ԣ����ţ�����������
		//          ��Ϊ�����������գ��Ź����Է���˯��
		//����һ����ʦ�ࣺ���ԣ���ţ�����������
		//          ��Ϊ���ϿΣ�����ҵ���¿Σ��Է���˯��
		
		//�������зֱ𴴽���һ��ѧ������һ�����˶���һ����ʦ���󡣲���ִ�����ǵ��ճ���Ϊ��
		
		Student student = new Student(111, "ѧ��1", 15);
		Worker worker = new Worker(1111, "����1", 40);
		Teacher teacher = new Teacher(11, "��ʦ1", 30);
		
		student.eat();
		student.sleep();
		worker.eat();
		worker.sleep();
		teacher.eat();
		teacher.sleep();
		
		//��ӡ������ε������Բ�ε�������ȱ������ε����
		//�����ࣺ��͸ߣ������
		//Բ���ࣺ�뾶������� Math.PI
		//�ȱ������Σ��߳�������� Math.sin
		
		//���ࣺ�߳�1���߳�2�������
		
	}

}
