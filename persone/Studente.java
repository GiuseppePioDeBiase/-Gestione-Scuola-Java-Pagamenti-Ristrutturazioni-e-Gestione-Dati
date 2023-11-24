package persone;

public class Studente extends Persone {
	private final int classe;
	private final String corso;
	private boolean pagato;
	
	public Studente(String name, String surname, String sSN, int classe, String corso, boolean pagato) {
		super(name, surname, sSN);
		
		if(classe < 0 || classe > 5) {
			throw new IllegalArgumentException("Class must be in range 1-5");
		}
		
		this.classe = classe;
		this.corso = corso;
		this.pagato = pagato;
	}
	
	public int getClasse() {return classe;}
	public String getCorso() {return corso;}
	
	public void setPayment(boolean pagato) {
		if(pagato) {
			throw new IllegalArgumentException("Retta already paid");
		}
		
		this.pagato = pagato;
	}
	
	public String getPayment() {
		if(pagato) {
			return String.format("Effetuato");
		}else {
			return String.format("Non effettuato");
		}
	}
	
	@Override
	public double getPrice() {
		if(pagato) {
			return 0;
		}else{
			if(classe >= 1 && classe <= 3) {
				return Constants.RETTA;
			}else{
				return Constants.RETTA * Constants.AUMENTO;
			}
		}
	}
	@Override
	public String toString() {
		if(pagato) {
			return String.format("%s%-12s%d%n%-12s%s%n%-12s%s%n%n",
					super.toString(),
					"Classe:", getClasse(),
					"Corso:", getCorso(),
					"Pagamento:", getPayment());	
		}else {
			return String.format("%s%-12s%d%n%-12s%s%n%-12s%s%n%-12s$%,.2f%n%n",
					super.toString(),
					"Classe:", getClasse(),
					"Corso:", getCorso(),
					"Pagamento:", getPayment(),
					"Da pagare:", getPrice());
		}

	}
}
