package com;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�����͵�����ָ��һ�������͵Ķ���
//		Phone p = new CellPhone();
//		Phone p_ = new SmartPhone();
//		
//		p.call();
//		p_.call();
		
		Phone ps[] = {new CellPhone(), new SmartPhone(), new CellPhone(), new CellPhone(), new SmartPhone()};
		for (int i = 0; i < ps.length; i++) {
			ps[i].call();
		}
		System.out.println("ɸѡcellPhone");
		//�û�ɸѡ�������е�CellPhone����ִ��call������
		for (int i = 0; i < ps.length; i++) {
			//�����ǰ����ָ��Ķ�����һ��CellPhone����
			if(ps[i] instanceof CellPhone)
				ps[i].call();
		}
		
		
		Phone p = new SmartPhone();
		//�������͵�����ת��Ϊ������
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
