package dandy.com.day1.sub;

public class Static1 {

	int harga;
	
	static class Main {
		public static void main(String[] args) {
			
		Static1 st = new Static1();
		Static1 st2 = new Static1();
		
		st.harga = 80000;
		st2.harga = 120000;
		
		int res;
		
		st2.harga =90000;
		
		System.out.println("harga st :"+ st.harga + "\nharga st2: "+st2.harga);
		}
	}
	public static void main(String[] args) {
		
		MethodFunction mf = new MethodFunction();
		int result = Static1();
		
		System.out.println();
		System.out.println(result*2%2);
		
	}
	private static int Static1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
