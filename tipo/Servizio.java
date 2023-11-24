package tipo;

public enum Servizio {
	RIPARAZIONE("Riparazione"),
	MANUTENZIONE("Manutenzione"),
	INSTALLAZIONE("Instalazione");
	
	private final String servizio;
	
	private Servizio(String servizio) {
		this.servizio = servizio;
	}
	
	public String getServizio() {return servizio;}

}
