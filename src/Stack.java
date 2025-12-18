
public class Stack {
    char[] stack;
    int top;
    int capacity;

    Stack(int capacity){
        this.capacity=capacity;
        stack= new char[capacity];
        top= -1;
    }
    public void push(char a) {
        if (!isFull()) {
            stack[++top] = a;
        }
    }
    public char pop(){
        if(!isEmpty()){
            return stack[top--];
        }
        return '\0';
    }
    public boolean isFull(){
        return (top==capacity-1);
    }
    public boolean isEmpty(){
        return (top==-1);
    }
}
