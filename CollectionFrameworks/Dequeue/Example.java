package CollectionFrameworks.Dequeue;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        Deque <String> deque = new ArrayDeque<String>(); // Deque is a double ended queue
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");

        for(String str : deque){
            System.out.println(str);
        }
        deque.offer("Sathvik");
        System.out.println("After offer() Traversal...");
        for(String str : deque){
            System.out.println(str);
        }
        deque.offerFirst("Rahul");
        System.out.println("\nAfter offerFirst Traversal...");
        for(String str : deque){
            System.out.println(str);
        }
        deque.offerLast("Varun");
        System.out.println("\nAfter offerLast Traversal...");
        for(String str : deque){
            System.out.println(str);
        }
        System.out.println("\nPoll First Element: " + deque.pollFirst());
        System.out.println("\nPoll Last Element: " + deque.pollLast());
        System.out.println("\nAfter pollLast() Traversal...");
        for(String str : deque){
            System.out.println(str);
        }
        System.out.println("\nPeek First Element: " + deque.peekFirst());
        System.out.println("\nAfter peekFirst() Traversal...");
        for(String str : deque){
            System.out.println(str);
        }

        System.out.println("\nPeek Last Element: " + deque.peekLast());
        System.out.println("\nAfter peekLast() Traversal...");
        for(String str : deque){
            System.out.println(str);
        }
    }
}
