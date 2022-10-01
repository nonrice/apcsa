public class NestedLoopsLab {
    public static void main(String[] args){
        TriangularPatternA(5);
        TriangularPatternB(5);
        TriangularPatternC(5);
        TriangularPatternD(5);
        HillPatternA(5);
        HillPatternB(5);
        HillPatternC(5);
        HillPatternD(5);
        TriangularPatternA(6);
        TriangularPatternB(6);
        TriangularPatternC(6);
        TriangularPatternD(6);
        HillPatternA(6);
        HillPatternB(6);
        HillPatternC(6);
        HillPatternD(6);
    }

    public static void draw_triangle(boolean[][] g, int r, int c, int h, int w){
        int dr = (h>0) ? 1 : -1;
        int dc = (w>0) ? 1 : -1;
        for (int mr=0; mr!=h; mr+=dr){
            for (int mc=0; mc!=dc*(Math.abs(w)-Math.abs(mr)); mc+=dc){
                g[r+mr][c+mc] = true;
            }
        }
    }

    public static void print(boolean[][] g){
        for (boolean[] r : g){
            for (boolean v : r){
                if (v) System.out.print("# ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void TriangularPatternA(int n){
        boolean[][] g = new boolean[n][n];
        draw_triangle(g, n-1, 0, -n, n);
        print(g);
    }

    public static void TriangularPatternB(int n){
        boolean[][] g = new boolean[n][n];
        draw_triangle(g, 0, 0, n, n);
        print(g);
    }

    public static void TriangularPatternC(int n){
        boolean[][] g = new boolean[n][n];
        draw_triangle(g, 0, n-1, n, -n);
        print(g);
    }

    public static void TriangularPatternD(int n){
        boolean[][] g = new boolean[n][n];
        draw_triangle(g, n-1, n-1, -n, -n);
        print(g);
    }
    
    public static void HillPatternA(int n){
        boolean[][] g = new boolean[n][2*n];
        draw_triangle(g, n-1, n-1, -n, -n);
        draw_triangle(g, n-1, n-1, -n, n);
        print(g);
    }

    public static void HillPatternB(int n){
        boolean[][] g = new boolean[n][2*n];
        draw_triangle(g, 0, n-1, n, -n);
        draw_triangle(g, 0, n-1, n, n);
        print(g);
    }

    public static void HillPatternC(int n){
        boolean[][] g = new boolean[2*n-1][2*n-1];
        draw_triangle(g, n-1, n-1, -n, -n);
        draw_triangle(g, n-1, n-1, -n, n);
        draw_triangle(g, n-1, n-1, n, -n);
        draw_triangle(g, n-1, n-1, n, n);
        print(g);
    }

    public static void HillPatternD(int n){
        boolean[][] g = new boolean[2*n-1][2*n-1];
        draw_triangle(g, 0, 0, n, n);
        draw_triangle(g, 2*n-2, 0, -n, n);
        draw_triangle(g, 0, 2*n-2, n, -n);
        draw_triangle(g, 2*n-2, 2*n-2, -n, -n);
        print(g);
    }
}
