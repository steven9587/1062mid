package porker;

import java.util.ArrayList;
import java.util.Random;

public class Porker {
	String flowers ="SHDC"; 
	ArrayList<Integer> porker = new ArrayList();
	Random r = new Random();
	
	public void porker() {
		for (int i = 0; i < 52; i++) {
			porker.add(i);
		}
	}
	
	public void shuffle() {
		for (int i = 0; i < 25; i++) {
			int change = r.nextInt(52);
			int temp = porker.get(i);
			porker.set(i, porker.get(change));
			porker.set(change, temp);
		}
	}
	
	public void print() {
		for(int i=0;i<52;i++) {
			System.out.println(flowers.charAt(porker.get(i)/13)+""+((porker.get(i)%13)+1));
		}
	}
}
