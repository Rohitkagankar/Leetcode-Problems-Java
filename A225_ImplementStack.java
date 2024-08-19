import java.util.LinkedList;
import java.util.Queue;

public class A225_ImplementStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public A225_ImplementStack() { //constructor of Stack
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        A225_ImplementStack stack = new A225_ImplementStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is: " + stack.top()); // Should print 3

        System.out.println("Popped element: " + stack.pop()); // Should print 3

        System.out.println("Top element after pop: " + stack.top()); // Should print 2

        System.out.println("Is the stack empty? " + stack.empty()); // Should print false

        stack.pop();
        stack.pop();

        System.out.println("Is the stack empty after popping all elements? " + stack.empty()); // Should print true
    }
}
