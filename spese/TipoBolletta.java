package spese;

public enum TipoBolletta {
	ACQUA("Acqua"),
	GAS("Gas"),
	ELETTRICA("Elettrica");
	
	private String tipo;
	
	private TipoBolletta(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return tipo;
	}
}
