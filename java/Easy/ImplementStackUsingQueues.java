import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {

    Deque<Integer> d = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        this.d.addLast(x);
    }
    
    public int pop() {
        return this.d.removeLast();
        
    }
    
    public int top() {
        return this.d.getLast();
    }
    
    public boolean empty() {
        return this.d.size()==0;
    }
}

public class ImplementStackUsingQueues {
    
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */