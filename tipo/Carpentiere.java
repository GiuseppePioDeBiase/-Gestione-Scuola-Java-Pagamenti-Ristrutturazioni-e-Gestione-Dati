package tipo;

import interfaccia.Pagamenti;

public class Carpentiere implements Pagamenti {
	
	private final double nummtq;
	private final Materiali materiali;
	
	public Carpentiere(double nummtq,Materiali materiali){
		
		if(nummtq<0) {
			throw new IllegalArgumentException("nummtq must be >0");
		}	
		this.materiali=materiali;
		this.nummtq=nummtq;	
	}
	
	public double getNumMtq() {return nummtq;}
	
	public Materiali getMateriali() {return materiali;}
	
	public double getPrice() {
		switch(materiali) {
			case QUERCIA:
				return getNumMtq() * Constants.PREZZO_QUERCIA;
			case MASSELLO:
				return getNumMtq() * Constants.PREZZO_MASSELLO;
			case BETULLA:
				return getNumMtq() * Constants.PREZZO_BETULLA;
			default:
				return 0;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%-12s%,.2f%n%-12s%s%n%-12s$%,.2f%n%n",
				"Area:", getNumMtq(),
				"Materiale:", materiali.getName(),
				"Prezzo:", getPrice());
	}
}
