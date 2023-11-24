package tipo;

public enum Costruzione {
			APPARTAMENTO("Appartamento"),
			VECCHIOCASOLARE("Vecchio casolare"),
			VILLA("Villa"),
			GRATTACIELO("Grattacielo");
	
	private final String descrizione;
	
	private Costruzione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getDescrizione() {return descrizione;}
	
}
