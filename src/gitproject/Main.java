package gitproject;

public class Main {
	public static void main(String[] args) {
		// 8クイーン問題
		int N = 8;
		int[] queens = new int[N];
		placeQueens(queens, 0);
	}

	public static void placeQueens(int[] queens, int row) {
		int N = queens.length;
		if (row == N) {
			printQueens(queens);
			return;
		}
		for (int col = 0; col < N; col++) {
			if (isSafe(queens, row, col)) {
				queens[row] = col;
				placeQueens(queens, row + 1);
			}
		}
	}

	public static boolean isSafe(int[] queens, int row, int col) {
		for (int i = 0; i < row; i++) {
			if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
				return false;
			}
		}
		return true;
	}

	public static void printQueens(int[] queens) {
		int N = queens.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (queens[i] == j) {
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
