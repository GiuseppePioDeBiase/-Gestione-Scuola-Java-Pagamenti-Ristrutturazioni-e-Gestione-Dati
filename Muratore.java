package tipo;
import interfaccia.Pagamenti;

public class Muratore implements Pagamenti{
		private final int IndiceRischio;
		private final Costruzione build;
		private final Boolean Sicurezze;
		private final double[] incremento = {1, 1.05, 1.10, 1.15, 1.20, 1.25, 1.50};
		
	public Muratore(int IndiceRischio,Costruzione build,Boolean Sicurezze){
		
		if(IndiceRischio<0 || IndiceRischio > 5) {
			throw new IllegalArgumentException("IndiceRischio must be in range 0-5");
		}
		
		if(!Sicurezze) {
			IndiceRischio++;
		}
		
		this.build=build;
		this.IndiceRischio=IndiceRischio;
		this.Sicurezze=Sicurezze;
	}
	
	public Costruzione getBuild() {return build;}
	public String getSicurezze() {return String.format("%s", (Sicurezze ? "Si" : "No"));}
	public int getIndiceRischio() {return IndiceRischio;}
	
	@Override
	public double getPrice() {
		switch(build) {
			case APPARTAMENTO:
				return Constants.PREZZO_APPARTAMENTO * incremento[getIndiceRischio()];
			case VECCHIOCASOLARE:
				return Constants.PREZZO_VECCHIO_CASOLARE * incremento[getIndiceRischio()];
			case VILLA:
				return Constants.PREZZO_VILLA * incremento[getIndiceRischio()];
			case GRATTACIELO:
				return Constants.PREZZO_GRATTACIELO * incremento[getIndiceRischio()];
			default:
				return 0;
				
		}	
	}
	
	@Override
	public String toString() {
		return String.format("%-12s%d%n%-12s%s%n%-12s%s%n%-12s$%,.2f%n%n",
				"Indice:", getIndiceRischio(),
				"Siscurezza:",getSicurezze(),
				"Edificio:",getBuild(),
				"Prezzo:",getPrice());
	}
	
	
}
