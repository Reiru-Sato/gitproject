package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.AgeChecker;

class AgeCheckerTest {
	AgeChecker ageChecker;

	@BeforeEach
	void setUp() throws Exception {
		ageChecker = new AgeChecker();
	}

	@Test
	@DisplayName("成人でお酒も飲める下限値")
	void testGenerateMessageByAge_Age20() {
		assertEquals("成人でお酒も飲めます", ageChecker.generateMessageByAge(20));
	}

	@Test
	@DisplayName("成人でお酒も飲める上限値")
	void testGenerateMessageByAge_Age120() {
		assertEquals("成人でお酒も飲めます", ageChecker.generateMessageByAge(120));
	}

	@Test
	@DisplayName("成人でお酒が飲めない下限値")
	void testGenerateMessageByAge_Age18() {
		assertEquals("成人ですがお酒は飲めません", ageChecker.generateMessageByAge(18));
	}

	@Test
	@DisplayName("成人でお酒が飲めない上限値")
	void testGenerateMessageByAge_Age19() {
		assertEquals("成人ですがお酒は飲めません", ageChecker.generateMessageByAge(19));
	}

	@Test
	@DisplayName("未成年の下限値")
	void testGenerateMessageByAge_Age0() {
		assertEquals("未成年です", ageChecker.generateMessageByAge(0));
	}

	@Test
	@DisplayName("未成年の上限値")
	void testGenerateMessageByAge_Age17() {
		assertEquals("未成年です", ageChecker.generateMessageByAge(0));
	}

	@Test
	@DisplayName("不正な年齢0未満の境界値")
	void testGenerateMessageByAge_NegativeAge() {
		assertEquals("年齢は0以上120以内を入力してください", ageChecker.generateMessageByAge(-1));
	}

	@Test
	@DisplayName("不正な年齢120越の境界値")
	void testGenerateMessageByAge_Age121() {
		assertEquals("年齢は0以上120以内を入力してください", ageChecker.generateMessageByAge(121));
	}
}
