package dandy.com.day1.sub;

public class LoopClass {
	public static void main(String[] args) {
		int baris = 8;
		int kolom = 9;

		for (int i = 1; i <= baris; i++) {
			System.out.println("baris ke : " + i);
			if (i % 2 == 1) {
				for (int j = 1; j < kolom; j++) {
					System.out.println("\tkolom ke :" + j);
				}
			}

		}
	}

	public LoopClass() {
		// TODO Auto-generated constructor stub

	}
}
