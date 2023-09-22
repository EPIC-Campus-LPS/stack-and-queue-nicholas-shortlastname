/**
 * Treats an array of integer values like a simple stack
 *
 * @author Nicholas Un
 * @version 1.0, 9/22/23
 * @see Clonable, EmptyStackException
 */
import java.lang.Cloneable;
import java.util.EmptyStackException;

public class Stack {
    int[] stack;
    public Stack(int[] arr){
        this.stack = arr;
    }

    /**
     * Pushes element to top of stack
     * @param element
     */
    public void push(int element){
        // makes a longer array to add all the existing elements, adds the pushed element at the end, then overwrites main array with the longer array
        int[] newStack = new int[stack.length+1];
        for(int i = 0; i < stack.length; i++){
            newStack[i] = stack[i];
        }
        newStack[stack.length] = element;
        stack = newStack.clone();
    }
    /**
     * Removes the top element from stack, and returns it
     * @return the removed top element from stack
     */
    public int pop(){
        //checks if the stack has anything to be popped, otherwise throws an EmptyStackException
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else {
            // makes a shorter array, makes note of the last element, copies the other elements into the shorter array, overwrites main array with the shorter array, and returns the previous last element
            int[] newStack = new int[stack.length - 1];
            int poppedElem = stack[stack.length - 1];
            for (int i = 0; i < stack.length - 1; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack.clone();
            return poppedElem;
        }
    }
    /**
     * Returns the top element from stack
     * @return top element of stack
     */
    public int peek(){
        //checks if the stack has anything to peek, otherwise throws an EmptyStackException
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else {
            return stack[stack.length - 1];
        }
    }
    /**
     * Checks the size of the stack
     * @returns size of the stack
     */
    public int size(){
        return stack.length;
    }
    /**
     * Checks if stack is empty
     * @return boolean if stack is empty
     */
    public boolean isEmpty(){
        if(stack.length == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
