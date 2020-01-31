
public class Automobili {
	
	private String marka;
	private String model;
	
	public Automobili () {
		
	}
	
	public Automobili(String marka, String model) {
		
		this.marka = marka;
		this.model = model;
		
	}
	
	@Override
	public String toString() {
		
		return marka + " " + model;
	}
	
	
	
	
}
	