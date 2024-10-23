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
}
