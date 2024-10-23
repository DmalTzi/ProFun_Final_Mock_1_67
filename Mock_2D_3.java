import java.util.Scanner;

class Mock_3D_1 {
    public static void main(String[] Suntana) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();
            
        sorted(a);
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("]");
        scan.close();
    }

    static int[] sorted(int[] a) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (a[min] > a[j])
                    min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
}
