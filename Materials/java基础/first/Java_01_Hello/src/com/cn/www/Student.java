package com.cn.www;

/**
 * alt + shift + j �ĵ�ע��
 * @author Administrator
 * 
 * ѧ���࣬����ѧ������Ϣ��id,name,score
 */
public class Student {
	
	/**
	 * ѧ��id��ÿ��id�����ظ�
	 */
	private int id;
	
	/**
	 * ѧ������
	 */
	private String name;
	/**
	 * ѧ����ѧ�γ̵ķ���
	 */
	private int score;
	
	/**
	 *  ��ʼ������
	 * @param _id    id��
	 * @param _name  ����
	 * @param _score ����
	 * 
	 *
	 */
	public Student(int _id, String _name, int _score){
		id = _id;
		name = _name;
		score = _score;
		
	}
	
	
	/**
	 * ��ȡ��ǰѧ�����������
	 * @return ����
	 * 
	 * 
	 */
	public String getName(){
		
		System.out.println(name);
		return name;
	}
	
	/**
	 * ��ȡ��ǰѧ�������id
	 * @return id
	 */
	public int getId(){
		System.out.println(id);
		
		return id;
	}
	
	/**
	 * ��ӡѧ��������Ϣ
	 */
	public void display(){
		System.out.println(id + name + score);
		
	}
}
