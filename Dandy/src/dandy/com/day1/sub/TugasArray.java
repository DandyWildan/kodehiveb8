package dandy.com.day1.sub;

public class TugasArray {

	public TugasArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      
      int sizebaris = 2;
      int sizekolom = 2;
       String [] [] kotak = new String [sizebaris] [sizekolom];
      
       kotak [0][0] = "x";
       kotak [0] [1] = "x";
       
       for (int baris = 0; baris < sizebaris; baris++) {
    	   for (int kolom = 0; kolom < sizekolom; kolom++) {
			System.out.println(kotak[baris] [kolom] + "");
			
		}
		
	}
     
      
	}

}