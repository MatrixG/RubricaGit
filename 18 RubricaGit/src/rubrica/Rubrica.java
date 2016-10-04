package rubrica;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	private Map<String, Voce> voci = new TreeMap<String, Voce>();
	
	public Voce aggiungiVoce(String nome, String cognome, String telefono) throws VocaGi�Esiste{
		
		
		if (!voci.containsKey(nome + " " + cognome))
			return voci.put(nome + " " + cognome, new Voce(nome, cognome, telefono));
		else{
				throw new VocaGi�Esiste(nome + " " + cognome + " esistente");
			}
	}
	
	//Prende un nome e cognome e verifica se esiste. 
	//Nel caso non esiste lancia una eccezione
	public Voce getVoce(String nome, String cognome) throws VoceNonEsiste{
		
		if (!voci.containsKey(nome + " " + cognome))
			throw new VoceNonEsiste(nome + " " + cognome + "non presente in rubrica!");
	
		
		return voci.get(nome + " " + cognome);
	}
	
	//Ritorna una lista con tutte le voci in rubrica
	public List<Voce> getTutteVoci(){
		
		return null;
	}
	
	//Aggiorna il numero di telefono se valido
	public Voce aggiornaVoce (String nome, String cognome, String tel) throws VoceNonEsiste{
		
		if (!voci.containsKey(nome + " " + cognome))
		throw new VoceNonEsiste(nome + " " + cognome + "non presente in rubrica!");

		voci.get(nome + " " + cognome).setTelefono(tel);;
		
		return voci.get(nome + " " + cognome);
	}
	
	//Cancella un contatto e ritorna il contatto cancellato
	public Voce cancellaVoce (String nome, String cognome){
		
		return null;
	}
}
