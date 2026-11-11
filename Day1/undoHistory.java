import java.util.*;
public class undoHistory{
    
    static Stack<String> history = new Stack<>();
    public static void do_action(String action) {
        history.push(action);
    }
    public static String undo() {
        if(history.isEmpty()) {
            return "nothing to undo";
        }
        return "undid: " + history.pop();
    }
    public static void main(String[] args) {
        do_action("enroll Anu");
        do_action("enroll Ravi");
        do_action("move Ravi to Batch B");
        System.out.println(undo());
        System.out.println(undo());
        System.out.println("latest kept: " + history.peek());
    }
}
