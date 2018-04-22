package ab;

import java.util.Scanner;

public class AB {
	public static void main(String[] args) {
		String answer = "0513";
		int a = 0;
		int b = 0;

		while (a != 4) {
			a = 0;
			b = 0;
			System.out.print("請輸入答案:");
			Scanner scanner = new Scanner(System.in);
			String guess = scanner.nextLine();

			for (int x = 0; x < 4; x++) {
				for (int y = 0; y < 4; y++) {
					if (guess.charAt(x) == answer.charAt(y)) {
						if (x == y) {
							a += 1;
						} else {
							b += 1;
						}
					}
				}
			}

			System.out.println(a + "A" + b + "B");
		}
	}
}
