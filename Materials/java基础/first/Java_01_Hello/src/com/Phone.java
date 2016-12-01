package com;

public class Phone {
	private String brand;
	private String type;
	private int price;
	private float size;
	private int weight = 100;
	
	//Alt + ? �Զ���ʾ
	//Construct ����
	public Phone(String brand, String type, int price, float size) {
		//this��ʾ��ǰ���������
		//this.����   = �β�
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.size = size;
	}
	
	//һ�����������ж�����췽�������ǲ���������벻ͬ������������ͬ���߲������Ͳ�ͬ��
	public Phone(){
		brand = "����";
		type = "T";
		price = 1800;
		size = 5.0f;
	}
	
	public void sendMessage(){
		System.out.println(brand + type + "������");
	}
	
	public void call(){
		System.out.println(brand + type + "��绰");
	}
	
	public void web(){
		System.out.println(brand + type + "����");
	}
	
	public void setWeight(int weight){
		if(weight >= 0){
			this.weight = weight;
		}
	}
	
	public int getWeight(){
		return weight;
	}
	
	private void printInfo(){
		
	}
}
