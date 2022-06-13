package dandy.com.day1.sub;

import java.util.ArrayList;

public class TugasArrayList {

	public TugasArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Double> angkaDouble = new ArrayList<Double>();
		angkaDouble.add(5.80);
		angkaDouble.add(5.20);
		angkaDouble.add(3.99);
		
		for (int a = 0; a < angkaDouble.size(); a++) {
			System.out.println(angkaDouble.get(a));
		}
		

	}

}
