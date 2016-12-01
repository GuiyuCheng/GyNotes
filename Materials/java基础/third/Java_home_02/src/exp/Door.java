package exp;

public abstract class Door implements InterBulletProof, InterWaterProof,
		InterTheftProof {
	public abstract void open();

	public abstract void close();
}
