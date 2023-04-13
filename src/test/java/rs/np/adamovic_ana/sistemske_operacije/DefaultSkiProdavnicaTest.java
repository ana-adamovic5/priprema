package rs.np.adamovic_ana.sistemske_operacije;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DefaultSkiProdavnicaTest extends SkiProdavnicaTest {

	@BeforeEach
	void setUp() throws Exception {
		sp=new DefaultSkiProdavnica();
	}

	@AfterEach
	void tearDown() throws Exception {
		sp=null;
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
