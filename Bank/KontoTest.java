package Bank;

public class KontoTest {
	
	public static  void main(String []args) {
		
		Konto k = new Konto ("00001325", 1000);
		
		System.out.println("Kontonummer: " + k.getKontonummer());
		
		k.einzahlen(50);
		System.out.println(k.getKontostand());
		
		k.einzahlen(75);
		System.out.println(k.getKontostand());
		
		
		Girokonto gk = new Girokonto("00001325", 100, 100);
		
		System.out.println(gk.auszahlen(300));
		System.out.println(gk.getKontostand());
		
		System.out.println(gk.auszahlen(100));
		System.out.println(gk.getKontostand());
		
		if(gk.auszahlen(300)) {
			System.out.println("Auszahlung erfolgreich");
		}else {
			System.out.println("Auszahlung überschreitet Limit!");
		}
		
	}

}
