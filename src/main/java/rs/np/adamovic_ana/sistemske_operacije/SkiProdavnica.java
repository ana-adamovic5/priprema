package rs.np.adamovic_ana.sistemske_operacije;

import rs.np.adamovic_ana.domenske_klase.Skije;
import java.util.List;



public interface SkiProdavnica {
	
	public void nabaviSkije(Skije skije);
	
	public void prodajSkije(Skije skije);
	
	public List<Skije> vratiSveSkije();
	
	public String serijalizujJSON();

	public void deserijalizujJSON(String fajl);
}
