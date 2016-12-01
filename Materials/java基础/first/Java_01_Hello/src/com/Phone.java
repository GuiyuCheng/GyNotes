package com;

public class Phone {
	private String brand;
	private String type;
	private int price;
	private float size;
	private int weight = 100;
	
	//Alt + ? 自动提示
	//Construct 构造
	public Phone(String brand, String type, int price, float size) {
		//this表示当前对象的引用
		//this.属性   = 形参
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.size = size;
	}
	
	//一个类中允许有多个构造方法，但是参数链表必须不同（参数个数不同或者参数类型不同）
	public Phone(){
		brand = "锤子";
		type = "T";
		price = 1800;
		size = 5.0f;
	}
	
	public void sendMessage(){
		System.out.println(brand + type + "发短信");
	}
	
	public void call(){
		System.out.println(brand + type + "打电话");
	}
	
	public void web(){
		System.out.println(brand + type + "上网");
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
