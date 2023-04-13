package rs.np.adamovic_ana.domenske_klase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SkijeTest {

	Skije skije;

	@BeforeEach
	void setUp() throws Exception {
		skije = new Skije();
	}

	@AfterEach
	void tearDown() throws Exception {
		skije = null;
	}

	@Test
	void testSetMarkaModel() {
		skije.setMarkaModel("Atomic");
		assertEquals("Atomic", skije.getMarkaModel());
	}

	@Test
	void testSetMarkaModelNull() {
		assertThrows(NullPointerException.class, () -> skije.setMarkaModel(null));
	}

	@Test
	void testSetMarkaModelKratakString() {
		assertThrows(IllegalArgumentException.class, () -> skije.setMarkaModel("N"));
	}

	@Test
	void testSetMarkaModelPrazanString() {
		assertThrows(IllegalArgumentException.class, () -> skije.setMarkaModel(""));
	}

	@Test
	void testSetDuzina() {
		skije.setDuzina(183);
		assertEquals(183, skije.getDuzina());
	}

	@ParameterizedTest
	@CsvSource({ "-1", "226", "-23", "300" })
	void testSetDuzinaVanGranica(int duzina) {
		assertThrows(IllegalArgumentException.class, () -> skije.setDuzina(duzina));
	}

	@Test
	void testSetKolicina() {
		skije.setKolicina(23);
		assertEquals(23, skije.getKolicina());
	}

	@ParameterizedTest
	@CsvSource({ "-1", "-23"

	})
	void testSetKolicnaVanGranica(int kolicina) {
		assertThrows(IllegalArgumentException.class, () -> skije.setKolicina(kolicina));
	}
	
	@Test
	void testSetCena() {
		skije.setCena(23000);
		assertEquals(23000, skije.getCena());
	}

	@Test
	void testSetCenaNegativna() {
		assertThrows(IllegalArgumentException.class, () -> skije.setCena(-1));
	}
	
	@Test
	void testToString() {
		skije.setCena(450000);
		skije.setDuzina(24);
		skije.setKolicina(20);
		skije.setMarkaModel("Atomic");
		
		String str=skije.toString();
		assertTrue(str.contains("Atomic"));
	}
}
