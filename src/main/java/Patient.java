
public class Patient implements Bleedable{
	
	static final int DEFAULT_BLOODS = 42;
	private int bloods = DEFAULT_BLOODS;

	public int getBloods() {
		
		return bloods;
	}
	@Override

	public void removeBlood(int amount) {
		bloods -= amount;
		
		
	}



}
