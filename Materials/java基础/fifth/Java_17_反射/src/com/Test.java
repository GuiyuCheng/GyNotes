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
			// 得到类对象
			Class catClass = Class.forName("com.Cat");
			//------------------------构造对象-------------------------------------
			// 取出公共的构造对象
			Constructor[] constructs_pub = catClass.getConstructors();
			for (int i = 0; i < constructs_pub.length; i++) {
				System.out.println(constructs_pub[i]);
			}
			//取出指定的公共的构造对象
			Constructor construct = catClass.getConstructor(String.class, String.class, int.class);
			
			//通过构造对象创建对象
			Cat cat = (Cat) construct.newInstance("黑猫", "黑色", 2);
			cat.display();
			
			//取出所有的构造对象
			Constructor constructs_all[] = catClass.getDeclaredConstructors();
			for (int i = 0; i < constructs_all.length; i++) {
				System.out.println(constructs_all[i]);
			}
			//取出私有构造对象
			Constructor construct_private = catClass.getDeclaredConstructor();
			//添加执行私有构造的权限
			construct_private.setAccessible(true);
			Cat catWhite = (Cat) construct_private.newInstance();
			catWhite.display();
			//-------------------------字段对象-------------------------------
			Field fields[] = catClass.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}
			
			//取出名字为name的属性对象
			Field field = catClass.getDeclaredField("name");
			field.setAccessible(true);
			Cat catPolice = new Cat("黑猫警长");
			//通过field对象，得到catPolice对象中的私有属性name
			System.out.println(field.get(catPolice));
			//通过field对象，修改catPolice对象中的私有属性name
			field.set(catPolice, "白猫警长");
			System.out.println(field.get(catPolice));
			
			//------------------------方法对象-------------------------------------
			Method methods[] = catClass.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
			}
			
			Method method = catClass.getDeclaredMethod("eat", int.class);
			method.invoke(catPolice, 4);
			
			Method method_private = catClass.getDeclaredMethod("sleep");
			method_private.setAccessible(true);
			method_private.invoke(catPolice);
			
			//反射出String类中的所有构造，字段，方法
			
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
