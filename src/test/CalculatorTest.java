package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {
	private Calculator calculator;

	@BeforeEach
	void setup() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("正の整数の絶対値の足し算")
	void testAddAbsolute_PositiveNumbers() {
		assertEquals(10, calculator.addAbsolute(3, 7));
	}

	@Test
	@DisplayName("正と負の整数の絶対値の足し算")
	void testAddAbsolute_MixedNumbers() {
		assertEquals(10, calculator.addAbsolute(-3, 7));
	}

	@Test
	@DisplayName("0を含む絶対値の足し算")
	void testAddAbsolute_WithZero() {
		assertEquals(5, calculator.addAbsolute(5, 0));
	}

	@Test
	@DisplayName("両方が負の整数の絶対値の足し算")
	void testAddAbsolute_BothNegativeNumbers() {
		assertEquals(10, calculator.addAbsolute(-3, -7));
	}

}
