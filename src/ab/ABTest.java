package ab;

import java.util.Scanner;

public class ABTest {

	public static void main(String[] args) {
		String answer = "0513";
		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		while(result !=40) {
			System.out.print("請輸入答案:");
			ABoop AB = new ABoop(scanner.nextLine());
			result = AB.Test(answer);
			System.out.println((result/10)+"A"+(result%10)+"B");
		}
	}

}
