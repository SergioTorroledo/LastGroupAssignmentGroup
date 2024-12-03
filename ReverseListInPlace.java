package LastGroupAssignmentGroup;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseListInPlace  {

    // Generic method to reverse a LinkedList in place
    public static <E> void reverseLinkedListInPlace(LinkedList<E> list) {
        ListIterator<E> forwardIterator = list.listIterator(); // Start from the head
        ListIterator<E> backwardIterator = list.listIterator(list.size()); // Start from the tail

        int swaps = list.size() / 2; // Only need to swap half the list
        for (int i = 0; i < swaps; i++) {
            // Swap elements at the two iterator positions
            E temp = forwardIterator.next();
            forwardIterator.set(backwardIterator.previous());
            backwardIterator.set(temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println("Original LinkedList: " + linkedList);
        reverseLinkedListInPlace(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
