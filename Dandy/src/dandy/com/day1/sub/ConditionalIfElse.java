package dandy.com.day1.sub;

public class ConditionalIfElse {

	public ConditionalIfElse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nilai = 100;
		
		if ( nilai < 90 && nilai>80 ) {
		System.out.println("Nilai : Diatas 80 Dapat Hadiah Motor");	
		} else if (nilai > 90) {
			System.out.println("Nilai : Diatas 90 Dapat Hadiah Mobil");
			
		}else if (nilai < 70 && nilai > 40 ) {
			System.out.println("Nilai : Dibawah 70 Dan Diatas 40 Dapat Baju Baru");
		 
				
			}else {
				System.out.println("Tidak Dapat Hadiah");

		}
	}

}
