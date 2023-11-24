package spese;

public class Bollette extends Spese {
	private final String descrizione;
	private final TipoBolletta tipoBolletta;
	private final double quantita;
	
	public Bollette(int codice, String descrizione, TipoBolletta tipoBolletta, double quantita) {
		super(codice);
		if(quantita < 0) {
			throw new IllegalArgumentException("Quantita can't be negative");
		}
		
		this.quantita = quantita;
		this.descrizione = descrizione;
		this.tipoBolletta = tipoBolletta;
	}

	public String getDescrizione() {return descrizione;}
	public TipoBolletta getTipoBolletta() {return tipoBolletta;}
	public double getQuantita() {return quantita;}
	
	@Override
	public double getPrice() {
		switch(tipoBolletta) {
			case ACQUA:
				return getQuantita() * Constants.PREZZO_ACQUA;
			case GAS:
				return getQuantita() * Constants.PREZZO_GAS;
			case ELETTRICA:
				return getQuantita() * Constants.PREZZO_CORRENTE;
			default:
				return 0;
				
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s%-12s%s%n%-12s%s%n%-12s%,.1f%n%-12s$%,.2f%n%n",
				super.toString(),
				"Descrizione:", getDescrizione(),
				"Tipo:", getTipoBolletta(),
				"Consumo:", getQuantita(), 
				"Prezzo:", getPrice());
	}

}
