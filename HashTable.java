import java.util.ArrayList;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {
		ArrayList<Double> nilai = new ArrayList<Double>();
		
		nilai.add(7.0);
		nilai.add(4.0);
		nilai.add(12.0);
		nilai.add(10.0);
		nilai.add(9.0);
		nilai.add(3.0);
		nilai.add(18.0);
		nilai.add(15.0);
		nilai.add(20.0);
		nilai.add(5.0);

		System.out.println("Data : " + nilai.toString());

		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan kunci pencarian: ");
		double key = s.nextDouble();
		int posisi = -1;
		for (int i = 0; i < nilai.size(); i++) {
			if (key == nilai.get(i)) {
				posisi = i;
				break;
			}
		}
		if (posisi != -1) {
			System.out.println("KEY: " + key + " Berada di index array list: "
					+ posisi);
		} else {
			System.out.println("KEY TIDAK DITEMUKAN");

		}

	}

}
