package rs.np.adamovic_ana.domenske_klase;

import java.util.Objects;
/**
 * Predstavlja skije iz prodavnice, konkretan model i duzina
 * @author Ana Adamovic
 *
 */

public class Skije {
	
	/**
	 * Marka i model skija.
	 */
	private String markaModel;
	
	/**
	 * Duzina skija u centimetrima.
	 */
	private int duzina;
	
	/**
	 * 
	 * Kolicina (broj pari) skija na stanju u prodavnici
	 */
	private int kolicina;
	
	/**
	 * 
	 * Cena skija u dinarima
	 */
	private int cena;

	
	/**
	 * Vraca marku i model skija.
	 * @return marka i model kao String.
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja marku i model skija.
	 * 
	 * @param markaModel Marka i model skija. Ne sme biti null kraci od dva znaka.
	 * @throws NullPointerException ako je unet null markaModel
	 * @throws IlleglArgumentException ako je unet String kraic od dva znaka
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException();
		
		if (markaModel.length() < 2)
			throw new IllegalArgumentException();
		
		this.markaModel = markaModel;
	}

	/**
	 * Vraca duzinu skija u cm.
	 * @return duzina skija u cm
	 */
	public int getDuzina() {
		return duzina;
	}

	/**
	 * Postavlja duzinu skija.
	 * @param duzina duzina skija u cm
	 * @throws 
	 */
	public void setDuzina(int duzina) {
		if (duzina < 0 || duzina > 225)
			throw new IllegalArgumentException();
		
		this.duzina = duzina;
	}

	public int getKolicina() {
		return kolicina;
	}

	/**
	 * Postavlja kolicinu skiuja na stanje u prodavnici.
	 * @param kolicina kolicina skija (broj pari) na stanju u prodavnici. Mora biti nula ili veca
	 * @throws 
	 */
	public void setKolicina(int kolicina) {
		if (kolicina < 0)
			throw new IllegalArgumentException();	
			
		this.kolicina = kolicina;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		if (cena < 0)
			throw new IllegalArgumentException();
		
		this.cena = cena;
	}

	//ne mora javadoc
	@Override
	public String toString() {
		return "Skije [markaModel=" + markaModel + ", duzina=" + duzina + ", kolicina=" + kolicina + ", cena=" + cena
				+ "]";
	}

	//pise se javadoc kada se ne koriste svi atributi z poredjenje/ generisanje hash coda
	/**
	 * Izracunava i vraca hash code na osnovu duzine i markeModela
	 * @return hash code izracunat na osnovu duzine i markeModela
	 */
	@Override
	public int hashCode() {
		return Objects.hash(duzina, markaModel);
	}

	/**
	 * 
	 * Poredi dva para skija prema atributima markaModel i duzina
	 * @param obj Drugi par skija
	 * @return true ako su objekti iste klase i imaju iste vrednosti atributa markaModel i duzina, a false u svim ostalim slucajeviuma.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skije other = (Skije) obj;
		return duzina == other.duzina && Objects.equals(markaModel, other.markaModel);
	}

}
