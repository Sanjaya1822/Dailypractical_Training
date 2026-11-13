import java.util.Scanner;

public class Alternaterev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0,j=1;j<n;i+=2,j+=2){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
