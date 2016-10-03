package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	
	private Map<String, Voce> voci = new TreeMap<String, Voce>();
	
	public Voce aggiungiVoce(String nome, String cognome, String telefono) throws VocaGi‡Esiste{
		
		
		if (!voci.containsKey(nome + " " + cognome))
			return voci.put(nome + " " + cognome, new Voce(nome, cognome, telefono));
		else{
				throw new VocaGi‡Esiste(nome + " " + cognome + " gi‡ esiste");
			}
	}
}
