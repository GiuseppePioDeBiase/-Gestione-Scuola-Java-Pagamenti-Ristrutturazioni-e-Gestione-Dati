package persone;

import interfaccia.Pagamenti;

public abstract class Persone implements Pagamenti{
	private final String name;
	private final String surname;
	private final String sSN;

	public Persone(String name, String surname, String sSN) {
		this.name = name; 
		this.surname = surname;
		this.sSN = sSN;
	}
	
	public String getName() {return name;}
	public String getSurname() {return surname;}
	public String getSSN() {return sSN;}
	
	@Override
	public String toString() {
		return String.format("%-12s%s %s%n%-12s%s%n",
				"Person:", getName(), getSurname(),
				"SSN:", getSSN());
	}

}
