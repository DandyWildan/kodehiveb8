package dandy.com.day1.sub;

public class Condition2 {

	public static void answer(int loop) {
		// TODO Auto-generated method stub
String text = "";
		
		if (loop % 2 == 0) {
			if (loop > 10) {
				text = "GENAP";
			} else {
				text = "genap";
			}
		} else {
			if (loop > 10) {
				text = "GANJIL";
			} else {
				text = "ganjil";
			}
		}
		
		for (int i = 1; i <= loop; i++) {
			
			if (i % 5 == 0) {
				System.out.println(i+" "+text+"!");				
			} else {
				System.out.println(i+" "+text);		
			}
		}
	}

	public static void main(String[] args) {

		answer(20);
		
	}

}

