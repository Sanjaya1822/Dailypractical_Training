import java.util.Scanner;
 
public class Search {
	
    public static int linear(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binary(int[] arr,int t){
        int b=0,l=arr.length-1;
        while(b<=l){
            int mid=(b+l)/2;
            if(arr[mid]==t) return mid;
            else if(arr[mid]>t) l=mid-1;
            else b=mid+1;
        }
        return -1;
    }
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        int i;
        System.out.println("Enter the size ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for( i =0; i < n; i++)
            a[i] =sc.nextInt();
            
        int val=sc.nextInt();    
        int index=binary(a,val);
        if(index==-1) System.out.println("Element not found");
        else System.out.println("Element found at " + index);
    }
 
}
 
 