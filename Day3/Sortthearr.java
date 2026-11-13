import java.util.Scanner;
public class Sortthearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        int c = 0;
        int i = 0;
        int j = n / 2;
        while (i < n / 2 && j < n) {
            if (arr[i] < arr[j]) {
                res[c++] = arr[i];
                i++;
            } else {
                res[c++] = arr[j];
                j++;
            }
        }
        while (i < n / 2) {
            res[c++] = arr[i++];
        }
        while (j < n) {
            res[c++] = arr[j++];
        }
        for (i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
