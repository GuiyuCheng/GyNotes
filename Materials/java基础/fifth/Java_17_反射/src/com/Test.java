package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// �õ������
			Class catClass = Class.forName("com.Cat");
			//------------------------�������-------------------------------------
			// ȡ�������Ĺ������
			Constructor[] constructs_pub = catClass.getConstructors();
			for (int i = 0; i < constructs_pub.length; i++) {
				System.out.println(constructs_pub[i]);
			}
			//ȡ��ָ���Ĺ����Ĺ������
			Constructor construct = catClass.getConstructor(String.class, String.class, int.class);
			
			//ͨ��������󴴽�����
			Cat cat = (Cat) construct.newInstance("��è", "��ɫ", 2);
			cat.display();
			
			//ȡ�����еĹ������
			Constructor constructs_all[] = catClass.getDeclaredConstructors();
			for (int i = 0; i < constructs_all.length; i++) {
				System.out.println(constructs_all[i]);
			}
			//ȡ��˽�й������
			Constructor construct_private = catClass.getDeclaredConstructor();
			//���ִ��˽�й����Ȩ��
			construct_private.setAccessible(true);
			Cat catWhite = (Cat) construct_private.newInstance();
			catWhite.display();
			//-------------------------�ֶζ���-------------------------------
			Field fields[] = catClass.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}
			
			//ȡ������Ϊname�����Զ���
			Field field = catClass.getDeclaredField("name");
			field.setAccessible(true);
			Cat catPolice = new Cat("��è����");
			//ͨ��field���󣬵õ�catPolice�����е�˽������name
			System.out.println(field.get(catPolice));
			//ͨ��field�����޸�catPolice�����е�˽������name
			field.set(catPolice, "��è����");
			System.out.println(field.get(catPolice));
			
			//------------------------��������-------------------------------------
			Method methods[] = catClass.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
			}
			
			Method method = catClass.getDeclaredMethod("eat", int.class);
			method.invoke(catPolice, 4);
			
			Method method_private = catClass.getDeclaredMethod("sleep");
			method_private.setAccessible(true);
			method_private.invoke(catPolice);
			
			//�����String���е����й��죬�ֶΣ�����
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
