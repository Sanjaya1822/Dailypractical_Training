import java.util.Scanner;
public class swaparr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                l++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
