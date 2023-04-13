package rs.np.adamovic_ana.sistemske_operacije;

import rs.np.adamovic_ana.domenske_klase.Skije;
import java.util.List;

/**
 * Predstavlja ski prodavnicu..
 * @author Ana Adamovic
 *
 */

public interface SkiProdavnica {
	
	/**
	 * Nabavlja skije za prodavnicu odnosno dodaje ih na stanje.
	 * Ako iste takve skije ne postoje u prodavnici, dodaju se,
	 * Ako vec postoje, samo im se povecava kolicina(na stanju).
	 * @param skije
	 */
	public void nabaviSkije(Skije skije);
	
	/**
	 * Prodaje skije iz prodavnice, odnosno smanjuje njihov broj na stanju.
	 * 
	 * @param skije skoje koje treba prodati. Moraju da postoje u prodavnici.
	 * @throws IllegalArgumentException ako unete skije ne postoje u prodavnici.
	 */
	public void prodajSkije(Skije skije);
	
	/**
	 * Vraca sve skije iz prodavnice.
	 * @return sve skije iz prodavnice kao listu
	 */
	public List<Skije> vratiSveSkije();
	
	/**
	 * Pretvara sve skije iz prodavnice u JSON format
	 * @return Sting sa svim skijama u JSON formatu
	 */
	public String serijalizujJSON();

	/**
	 * Ucitava jedan par skija iz fajla i unosi u prodavnicu.
	 * @param fajl putanja do JSON fajla iz kojeg treba ucitati jedan par skija.
	 */
	public void deserijalizujJSON(String fajl);
}
