import java.util.*;
public class reversearrusingStack {
    public static void main(String[] args){
        Stack<Integer> st= new Stack<>();
        int[] arr= {1,2,3,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        while(st.size()>0){
            System.out.print(st.pop()+" ");
        }
    }
}
