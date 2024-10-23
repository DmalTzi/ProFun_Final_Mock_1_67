import java.util.Scanner;

class Mock_2D_2 {
    public static void main(String[] Suntana) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) 
            a[i] = scan.nextInt();

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == n-1 ) {
                System.out.print(a[i]);   
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("]");
        scan.close();
    }
}
