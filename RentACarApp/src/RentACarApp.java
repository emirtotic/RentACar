import java.util.ArrayList;
import java.util.Scanner;

public class RentACarApp extends Automobili {
	

	ArrayList<Automobili> listaDostupnih = new ArrayList<Automobili>();
	ArrayList<Automobili> izdatiAutomobili = new ArrayList<Automobili>();
	
	Automobili bmw = new Automobili("BMW", "320");
	Automobili audi = new Automobili("Audi", "A4");
	Automobili reno = new Automobili("Renault", "Megane");
	Automobili pezo = new Automobili("Peugeot", "308");

	
	public Automobili getBmw() {
		return bmw;
	}

	public Automobili getAudi() {
		return audi;
	}

	public Automobili getReno() {
		return reno;
	}

	public Automobili getPezo() {
		return pezo;
	}
	
	protected void ubaciKolaUListu() {
		listaDostupnih.add(getAudi());
		listaDostupnih.add(getBmw());
		listaDostupnih.add(getPezo());
		listaDostupnih.add(getReno());
		listaDostupnih.add(Dzipovi.dajDzipa());
	}
	
	protected void stampajListuDostupnih() {
		if (listaDostupnih.isEmpty()) {
			System.out.println("Trenutno nema dostupnih vozila.");
		}
		else {
			System.out.println(listaDostupnih);
		}
	}
	
	
				protected void stampajListuDostupnihEnglish() {
					if (listaDostupnih.isEmpty()) {
						System.out.println("No available vehicles at the moment.");
					}
					else {
						System.out.println(listaDostupnih);
					}
				}
	
	
	protected void stampajListuIzdatih() {
		if (izdatiAutomobili.isEmpty()) {
			System.out.println("Nema trenutno izdatih vozila. Da li zelite da iznajemite automobil?");
		}
		else {
		System.out.println(izdatiAutomobili);
		}
	}
	
	
				protected void stampajListuIzdatihEnglish() {
					if (izdatiAutomobili.isEmpty()) {
						System.out.println("All vehicles are available. Do you want to rent one?");
					}
					else {
					System.out.println(izdatiAutomobili);
					}
				}
	
	
	protected void iznajmiAudi() {
		if (listaDostupnih.contains(audi)) {
			System.out.println("Audi je dostupan za iznajmljivanje. Srecan put.");
			listaDostupnih.remove(audi);
			izdatiAutomobili.add(audi);
		}
		else {
			System.out.println("Zao nam je, Audi trenutno nije dostupan.");
		}
	}
	
	protected void vratiAudi() {
		if (izdatiAutomobili.contains(audi)) {
			System.out.println("Vratili ste Audi. Nadam se da ste zadovoljni i dodjite nam opet. :)");
			izdatiAutomobili.remove(audi);
			listaDostupnih.add(audi);
		}
		else {
			System.out.println("Audi je vec dostupan kod nas, to nije nase vozilo.");
		}
	}
	
	
					protected void iznajmiAudiEnglish() {
						if (listaDostupnih.contains(audi)) {
							System.out.println("Audi is available. Have a nice trip.");
							listaDostupnih.remove(audi);
							izdatiAutomobili.add(audi);
						}
						else {
							System.out.println("We are sorry, Audi is not available at the moment.");
						}
					}
					
					protected void vratiAudiEnglish() {
						if (izdatiAutomobili.contains(audi)) {
							System.out.println("Audi returned. Thank You for using our services. :)");
							izdatiAutomobili.remove(audi);
							listaDostupnih.add(audi);
						}
						else {
							System.out.println("Audi is already here. That is not our vehicle.");
						}
					}
					
	
	protected void iznajmiBMW() {
		if (listaDostupnih.contains(bmw)) {
			System.out.println("BMW je dostupan za iznajmljivanje. Srecan put.");
			listaDostupnih.remove(bmw);
			izdatiAutomobili.add(bmw);
		}
		else {
			System.out.println("Zao nam je, BMW trenutno nije dostupan.");
		}
	}
	
	protected void vratiBMW() {
		if (izdatiAutomobili.contains(bmw)) {
			System.out.println("Vratili ste BMW. Nadam se da ste zadovoljni i dodjite nam opet. :)");
			izdatiAutomobili.remove(bmw);
			listaDostupnih.add(bmw);
		}
		else {
			System.out.println("BMW je vec dostupan kod nas, to nije nase vozilo.");
		}
	}
	
	
						protected void iznajmiBMWEnglish() {
							if (listaDostupnih.contains(bmw)) {
								System.out.println("BMW is available. Have a nice trip.");
								listaDostupnih.remove(bmw);
								izdatiAutomobili.add(bmw);
							}
							else {
								System.out.println("We are sorry, BMW is not available at the moment.");
							}
						}
						
						protected void vratiBMWEnglish() {
							if (izdatiAutomobili.contains(bmw)) {
								System.out.println("BMW returned. We are glad you are satisfied with our services. :)");
								izdatiAutomobili.remove(bmw);
								listaDostupnih.add(bmw);
							}
							else {
								System.out.println("BMW is already in our agency. It seems that is not our car.");
							}
						}
	
	protected void iznajmiReno() {
		if (listaDostupnih.contains(reno)) {
			System.out.println("Reno je dostupan za iznajmljivanje. Srecan put.");
			listaDostupnih.remove(reno);
			izdatiAutomobili.add(reno);
		}
		else {
			System.out.println("Zao nam je, Reno trenutno nije dostupan.");
		}
	}
	
	protected void vratiReno() {
		if (izdatiAutomobili.contains(reno)) {
			System.out.println("Vratili ste Renault. Nadam se da ste zadovoljni i dodjite nam opet. :)");
			izdatiAutomobili.remove(reno);
			listaDostupnih.add(reno);
		}
		else {
			System.out.println("Renault je vec dostupan kod nas, to nije nase vozilo.");
		}
	}
	
						protected void iznajmiRenoEnglish() {
							if (listaDostupnih.contains(reno)) {
								System.out.println("Renault is available. Have a good time.");
								listaDostupnih.remove(reno);
								izdatiAutomobili.add(reno);
							}
							else {
								System.out.println("We are sorry, renault is not available at the moment.");
							}
						}
						
						protected void vratiRenoEnglish() {
							if (izdatiAutomobili.contains(reno)) {
								System.out.println("Thank you for returning back our Renault. Hope so you enjoyed it. :)");
								izdatiAutomobili.remove(reno);
								listaDostupnih.add(reno);
							}
							else {
								System.out.println("Renault is already at our agency. Did you steal it somewhere else? :)");
							}
						}

	protected void iznajmiPezo() {
		if (listaDostupnih.contains(pezo)) {
			System.out.println("Pezo je dostupan za iznajmljivanje. Srecan put.");
			listaDostupnih.remove(pezo);
			izdatiAutomobili.add(pezo);
		}
		else {
			System.out.println("Zao nam je, Peugeot trenutno nije dostupan.");
		}
	}

	protected void vratiPezo() {
		if (izdatiAutomobili.contains(pezo)) {
			System.out.println("Vratili ste Peugeot. Nadam se da ste zadovoljni i dodjite nam opet. :)");
			izdatiAutomobili.remove(pezo);
			listaDostupnih.add(pezo);
		}
		else {
			System.out.println("Peugeot je vec dostupan kod nas, to nije nase vozilo.");
		}
	}
	
						protected void iznajmiPezoEnglish() {
							if (listaDostupnih.contains(pezo)) {
								System.out.println("Peugeot is available. Enjoy it.");
								listaDostupnih.remove(pezo);
								izdatiAutomobili.add(pezo);
							}
							else {
								System.out.println("We are sorry, Peugeot is not available at the moment.");
							}
						}
					
						protected void vratiPezoEnglish() {
							if (izdatiAutomobili.contains(pezo)) {
								System.out.println("Thenk you for returning Peugeot. See you again. :)");
								izdatiAutomobili.remove(pezo);
								listaDostupnih.add(pezo);
							}
							else {
								System.out.println("Peugeot is already here.");
							}
						}
	
	protected void iznajmiDzip() {
		if (listaDostupnih.contains(Dzipovi.dajDzipa())) {
			System.out.println("Land Rover je dostupan za iznajmljivanje. Srecan put.");
			listaDostupnih.remove(Dzipovi.dajDzipa());
			izdatiAutomobili.add(Dzipovi.dajDzipa());
		}
		else {
			System.out.println("Zao nam je, Land Rover trenutno nije dostupan.");
		}
	}
	
	protected void vratiDzip() {
		if (izdatiAutomobili.contains(Dzipovi.dajDzipa())) {
			System.out.println("Vratili ste Land Rover. Nadam se da ste zadovoljni i dodjite nam opet. :)");
			izdatiAutomobili.remove(Dzipovi.dajDzipa());
			listaDostupnih.add(Dzipovi.dajDzipa());
		}
		else {
			System.out.println("Land Rover je vec dostupan kod nas, to nije nase vozilo.");
		}
	}
	
	
						protected void iznajmiDzipEnglish() {
							if (listaDostupnih.contains(Dzipovi.dajDzipa())) {
								System.out.println("Land Rover is available. Have a nice time.");
								listaDostupnih.remove(Dzipovi.dajDzipa());
								izdatiAutomobili.add(Dzipovi.dajDzipa());
							}
							else {
								System.out.println("We are sorry, Land Rover is not available at the moment.");
							}
						}
						
						protected void vratiDzipEnglish() {
							if (izdatiAutomobili.contains(Dzipovi.dajDzipa())) {
								System.out.println("Thank you for returning Land Rover. Hope so you enjoyed it. :)");
								izdatiAutomobili.remove(Dzipovi.dajDzipa());
								listaDostupnih.add(Dzipovi.dajDzipa());
							}
							else {
								System.out.println("That Land Rover is not ours! I'm calling the cops!");
							}
						}
	
	
	protected void opcije() {
		System.out.println("\nOpcija  0  -->  Prikazi opcije");
		System.out.println("Opcija  1  -->  Prikazi dostupna vozila");
		System.out.println("Opcija  2  -->  Prikazi izdata vozila");
		System.out.println("Opcija  3  -->  Iznajmi Audi");
		System.out.println("Opcija  4  -->  Iznajmi BMW");
		System.out.println("Opcija  5  -->  Iznajmi Peugeot");
		System.out.println("Opcija  6  -->  Iznajmi Renault");
		System.out.println("Opcija  7  -->  Iznajmi Land Rover");
		System.out.println("Opcija  8  -->  Vrati Audi");
		System.out.println("Opcija  9  -->  Vrati BMW");
		System.out.println("Opcija 10  -->  Vrati Peugeot");
		System.out.println("Opcija 11  -->  Vrati Renault");
		System.out.println("Opcija 12  -->  Vrati Land Rover");
		System.out.println("Opcija 13  -->  Izlaz - KRAJ PROGRAMA.");
	}
	
						protected void opcijeEnglish() {
							System.out.println("\nOption  0  -->  Show options");
							System.out.println("Option  1  -->  Show available vehicles");
							System.out.println("Option  2  -->  Show unavailable vehicles");
							System.out.println("Option  3  -->  Rent Audi");
							System.out.println("Option  4  -->  Rent BMW");
							System.out.println("Option  5  -->  Rent Peugeot");
							System.out.println("Option  6  -->  Rent Renault");
							System.out.println("Option  7  -->  Rent Land Rover");
							System.out.println("Option  8  -->  Return Audi");
							System.out.println("Option  9  -->  Return BMW");
							System.out.println("Option 10  -->  Return Peugeot");
							System.out.println("Option 11  -->  Return Renault");
							System.out.println("Option 12  -->  Return Land Rover");
							System.out.println("Option 13  -->  Exit.");
						}
	
	protected void operacija() {
		int opcija;
		boolean kraj = false;
		Scanner scanner = new Scanner(System.in);
		
		ubaciKolaUListu();
		opcije();
		
		do {
		
		System.out.print("\nIzaberite opciju: ");
		opcija = scanner.nextInt();
		
		switch (opcija) {
		case 0:
			opcije();
			break;
		case 1:
			System.out.println("Dostupna vozila:");
			stampajListuDostupnih();
			break;
		case 2:
			System.out.println("Trenutno nedostupna (izdata) vozila:");
			stampajListuIzdatih();
			break;
		case 3:
			iznajmiAudi();
			break;
		case 4:
			iznajmiBMW();
			break;
		case 5:
			iznajmiPezo();
			break;
		case 6:
			iznajmiReno();
			break;
		case 7:
			iznajmiDzip();
			break;
		case 8:
			vratiAudi();
			break;
		case 9:
			vratiBMW();
			break;
		case 10:
			vratiPezo();
			break;
		case 11:
			vratiReno();
			break;
		case 12:
			vratiDzip();;
			break;
		case 13:
			kraj = true;
			System.out.println("\nNapustili ste program.");
			return;

		default:
			System.out.println("\nPogresna opcija! Pokusajte ponovo.");
			System.out.println("Unesite 0 ako zelite da ponovo pogledate moguce opcije.");
			break;
		}
		
		} while (kraj = true);
		
		scanner.close();
		
	}
	
	
						protected void operacijaEnglish() {
							int opcija;
							boolean kraj = false;
							Scanner scanner = new Scanner(System.in);
							
							ubaciKolaUListu();
							opcijeEnglish();
							
							do {
							
							System.out.print("\nChose your option: ");
							opcija = scanner.nextInt();
							
							switch (opcija) {
							case 0:
								opcijeEnglish();
								break;
							case 1:
								System.out.println("Available vehicles:");
								stampajListuDostupnihEnglish();
								break;
							case 2:
								System.out.println("Unavailable vehicles:");
								stampajListuIzdatihEnglish();
								break;
							case 3:
								iznajmiAudiEnglish();
								break;
							case 4:
								iznajmiBMWEnglish();
								break;
							case 5:
								iznajmiPezoEnglish();
								break;
							case 6:
								iznajmiRenoEnglish();
								break;
							case 7:
								iznajmiDzipEnglish();
								break;
							case 8:
								vratiAudiEnglish();
								break;
							case 9:
								vratiBMWEnglish();
								break;
							case 10:
								vratiPezoEnglish();
								break;
							case 11:
								vratiRenoEnglish();
								break;
							case 12:
								vratiDzipEnglish();
								break;
							case 13:
								kraj = true;
								System.out.println("\nGodbye! :).");
								return;
					
							default:
								System.out.println("\nIncorect option! Please try again.");
								System.out.println("Select 0 to show options again.");
								break;
							}
							
							} while (kraj = true);
							
							scanner.close();
							
						}
	
	
	
}
