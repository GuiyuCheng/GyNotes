package exp;

public class MyMath {
	private int result;
	
	public void add(int i)throws MyException,MyNagtiveException{
		
		if(i == 0){
			throw new MyException(); //�׳�һ���쳣����
		}
		if(i < 0){
			throw new MyNagtiveException();
		}
		
		result += i;
	}
}
