package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		Calculator calc = new Calculator();
		assertEquals(10,calc.add(2,8));
		assertEquals(10,calc.division(50,5));
		assertEquals(0,calc.division(5,0));
	}

}
