import java.util.*

public class OrderMatters {
	private double[][] m;
	private int rows;
	private int cols;

	public OrderMatters(int rows, int cols){
		this.rows = rows;
		this.cols = cols;
		m = new double[rows][cols];
	}

	public void rowOrder(double a[]){
		int cur = 0;
		for (int r=0; r<rows; ++r){
			for (int c=0; c<cols; ++c){
				m[r][c] = a[cur++];
			}
		}
	}

	public void columnOrder(double a[]){
		int cur = 0;
		for (int c=0; c<cols; ++c){
			for (int r=0; r<rows; ++r){
				m[r][c] = a[cur++];
			}
		}
	}

	public void wrappedOrder(double a[]){
		rowOrder(a);
		for (int r=0; r<rows; r+=2) Collections.reverse(Arrays.asList(m[r]));
	}

	public void print2D(){
		for (int c=0; c<cols; ++c){
			System.out.print("col " + c);
		}
		System.out.println();
		for (int r=0; r<rows; ++r){
			System.out.print("row " + r);
			for (int c=0; c<cols; ++c){
				System.out.print(m[r][c]);
			}
			System.out.println();
		}
	}
}
