package StackImplementation;
class Stack {
    private int data[];
    private int top;
    private int n;

    public Stack() {
        data = new int[10];
        top = -1;
        n = 10;
    }
    public Stack(int size) {
        data = new int[size];
        top = -1;
        n = size;
    }

    public boolean isEmpty() {
        return (top==-1);
    }
    public boolean isFull() {
        return (top==n-1);
    }
    public void push(int ele) {
        if (top == n-1) {
            System.out.println("Stack is FULL!");
            return;
        } 
        data[++top] = ele;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return 0;
        } 
        return data[top--];
    }
    public int top() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return 0;
        } 
        return data[top];
    }
}
public class Main {
    public static void main(String[] args) {
        Stack st1 = new Stack();
        Stack st2 = new Stack(5);

        for (int i=1; i<11; i++) {
            st1.push(i);
            if (!st2.isFull()) {
                st2.push(i*10);
            }
        }
        System.out.print("Stack 1: ");
        while (!st1.isEmpty()) {
            System.out.print(st1.pop()+" ");
        }
        System.out.print("\nStack 2: ");
        while (!st2.isEmpty()) {
            System.out.print(st2.pop()+" ");
        }
    }
}
