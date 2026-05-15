package main;

public class Calculator {
	public int addAbsolute(int value1, int value2) {
		if (value1 < 0) {
			value1 *= -1;
		}
		if (value2 < 0) {
			value2 *= -1;
		}
		return value1 + value2;
	}
}
