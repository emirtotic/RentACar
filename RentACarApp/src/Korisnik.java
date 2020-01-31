import java.util.Scanner;

public class Korisnik {

	private String ime;
	Scanner scanner = new Scanner(System.in);
	
	public Korisnik() {
	
	}
	
	protected void prijaviSe() {
		
		System.out.print("Unesite vase ime: ");
		ime = scanner.next();
		System.out.println("\nKorisnik: " + ime + " prijavljen. Dobrodosli. :)");
		System.out.println("\nIzaberite opciju:");
	
	}
	
	protected void odjava() {
		System.out.println("\nKorisnik " + ime + " odjavljen.");
		System.out.println("Hvala na poseti! :)");
	}
	
	protected void prijaviSeEnglish() {
		
		System.out.print("Enter your name: ");
		ime = scanner.next();
		System.out.println("\nUser: " + ime + " logged in. Welcome. :)");
		System.out.println("\nChose your option:");
	
	}
	
	protected void odjavaEnglish() {
		System.out.println("\nUser " + ime + " logged out.");
		System.out.println("Thank You for visitinig us! :)");
	}

}
