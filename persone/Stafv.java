package persone;

public class Stafv extends Persone {
	private final String reparto;
	private final int piano;
	private final double hours;
	
	public Stafv(String name, String surname, String sSN, String reparto, int piano, double hours) {
		super(name, surname, sSN);
		if(piano < 0 || piano > Constants.NUMERO_PIANI) {
			throw new IllegalArgumentException("Piano must be in range 1-5");
		}
		
		if(hours < 0 || hours > Constants.ORE_MASSIME) {
			throw new IllegalArgumentException("Hours must be in range 0-40");
		}
		
		this.hours = hours;
		this.piano = piano;
		this.reparto = reparto;
	}
	
	public String getReparto() {return reparto;}
	public int getPiano() {return piano;}
	public double getHours() {return hours;}
	
	@Override
	public double getPrice() {
		if(hours > Constants.ORE_MASSIME) {
			return Constants.PAGA_STAFF * 40 + (getHours() - 40) * Constants.PAGA_STAFF;
		}else {
			return Constants.PAGA_STAFF * getHours();
		}
	}

	@Override
	public String toString() {
		return String.format("%s%-12s%s%n%-12s%d%n%-12s%.1f%n%-12s$%,.2f%n%n",
				super.toString(),
				"Reparto:", getReparto(),
				"Piano:", getPiano(),
				"Ore:", getHours(),
				"Salario:", getPrice());
	}
}
