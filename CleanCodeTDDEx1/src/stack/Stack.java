package stack;

public class Stack {
    private boolean empty = true;
    private int size = 0;
    private int[] elements = new int[2];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element){
        this.elements[size++] = element;
    }

    public int pop(){
        if (size==0)
            throw new Underflow();
        return elements[--size];
    }

    public int getSize() {
        return size;
    }

    public class Underflow extends RuntimeException{

    }
}
