import java.util.*;

public class LatinSquare {
	public static int[] getColumn(int a[][], int c){
		int col = new int[a.length];
		for (int r=0; r<a.length; ++r) col[r] = a[r][c];
	}

	public static boolean hasAllValues(int a[], int b[]){
		for (int x : a){
			if (b.indexOf(x) == -1) return false;
		}
		return true;
	}

	public static boolean containsDuplicates(int arr[]){
		HashSet<int> h = new HashSet<int>();
		for (int x : a){
			if (h.contains(x)) return true;
			h.add(x);
		}
		return false;
	}

	public static boolean isLatin(int a[][]){
		if (containsDuplicates(a[0])) return false;
		for (int r[] : a) if (!hasAllValues(a[0], a[r])) return false;
		for (int c=0; c<a[0].length; ++c) if (!hasAllValues(getColumn(a, 0), getColumn(a, c))) return false;
		return true;
	}
}
