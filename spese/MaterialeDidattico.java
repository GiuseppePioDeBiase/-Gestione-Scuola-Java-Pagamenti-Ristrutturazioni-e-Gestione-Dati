package spese;

public class MaterialeDidattico extends Spese {
	private final String descrizione;
	private final int quantita;
	private final double prezzo;
	
	public MaterialeDidattico(int codice, String descrizione, int quantita, double prezzo) {
		super(codice);
		if(prezzo < 0) {
			throw new IllegalArgumentException("Price can't be negative");
		}
		if(quantita < 0) {
			throw new IllegalArgumentException("Quantity can't be negative");
		}
		
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.quantita = quantita;
	}
	
	public String getDescrizione() {return descrizione;}
	public int getQuantita() {return quantita;}
	public double getPrezzo() {return prezzo;}
	
	@Override
	public double getPrice() {
		return getQuantita() * getPrezzo();
	}
	
	@Override
	public String toString() {
		return String.format("%s%-12s%s%n%-12s%d%n%-12s$%,.2f%n%-12s$%,.2f%n%n",
				super.toString(),
				"Descrizione:", getDescrizione(),
				"Quantita':", getQuantita(),
				"Prezzo:", getPrezzo(),
				"Totale:", getPrice());
	}

}
