import java.util.*;
public class reversesubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch!=' '){
             st.push(ch);
           }else{
            while(!st.isEmpty()){
               res+=st.pop();
            }
            res+=" ";
           }
        }
        while(!st.isEmpty()){
               res+=st.pop();
        }
        System.out.print(res);
    }
}
