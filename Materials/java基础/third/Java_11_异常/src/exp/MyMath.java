package exp;

public class MyMath {
	private int result;
	
	public void add(int i)throws MyException,MyNagtiveException{
		
		if(i == 0){
			throw new MyException(); //抛出一个异常对象
		}
		if(i < 0){
			throw new MyNagtiveException();
		}
		
		result += i;
	}
}
