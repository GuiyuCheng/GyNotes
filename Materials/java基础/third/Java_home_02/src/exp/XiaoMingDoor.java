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
		System.out.println("����");
	}

	@Override
	public void waterProof() {
		// TODO Auto-generated method stub
		System.out.println("��ˮ");
	}

	@Override
	public void theftproof() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

}
