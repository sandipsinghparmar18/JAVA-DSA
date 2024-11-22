import java.util.*;
public class STACK {
    public static void sortStack(Stack<Integer>stack){
        if(stack.isEmpty()) return;
        int top=stack.pop();
        sortStack(stack);
        sortedInsert(stack,top);
    }
    private static void sortedInsert(Stack<Integer>stack,int element){
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        sortedInsert(stack, element);
        stack.push(top);
    }
    public static void printStack(Stack<Integer> stack) {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Example 1
        stack.push(-3);
        stack.push(14);
        stack.push(18);
        stack.push(-5);
        stack.push(30);
        
        System.out.println("Original Stack: ");
        printStack(stack);
        
        sortStack(stack);
        
        System.out.println("Sorted Stack: ");
        printStack(stack);    

    }
}