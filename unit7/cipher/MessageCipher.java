import java.util.*;

public class MessageCipher {
	private String[][] g;
	private int n, m;

	public MessageCipher(int n, int m){
		this.n = n;
		this.m = m;
		g = new String[n][m];
	}

	public void fillBlock(String str){
		int cur =0;
		for (int r=0; r<n; ++r){
			for (int c=0; c<m; ++c){
				if (cur > str.size()-1){
					g[r][c] = "A";
				} else {
					g[r][c] = str.substring(cur, cur+1);
					++cur;
				}
			}
		}
	}

	public void printTable(){
		for (int r=0; r<n; ++r){
			for (int c=0; c<m; ++c){
				System.out.print(g[r][c] + "  ");
			}
			System.out.println();
		}
	}

	public String[][] getTable(){
		return g;
	}

	public String encryptBlock(){
		String ans = "";
		for (int r=0; r<n; ++r){
			for (int c=0; c<m; ++c){
				ans += g[r][c];
			}
		}
		return ans;
	}

	public String encryptMessage(String s){
		String ans = "";
		for (int i=0; i<s.size(); i+=n*m){
			fillBlock(s.substring(i, i+n*m));
			ans += encryptBlock();
		}
		return ans;
	}
}
