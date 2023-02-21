import java.util.ArrayArrayList;
import java.util.ArrayList;

public class SkiArea {
	private int[][] a;

	public SkiArea(int[][] a) {
		this.a = a;
	}

	public static int indexOfMax(int[] arr) {
		int mxidx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[mxidx]) {
				mxidx = i;
			}
		}
		return mxidx;
	}

	public static int rightIndexOfMax(int[] arr) {
		int mxidx = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] >= arr[mxidx]) {
				mxidx = i;
			}
		}
		return mxidx;
	}

	public int findSummit() {
		int mxidx = indexOfMax(a[0]);
		return mxidx;
	}

	public ArrayList<Location> findSteepestTrail() {
		int row = 0;
		int col = findSummit();
		ArrayList<Location> trail = new ArrayList<>();
		trail.add(new Location(row, col));

		while (row < a.length) {
			int nextRow = row + 1;
			int mnc = col;
			if (col > 0 && a[nextRow][col - 1] < a[nextRow][mnc]) mnc = col - 1;
			if (col < a[row].length - 1 && a[nextRow][col + 1] < a[nextRow][mnc]) mnc = col + 1;
			row = nextRow;
			col = mnc;
			trail.add(new Location(row, col));
		}

		return trail;
	}

	public ArrayList<Location> findZigZagTrail() {
		int row = 0;
		int col = indexOfMax(a[0]);
		ArrayList<Location> trail = new ArrayList<>();
		trail.add(new Location(row, col));

		while (row < a.length - 1) {
			int nextRow = row + 1;
			int nextCol;
			if (row % 2 == 0) {
				nextCol = rightIndexOfMax(a[nextRow]);
			} else {
				nextCol = indexOfMax(a[nextRow]);
			}
			row = nextRow;
			col = nextCol;
			trail.add(new Location(row, col));
		}

		return trail;
	}
}

