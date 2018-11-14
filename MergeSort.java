public class MergeSort {

	public static void main(String[] args) {

		int i;
		double data[] = new double[10];
		data[0] = (7.0);
		data[1] = (4.0);
		data[2] = (12.0);
		data[3] = (10.0);
		data[4] = (9.0);
		data[5] = (3.0);
		data[6] = (18.0);
		data[7] = (15.0);
		data[8] = (12.0);
		data[9] = (20.0);
		data[10] = (8.0);


		System.out.print("nilai sebelum:\n");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + "  ");
		System.out.println();

		mergeSort_srt(data, 0, data.length - 1);

		System.out.print("setelah sorting:\n");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + "  ");
		System.out.println();

	}

	public static void mergeSort_srt(double data[], int lo, int n) {
		int low = lo;
		int high = n;
		if (low >= high) {
			return;
		}

		int middle = (low + high) / 2;
		mergeSort_srt(data, low, middle);
		mergeSort_srt(data, middle + 1, high);
		int end_low = middle;
		int start_high = middle + 1;

		while ((lo <= end_low) && (start_high <= high)) {
			if (data[low] < data[start_high]) {
				low++;
			} else {
				double Temp = data[start_high];
				for (int k = start_high - 1; k >= low; k--) {
					data[k + 1] = data[k];
				}
				data[low] = Temp;
				low++;
				end_low++;
				start_high++;
			}
		}

	}

}
