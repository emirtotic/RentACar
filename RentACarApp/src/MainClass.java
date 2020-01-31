import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcija;
		boolean kraj;
		
		
		RentACarApp a = new RentACarApp();
		Korisnik k1 = new Korisnik();
		
		do {
		System.out.println("  *** DOBRODOSLI *** WELCOME ***");
		System.out.println("\nIzaberite jezik  ||  Choose language");
		languageOption();
		opcija = scanner.nextInt();
		
		switch (opcija) {
		case 1:
			System.out.println("Izabrali ste srpski jezik.");
			k1.prijaviSe();
			a.operacija();
			k1.odjava();
			return;
		case 2:
			System.out.println("You selected English language.");
			k1.prijaviSeEnglish();
			a.operacijaEnglish();
			k1.odjavaEnglish();
			return;
		case 3:
			System.out.println("Napustili ste program!  ||  You left the program!");
			kraj = true;
			return;

		default:
			System.out.println("Losa opcija. Pokusajte ponovo.");
			System.out.println("Unknown option. Please try again.");
			break;
		}

		
		} while (kraj = true);
		
		scanner.close();
		
	}
	
		public static void languageOption() {
			System.out.println("\n1 --> Srpski jezik");
			System.out.println("\n2 --> English language");
		}

}
