import java.util.*;

public class Array2D {
	private int[][] a;

	public Array2D(int[][] a){
		this.a =a;
	}

	public int max(int a[][]){
		int mx = a[0][0];
		for (int r=0; r<a.length; ++r){
			for (int c=0; c<a[r].length; ++c){
				mx = Math.max(a[r][c], mx);
			}
		}

		return mx;
	}

	public int min(int a[][]){
		int mx = a[0][0];
		for (int r=0; r<a.length; ++r){
			for (int c=0; c<a[r].length; ++c){
				mx = Math.min(a[r][c], mx);
			}
		}

		return mx;
	}

	public double median(int a[][]){
		int b = new int[a.length * a[0].length];
		int cur = 0;
		for (int r=0; r<a.length; ++r){
			for (int c=0; c<a[0].length; ++c){
				b[cur++] = a[r][c];
			}
		}

		Arrays.sort(b);
		if (b.length % 2 == 1){
			return b[(b.length-1) / 2];
		} else {
			return (b[b.length/2] + b[(b.length-1)/2]) / 2.0;
		}
	}

	public int mode() {
		HashMap<Integer, Integer> freq = new HashMap<>();
		for (int[] r : a) {
			for (int n : r) {
				freq.put(n, freq.getOrDefault(n, 0) + 1);
			}
		}
		int mode = 0;
		int maxFreq = 0;
		for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
			if (e.getValue() > maxFreq) {
				mode = e.getKey();
				maxFreq = e.getValue();
			}
		}
		return mode;
	}

	public double average() {
		int sum = 0;
		int cnt = 0;
		for (int[] r : a) {
			for (int n : r) {
				sum += n;
				cnt++;
			}
		}
		if (cnt == 0) {
			return 0;
		}
		return (double) sum / cnt;
	}

	public void printGreaterThanAverage() {
		double avg = average(a);
		for (int[] r : a) {
			for (int n : r) {
				if (n > avg) {
					System.out.print(n + " ");
				}
			}
		}
		System.out.println();
	}

	public int closestToZero() {
		int closest = a[0][0];
		for (int[] r : a) {
			for (int n : r) {
				if (Math.abs(n) < Math.abs(closest)) {
					closest = n;
				}
			}
		}
		return closest;
	}

	public int sumRow(int row) {
		if (row < 0 || row >= a.length) {
			return -1;
		}
		int sum = 0;
		for (int n : a[row]) {
			sum += n;
		}
		return sum;
	}

	public int sumCol(int col) {
		if (col < 0 || col >= a[0].length) {
			return -1;
		}
		int sum = 0;
		for (int[] r : a) {
			sum += r[col];
		}
		return sum;
	}

	public int sumMain() {
		if (a.length != a[0].length) {
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][i];
		}
		return sum;
	}

	public int sumMinor() {
		if (a.length != a[0].length) {
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i][a.length - i - 1];
		}
		return sum;
	}

}
