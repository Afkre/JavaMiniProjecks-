package Bank;

public class Konto {
	
	protected String kontonummer; //00002061   String olmadigi zaman bastaki 4 basamak sifir int ile ucar
	protected double kontostand;
	
	public Konto(String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}
	
	//Getter
	public String getKontonummer() {
		return this.kontonummer;
	}

	public double getKontostand() {
		return this.kontostand;
	}

	//Methoden 
		
	public void einzahlen(double value) {
		this.kontostand +=value;
	}
		
	public boolean auszahlen(double value) {
		this.kontostand -= value;
		
		return true;
	}

	
	
}