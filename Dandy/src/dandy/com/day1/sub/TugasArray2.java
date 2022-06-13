package dandy.com.day1.sub;

public class TugasArray2 {

	public TugasArray2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int sizeBaris = 2;
         int sizeKolom = 2;
         String[] [] kotak = new String[sizeBaris][sizeKolom];
         
         kotak[0] [0] = "x"; kotak [0] [1] = "x";
         kotak [1] [0] = "x"; kotak[1] [1] = "x";
         
         for (int baris  = 0; baris < sizeBaris; baris++) {
			for (int kolom = 0; kolom < sizeKolom; kolom++) {
				System.out.print(kotak[baris] [kolom]+ "");
			}
			System.out.println();
		}
         
        
	}

}
