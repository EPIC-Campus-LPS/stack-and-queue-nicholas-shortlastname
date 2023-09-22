public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,7,3,1,6};
        Stack Stack = new Stack(arr);
        Queue Queue = new Queue(arr);
        Stack.push(12);
        Queue.add(12);
        System.out.println(Stack.pop());
        System.out.println(Queue.remove());
        System.out.println(Stack.peek());
        System.out.println(Queue.peek());
        System.out.println(Stack.isEmpty());
        System.out.println(Queue.size());
        int[] empty = {};
        Stack emptyStack = new Stack(empty);
        Queue emptyQueue = new Queue(empty);
        System.out.println("Empty array outputs");
        System.out.println(emptyStack.size());
        System.out.println(emptyQueue.size());
        System.out.println(emptyStack.peek());
        System.out.println(emptyQueue.peek());

    }
}