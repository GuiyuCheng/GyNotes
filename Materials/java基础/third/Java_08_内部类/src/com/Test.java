package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ac = new ClassA();
		
//		InterfaceA interA = ;
		
		ac.methodA(new InterfaceA() {
			
			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("实现接口中的dosomething方法");
			}
		});
	}
	
}
