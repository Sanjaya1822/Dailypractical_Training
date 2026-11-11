import java.util.*;
public class shiftflusingqueue {
    public static void main(String[] args){
        Queue< Integer> q = new LinkedList<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        int k=q.poll();
        q.offer(k);
        while(q.size()>0){
            System.out.print(q.poll()+" ");
        }
    }
}
