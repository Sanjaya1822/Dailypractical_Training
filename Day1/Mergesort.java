
import java.util.*;

public class Mergesort {

    public static int[] mergeSort(int[] a) {

        if(a.length <= 1) {
            return a;
        }

        int mid = a.length / 2;

        int[] left = new int[mid];
        int[] right = new int[a.length - mid];

        for(int i = 0; i < mid; i++) {
            left[i] = a[i];
        }

        for(int i = mid; i < a.length; i++) {
            right[i-mid] = a[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length) {

            if(left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            }
            else {
                result[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sorted = mergeSort(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }

        sc.close();
    }
}
```