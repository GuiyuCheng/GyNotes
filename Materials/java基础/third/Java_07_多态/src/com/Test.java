package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//父类型的引用指向一个子类型的对象
//		Phone p = new CellPhone();
//		Phone p_ = new SmartPhone();
//		
//		p.call();
//		p_.call();
		
		Phone ps[] = {new CellPhone(), new SmartPhone(), new CellPhone(), new CellPhone(), new SmartPhone()};
		for (int i = 0; i < ps.length; i++) {
			ps[i].call();
		}
		System.out.println("筛选cellPhone");
		//用户筛选出数组中的CellPhone对象，执行call方法。
		for (int i = 0; i < ps.length; i++) {
			//如果当前引用指向的对象是一个CellPhone类型
			if(ps[i] instanceof CellPhone)
				ps[i].call();
		}
		
		
		Phone p = new SmartPhone();
		//将父类型的引用转换为子类型
		if(p instanceof CellPhone){
			CellPhone cp = (CellPhone)p;
			cp.sendMeg();
		}
		

		
		
		add(1,2);
	}

	public static void add(int x, int y){
		
	}
	
	public static void add(int x, int y, int z){
		
		
	}
}
