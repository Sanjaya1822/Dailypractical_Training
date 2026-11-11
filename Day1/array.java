import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}