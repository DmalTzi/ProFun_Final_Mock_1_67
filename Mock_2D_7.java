import java.util.Scanner;

class Mock_2D_1 {
    public static void main(String[] Suntana) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        for (int j = 0; j < n; j++)
            for (int i = 0; i < n; i++)
                a[j][i] = scan.nextInt();

        for (int j = 0; j < n; j++)
            for (int i = 0; i < n; i++)
                b[j][i] = scan.nextInt();

        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++)
                a[i][j] += b[i][j];

        sorted(a);
        System.out.print("[");
        for (int j = 0; j < n; j++) {
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                if (i == n-1 ) {
                    System.out.print(a[j][i]);   
                } else {
                    System.out.print(a[j][i] + ", ");
                }
            }
            if (j == n-1) {
                System.out.print("]");
            } else {
                System.out.println("],");
            }
        }
        System.out.println("]");
        scan.close();
    }

    static void sorted(int[][] a) {
        int len = a.length;
        for (int i = 0; i < len-1; i++) {
            int max = i;
            int sum1 = 0;
            int sum2;
            for (int k = 0; k < len; k++) sum1 += a[i][k];
            for (int j = i+1; j < len; j++) {
                sum2 = 0;
                for (int k = 0; k < len; k++) sum2 += a[j][k];
                if (sum2 > sum1) {
                    max = j;
                } 
            }
            int[] temp = a[i];
            a[i] = a[max];
            a[max] = temp;
        }
    }
}
