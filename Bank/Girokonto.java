package Bank;

public class Girokonto extends Konto{

	private double limit;
	
	public Girokonto(String kontonummer, double kontostand, double limit) {
		super(kontonummer, kontostand);	// von vererbung
		this.limit = limit;				// von diesem class
	}	
	
	/*
	public boolean auszahlen(double value) {
		if(this.kontostand - value >= limit * -1) {
			super.auszahlen(value);
			return true;
		}
		
		return false;
	}
	*/
	
	public boolean auszahlen(double value) {
		  if (this.kontostand - value >= 0 && value <= limit) {
		   super.auszahlen(value);
		   return true;
		  }
		  return false;
	}	
	
	public double getLimit() {
		return this.limit;
	}
	
	public void setLimit(double value) {
		this.limit= value;
	}

}
