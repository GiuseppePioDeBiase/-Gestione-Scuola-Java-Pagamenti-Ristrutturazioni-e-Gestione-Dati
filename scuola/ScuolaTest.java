package scuola;

import persone.*;
import spese.*;
import tipo.*;


public class ScuolaTest {

	public static void main(String[] args) {
		final int[] classiInsegnate = {2,4};
		Docenti docente1 = new Docenti("Piero", "Alberto", "111-11-1111", 6, classiInsegnate);
		Docenti docente2 = new Docenti("Peppe", "Biase", "222-22-2222", 4, classiInsegnate);
		Stafv staff = new Stafv("Vicnceoao", "PippoPalla", "333-33-3333", "Cesso", 2, 40);
		Studente studente1 = new Studente("Luca", "Pinto", "234-234-23423423",3 ,"Elettronica" , true );
		Studente studente2 = new Studente("Marco", "U Frat", "555-55-5555",5 ,"Sessologgia" , false );
		
		Scuola scuola = new Scuola();
		
		scuola.addOggetto(docente1);
		scuola.addOggetto(docente2);
		scuola.addOggetto(staff);
		scuola.addOggetto(studente1);
		scuola.addOggetto(studente2);
		scuola.toStringa();
		scuola.emptyArary();
		System.out.printf("****************************************%n%n");
		
		Bollette bolletta = new Bollette(12, "Bolletta Corrente", TipoBolletta.ELETTRICA, 350);
		MaterialeDidattico  materialeDidattico = new MaterialeDidattico(21, "Penne negre", 100, 1.23);
		
		scuola.addOggetto(materialeDidattico);
		scuola.addOggetto(bolletta);
		scuola.toStringa();
		scuola.emptyArary();
		System.out.printf("****************************************%n%n");
		
		//Carpentiere carpentiere = new Carpentiere(789, Materiali.QUERCIA);
		Elettricista elettricista = new Elettricista(67, 12, Servizio.RIPARAZIONE);
		//Muratore muratore = new Muratore(5, Costruzione.APPARTAMENTO, false);
		
		Rimodellazione rimodellazione = new Rimodellazione(5,elettricista);
		
		scuola.addOggetto(rimodellazione);
		scuola.toStringa();
		
		System.out.printf("%nTotale spese: $%,.2f",scuola.getTotale());
		
	}

}
