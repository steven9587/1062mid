package porker;

import java.util.Random;

public class PorkerDeterminant {

	public static void main(String[] args) {
		int porker[] = new int[52];
		Random random =new Random();
		String flowers = "SHDC";
		
		for(int i=0;i<porker.length;i++) {
			porker[i] = i;

		}
		
		for(int i =0;i<porker.length;i++) {
			int r = random.nextInt(52);
			int temp =porker[i];
			porker[i]=porker[r];
			porker[r]=temp;
		}
		
		for(int i=0;i<porker.length;i++) {
			System.out.println(flowers.charAt(porker[i]/13)+""+(porker[i]%13+1));
		}
	}

}
