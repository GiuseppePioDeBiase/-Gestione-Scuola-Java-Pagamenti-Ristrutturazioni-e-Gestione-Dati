package tipo;

import spese.Spese;

public class Rimodellazione extends Spese {
	
	private final Carpentiere carpentiere;
	private final Elettricista elettricista;
	private final Muratore muratore;
	
	public Rimodellazione(int codice, Carpentiere carpentiere) {
		this(codice, carpentiere, null, null);	
	}
	
	public Rimodellazione(int codice, Elettricista elettricista) {
		this(codice, null, elettricista, null);	
	}
	
	public Rimodellazione(int codice, Muratore muratore) {
		this(codice, null, null, muratore);
	}
	
	public Rimodellazione(int codice, Carpentiere carpentiere,Elettricista elettricista) {
		this(codice, carpentiere, elettricista, null);	
	}
	
	public Rimodellazione(int codice, Carpentiere carpentiere,Muratore muratore) {
		this(codice, carpentiere, null, muratore);	
	}
	
	public Rimodellazione(int codice, Elettricista elettricista,Muratore muratore) {
		this(codice, null, elettricista, muratore);	
	}
	
	public Rimodellazione(int codice, Carpentiere carpentiere, Elettricista elettricista, Muratore muratore) {
		super(codice);
		this.carpentiere = carpentiere;
		this.elettricista=elettricista;
		this.muratore=muratore;
		
	}
	
	//return oggetti
	public Carpentiere getCarpentiere() {return carpentiere;}
	public Muratore getMuratore() {return muratore;}
	public Elettricista getElettricista() {return elettricista;}
	//return stringhe
	public String getStringCarpentiere() {return carpentiere.toString();}
	public String getStringMuratore() {return muratore.toString();}
	public String getStringElettricista() {return elettricista.toString();} 
	
	
	@Override
	public double getPrice() {
		if(carpentiere == null && (elettricista != null && muratore != null)) {
			return elettricista.getPrice() + muratore.getPrice();
		}
		else if(elettricista == null && (carpentiere != null && muratore != null)) {
			return carpentiere.getPrice() + muratore.getPrice();
		}
		else if(muratore == null  && (carpentiere != null && elettricista != null)) {
			return carpentiere.getPrice() + elettricista.getPrice();
		}
		else if((muratore == null && elettricista == null) && carpentiere != null) {
			return carpentiere.getPrice();
		}
		else if((muratore == null && carpentiere == null) && elettricista != null) {
			return elettricista.getPrice();
		}
		else if((elettricista == null && carpentiere == null) && muratore != null) {
			return muratore.getPrice();
		}
		else {
			return 0;
		}

	}
	
	@Override
	public String toString() {
		if(carpentiere == null && (elettricista != null && muratore != null)) {
			return String.format("%-12s%n%s%-12s%n%s%-12s$%,.2f%n",
					"Elettrico:",elettricista,
					"Muratore:", muratore,
					"Totale:", getPrice());
		}
		else if(elettricista == null && (carpentiere != null && muratore != null)) {
			return String.format("%-12s%n%s%-12s%n%s%-12s$%,.2f%n",
					"Pavimenti:",carpentiere,
					"Muratore:", muratore,
					"Totale:", getPrice());
		
		}
		else if(muratore == null  && (carpentiere != null && elettricista != null)) {
			return String.format("%-12s%n%s%-12s%n%s%n%-12s$%,.2f%n",
					"Pavimenti:",carpentiere,
					"Elettrico:", elettricista,
					"Totale:", getPrice());
		}
		else if((muratore == null && elettricista == null) && carpentiere != null) {
			return String.format("%-12s%n%s%-12s$%,.2f%n",
					"Pavimenti:",carpentiere,
					"Totale:", getPrice());
		}
		else if((muratore == null && carpentiere == null) && elettricista != null) {
			return String.format("%-12s%n%s%-12s$%,.2f%n",
					"Elettrico:",elettricista,
					"Totale:", getPrice());
		}
		else if((elettricista == null && carpentiere == null) && muratore != null) {
			return String.format("%-12s%n%s%-12s$%,.2f%n",
					"Muratore:",muratore,
					"Totale:", getPrice());
		}
		else {
			return null;
		}

	}

}
