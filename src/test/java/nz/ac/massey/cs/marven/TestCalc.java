package nz.ac.massey.cs.marven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCalc {
	Calc special =new Calc();
	int a=3;
	int b=2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	void test() {
		assertTrue(special.add(a, b)==5);
	}

}
