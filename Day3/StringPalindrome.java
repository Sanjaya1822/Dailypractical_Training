import java.util.*;
public class StringPalindrome {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int l=0,r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                System.out.println("Not palindrome");
                return;
            }l++;r--;
        }
        System.out.println("Palindrome");
    }
}
