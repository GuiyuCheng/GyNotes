package com;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl + shift + o 快速导入
//		ArrayList<Student> al = new ArrayList<Student>();
//		Scanner scanner = new Scanner(System.in);
//		int count = 0;
//		while(count < 2){
//			Student s = new Student();
//			System.out.println("请输入学生学号：");
//			s.setId(scanner.nextInt());
//			System.out.println("请输入学生的姓名：");
//			s.setName(scanner.next());
//			System.out.println("请输入学生的分数:");
//			s.setScore(scanner.nextInt());
//			
//			al.add(s);
//			
//			count++;
//		}
//		
//		System.out.println(al);
//		
//		//排序
//		for(int i=0; i<al.size(); i++){
//			for(int j=0; j<al.size()-i-1; j++){
//				if(al.get(j).getScore() < al.get(j+1).getScore()){
//					Student temp = al.get(j);
//					al.set(j, al.get(j+1));
//					al.set(j+1, temp);
//				}
//			}
//			
//		}
//		
//		System.out.println(al);
		
		Student ss[] =  {new Student(1, "jack", 60), new Student(2, "ivy", 100), 
				new Student(3, "herry", 70)}; 
		
		Arrays.sort(ss, new Comparator<Student>() {
			////设定排序规则
			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				return arg1.getId()-arg0.getId();
			}
		});
		
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i].getId() + ss[i].getName() + ss[i].getScore());
		}
		
	}

}
