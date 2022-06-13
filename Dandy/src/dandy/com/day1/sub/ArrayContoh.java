package dandy.com.day1.sub;

import java.util.ArrayList;

public class ArrayContoh {

	public ArrayContoh() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> namaBuah = new ArrayList<String>();
		
		namaBuah.add("Jeruk"); // menambahkan data ke dalam object arrayList
		namaBuah.add("Apple1");
		namaBuah.add("Mangga2");
		
		for (int i = 0; i < namaBuah.size(); i++) {
			System.out.println(namaBuah.get(i)+" ");
		}
		
		System.out.println();
		namaBuah.remove("Mangga2");
		namaBuah.add("Timun");
		for (int i = 0; i < namaBuah.size(); i++) {
			System.out.println(namaBuah.get(i)+" ");
		}
		System.out.println();
		System.out.println(namaBuah.get(0));
		
	}
	{
	}

}
