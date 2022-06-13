package dandy.com.day1.sub;

public class ConditionLoop {

	public ConditionLoop() {
		// TODO Auto-generated constructor stub
	}

{int iterasi = 1;
int resultTrue = 0;

	while (iterasi < 10) {

		if (iterasi % 2 == 0) {
			if (iterasi <= 2) {
				System.out.println("Ini iterasi ke "+iterasi);
				System.out.println("True : "+ resultTrue);
			}else {
				System.out.println("Kondisi ke 2 False");
			}
			
		} else {
			System.out.println("Kondisi False");
		}

		iterasi++;
	while (iterasi < 10) {

		if (iterasi % 2 == 0) {
			if (iterasi <= 2) {
				System.out.println("Ini iterasi ke "+iterasi);
				System.out.println("True :  ");
			}else {
				System.out.println("Kondisi ke 2 False");
			}
			
		} else {
			System.out.println("Kondisi False");
		}

		iterasi++;
		}
	}

	


}}
