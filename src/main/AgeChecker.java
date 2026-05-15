package main;

public class AgeChecker {
	public String generateMessageByAge(int age) {
		if (age < 0 || age > 120) {
			return "年齢は0以上120以内を入力してください";
		} else if (age >= 20) {
			return "成人でお酒も飲めます";
		} else if (age >= 18) {
			return "成人ですがお酒は飲めません";
		} else {
			return "未成年です";
		}
	}
}
