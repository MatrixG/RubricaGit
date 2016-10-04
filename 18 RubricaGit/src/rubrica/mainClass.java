package rubrica;

import rubrica.Rubrica;

public class mainClass {

	public static void main(String[] args) throws VocaGi‡Esiste, VoceNonEsiste {
	
		Rubrica myRub = new Rubrica();
		
		
		//Creo i contatti
		String nome1 = "Mario";
		String cognome1 = "Rossi";
		String tel1 = "331123456";
		
		String nome2 = "Andrea";
		String cognome2 = "Verdi";
		String tel2 = "3311233333";
		
		String nome3 = "Giorgio";
		String cognome3 = "Giallo";
		String tel3 = "33112789";
		
		
		//Aggiungo in rubrica
		myRub.aggiungiVoce(nome1, cognome1, tel1);
		myRub.aggiungiVoce(nome2, cognome2, tel2);
		myRub.aggiungiVoce(nome3, cognome3, tel3);
		
		//Uso i metodi per cercare ed eliminare
		Voce miaVoce1 = myRub.getVoce("Giorgio", "Giallo");
		System.out.println(miaVoce1.getCognome() + " " + miaVoce1.getNome() + " " + miaVoce1.getTelefono());
		Voce miaVoce2 = myRub.getVoce("Andrea", "Verdi");
		System.out.println(miaVoce2.getCognome() + " " + miaVoce2.getNome() + " " + miaVoce2.getTelefono());
		Voce utenteEliminato = myRub.cancellaVoce("Giorgio", "Giallo");
		System.out.println(utenteEliminato.getCognome() + " " + utenteEliminato.getNome() + " " + utenteEliminato.getTelefono());
		
		myRub.getTutteVoci();	
		
	}
}
