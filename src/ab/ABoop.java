package ab;

import java.util.Scanner;

public class ABoop {
	String guess;

	public ABoop(String guess) {
		this.guess = guess;
	}
	
	public int Test(String answer) {
		int result = 0;
		
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				if (guess.charAt(x) == answer.charAt(y)) {
					if (x == y) {
						result += 10;
					} else {
						result += 1;
					}
				}
			}
		}
		return result;
		
	}
}
