/**
 * Treats an array of integer values like a simple queue
 *
 * @author Nicholas Un
 * @version 1.0, 9/22/23
 * @see Clonable, NoSuchElementException
 */
import java.lang.Cloneable;
import java.util.NoSuchElementException;

public class Queue {
    int[] queue;
    public Queue(int[] arr){
        this.queue = arr;
    }

    /**
     * adds element to back of queue
     * @param element
     */
    public void add(int element){
        // makes a longer array to add all the existing elements, adds the new element at the end, then overwrites main array with the longer array
        int[] newQueue = new int[queue.length+1];
        for(int i = 0; i < queue.length; i++){
            newQueue[i] = queue[i];
        }
        newQueue[queue.length] = element;
        queue = newQueue.clone();
    }
    /**
     * Removes the front element from queue, and returns it
     * @return the removed front-most element from queue
     */
    public int remove(){
        //checks if the queue has anything to be removed, otherwise throws a NoSuchElementException
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else {
            // makes a shorter array, makes note of the first element, copies the other elements into the shorter array, overwrites main array with the shorter array, and returns the previously first element
            int[] newQueue = new int[queue.length - 1];
            int removedElem = queue[0];
            for (int i = 1; i < queue.length - 1; i++) {
                newQueue[i-1] = queue[i];
            }
            queue = newQueue.clone();
            return removedElem;
        }
    }
    /**
     * Returns the front element from queue
     * @return front-most element of queue
     */
    public int peek(){
        //checks if the queue has anything to peek, otherwise throws a NoSuchElementException
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else {
            return queue[0];
        }
    }
    /**
     * Checks the size of the queue
     * @returns size of the queue
     */
    public int size(){
        return queue.length;
    }
    /**
     * Checks if queue is empty
     * @return boolean if queue is empty
     */
    public boolean isEmpty(){
        if(queue.length == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
