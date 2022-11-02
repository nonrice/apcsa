public class MergingTwoSortedArrays {
    public static int[] merge(int a[], int b[]){
        int n=a.length, m=b.length, k=n+m;
        int ans[] = new int[a.length + b.length];
        int p1=0, p2=0;
        for (int i=0; i<k; ++i){
            if (p1 == n || (p2 != m && b[p2] <= a[p1])) ans[i] = b[p2++];
            else if (p2 == m || (p1 != n && a[p1] <= b[p2])) ans[i] = a[p1++];
        }
        return ans;
    }
}
