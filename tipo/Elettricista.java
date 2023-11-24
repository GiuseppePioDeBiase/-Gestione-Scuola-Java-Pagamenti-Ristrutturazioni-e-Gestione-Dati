package tipo;

import interfaccia.Pagamenti;

public class Elettricista implements Pagamenti{
	
	private final int OreDiLavoro;
	private final double MetriDiCavo;
	private final Servizio service;
	
	public Elettricista(int OreDiLavoro,double MetriDiCavo,Servizio service){
		if(OreDiLavoro<0 ) {
			throw new IllegalArgumentException("OreDiLavoro must be >0");
		}
		
		if(MetriDiCavo<0) {
			throw new IllegalArgumentException("MetriDiCavo must be >0");
		}
		
		this.MetriDiCavo=MetriDiCavo;
		this.OreDiLavoro=OreDiLavoro;
		this.service=service;
	}
	
	public int getOreLavoro() {return OreDiLavoro;}
	public double getMetriDiCavo() {return MetriDiCavo;}
	public Servizio getService() {return service;}

	@Override
	public double getPrice() {
		switch(service) {
			case RIPARAZIONE:
				return getOreLavoro() * Constants.PREZZO_RIPARAZIONE + getMetriDiCavo() * Constants.PREZZO_CAVO;
			case MANUTENZIONE:
				return getOreLavoro() * Constants.PREZZO_MANUTENZIONE + getMetriDiCavo() * Constants.PREZZO_CAVO;
			case INSTALLAZIONE:
				return getOreLavoro() * Constants.PREZZO_INSTALLAZIONE + getMetriDiCavo() * Constants.PREZZO_CAVO;
			default:
				return 0;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%-12s%d%n%-12s%,.2f%n%-12s%s%n%-12s$%,.2f%n%n",
				"Ore:", getOreLavoro(),
				"Cavo:", getMetriDiCavo(),
				"Servizio:", service.getServizio(),
				"Prezzo:", getPrice());
	}
	
	

}
