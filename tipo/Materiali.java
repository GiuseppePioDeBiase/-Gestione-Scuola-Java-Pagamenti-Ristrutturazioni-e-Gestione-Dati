package tipo;

public enum Materiali {
		BETULLA("Betulla"),
		MASSELLO("Massell0"),
		QUERCIA("Quercia");
	
	private final String nome;
	
	private Materiali(String nome) {
		this.nome = nome;
	}
	
	public String getName() {return nome;}
}
