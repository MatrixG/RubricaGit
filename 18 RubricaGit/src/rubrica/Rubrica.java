package rubrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	private Map<String, Voce> voci = new TreeMap<String, Voce>();
	
	public Map<String, Voce> getVoci() {
		return voci;
	}

	public void setVoci(Map<String, Voce> voci) {
		this.voci = voci;
	}
	
	//aggiunge una voce in rubrica
	public Voce aggiungiVoce(String nome, String cognome, String telefono) throws VocaGi‡Esiste{
		
		
		if (!voci.containsKey(nome + " " + cognome))
			return voci.put(nome + " " + cognome, new Voce(nome, cognome, telefono));
		else{
				throw new VocaGi‡Esiste(nome + " " + cognome + " esistente");
			}
	}
	
	//Prende un nome e cognome e verifica se esiste. 
	//Nel caso non esiste lancia una eccezione
	public Voce getVoce(String nome, String cognome) throws VoceNonEsiste{
		
		if (!voci.containsKey(nome + " " + cognome))
			throw new VoceNonEsiste(nome + " " + cognome + "non presente in rubrica!");
	
		
		return voci.get(nome + " " + cognome);
	}
	
	
	
	//Aggiorna il numero di telefono se valido
	public Voce aggiornaVoce (String nome, String cognome, String tel) throws VoceNonEsiste{
		
		if (!voci.containsKey(nome + " " + cognome))
		throw new VoceNonEsiste(nome + " " + cognome + "non presente in rubrica!");

		voci.get(nome + " " + cognome).setTelefono(tel);;
		
		return voci.get(nome + " " + cognome);
	}
	
	//Ritorna una lista con tutte le voci in rubrica
		public List<Voce> getTutteVoci(){
			Map<String, Voce> tutteVoci = getVoci();
			List<Voce> tempVoci = new ArrayList<Voce>(tutteVoci.values());
			
			for(Voce v : tempVoci) {
				System.out.print(v.getNome()+" "+v.getCognome()+" "+v.getTelefono());
			}
			
			return tempVoci;
		}
		

		
		//Cancella un contatto e ritorna il contatto cancellato
		public Voce cancellaVoce (String nome, String cognome) throws VoceNonEsiste {
			
			String chiave = nome +" "+ cognome;
			Voce voce = null;
			
			if(voci.containsKey(chiave)){
				voce = voci.get(chiave);
				voci.remove(chiave);
			}else {
				throw new VoceNonEsiste(nome + " " + cognome + " non esistente");
			}
			return voce;
		}	
}
