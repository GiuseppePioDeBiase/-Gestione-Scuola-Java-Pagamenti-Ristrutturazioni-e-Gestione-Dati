package scuola;

import java.util.ArrayList;
import interfaccia.Pagamenti;

public class Scuola {
	private ArrayList<Pagamenti> scuola = new ArrayList<Pagamenti>();
	private double totale = 0;
	
	public void addOggetto(Pagamenti pagamento) {
		if(!scuola.contains(pagamento)) {
			scuola.add(pagamento);
		}else {
			throw new IllegalArgumentException("Object already exists");
		}
		
		totale += pagamento.getPrice();
	}
	
	public double getTotale() {
		return totale;
	}
	
	public void emptyArary() {
		scuola.clear();
	}
	
	public void toStringa() {
		
		for(Pagamenti attuale: scuola) {
			System.out.printf(attuale.toString());
		}
	}
	
}
