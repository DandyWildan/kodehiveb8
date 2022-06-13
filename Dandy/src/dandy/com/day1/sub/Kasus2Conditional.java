package dandy.com.day1.sub;

public class Kasus2Conditional {

	public Kasus2Conditional() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int HargaDaging = 10000;
      if (HargaDaging < 10000  || HargaDaging == 15000   ) {
    	  System.out.println("HargaDaging : Dijual Dibawah 10 Ribu Atau 15 Ribu Murah"  );
		
	} else if (HargaDaging> 60000 || HargaDaging == 70000) {
		System.out.println("HargaDaging : Dijual Diatas 60 Ribu Atau 70 Ribu");
	} else {
		System.out.println();
	}
    
	}

}
