package persone;

public class Docenti extends Persone {
	private final int[] classiInsegnate;
	private final int annidiServizio;

	public Docenti(String name, String surname, String sSN,int annidiServizio,int[] classiInsegnate) {
		super(name, surname, sSN);
		
		if(annidiServizio<0) {
			throw new IllegalArgumentException("anni di servizio must be >0");
		}
		
		if(classiInsegnate.length>5) {
			throw new IllegalArgumentException("classiInsegnate must be <= 5");
		}
		
		this.annidiServizio=annidiServizio;
		this.classiInsegnate=classiInsegnate;
	}
	
	public int getAnniService() {return annidiServizio;}
	
	public String getClassiInsegnati() {
		String appoggio = "";
		for(int attuale : classiInsegnate ) {
			appoggio = appoggio + String.format("%s ", attuale);
		}
		
		return appoggio;
	}
	
	

	@Override
	public double getPrice() {
		if(getAnniService()>5) {
			return Constants.PAGA*Constants.INCREMENTOPAGA;
		}
		return Constants.PAGA;
	}
	@Override
	public String toString() {
		
		return String.format("%s%-12s%s%n%-12s%s%n%-12s$%,.2f%n%n",
				super.toString(),
				"servizio:",getAnniService(),
				"Insegnate:",getClassiInsegnati(),
				"Salario:", getPrice());
	}

}
