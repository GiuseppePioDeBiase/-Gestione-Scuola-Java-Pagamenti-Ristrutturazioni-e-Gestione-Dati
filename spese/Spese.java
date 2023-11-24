package spese;
import interfaccia.Pagamenti;

public abstract class Spese implements Pagamenti{
	
	private final int codice;
	
	public Spese(int codice) {
		if(codice < 0) {
			throw new IllegalArgumentException("ID can't be negative");
		}
		
		this.codice = codice;
	}
	
	public int getCodice() {return codice;}
	
	@Override
	public String toString() {
		return String.format("%-12s%d%n", "Codice:", getCodice());
	}
}
