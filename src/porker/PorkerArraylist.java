package porker;

import java.util.ArrayList;
import java.util.Random;

public class PorkerArraylist {

	public static void main(String[] args) {
		String flowers ="SHDC"; 
		ArrayList<Integer> porker = new ArrayList();
		Random r = new Random();
		

		for (int i = 0; i < 52; i++) {
			porker.add(i);
		}

		for (int i = 0; i < 25; i++) {
			int change = r.nextInt(52);
			int temp = porker.get(i);
			porker.set(i, porker.get(change));
			porker.set(change, temp);
		}
		
		for(int i=0;i<52;i++) {
			System.out.println(flowers.charAt(porker.get(i)/13)+""+((porker.get(i)%13)+1));
		}
	}

}
