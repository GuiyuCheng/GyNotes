package exp;

public class XiaoMingDoor extends Door {

	String name;
	
	public XiaoMingDoor(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void bulletProof() {
		// TODO Auto-generated method stub
		System.out.println("防弹");
	}

	@Override
	public void waterProof() {
		// TODO Auto-generated method stub
		System.out.println("防水");
	}

	@Override
	public void theftproof() {
		// TODO Auto-generated method stub
		System.out.println("防盗");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开门");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关门");
	}

}
