package app;

import java.util.Stack;

    public class IntegerStack {

        private Stack<Integer> stack;

        // Constructor to initialize the stack
        public IntegerStack() {
            stack = new Stack<>();
        }

        // Method to push an element onto the stack
        public void push(int element) {
            stack.push(element);
            System.out.println("Pushed element: " + element);
        }

        // Method to pop an element from the stack
        public int pop() {
            if (stack.isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1;
            } else {
                int poppedElement = stack.pop();
                System.out.println("Popped element: " + poppedElement);
                return poppedElement;
            }
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            boolean empty = stack.isEmpty();
            System.out.println("Is stack empty? " + empty);
            return empty;
        }

        // Main method for testing
        public static void main(String[] args) {
            IntegerStack integerStack = new IntegerStack();

            // Push elements onto the stack
            integerStack.push(10);
            integerStack.push(20);
            integerStack.push(30);

            // Check if the stack is empty
            integerStack.isEmpty();

            // Pop elements from the stack
            integerStack.pop();
            integerStack.pop();
            integerStack.pop();
            integerStack.pop();

            // Check if the stack is empty
            integerStack.isEmpty();
        }
    }

