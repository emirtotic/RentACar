
public class Dzipovi extends Automobili {
	
	private String marka;
	private String model;

	private Dzipovi(String marka, String model) {
		this.marka = marka;
		this.model = model;
	}
	
	public Dzipovi getDzip() {
		return dajDzipa(); 
	}
	
	private static Dzipovi dzip;  
	
	public static Dzipovi dajDzipa() {
	
		if (dzip == null) {
			 dzip = new Dzipovi("Land Rover", "Discovery");
		}
		return dzip;
	}
	
	@Override
	public String toString() {
		
		return marka + " " + model;
	}
	
}
