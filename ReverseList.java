package LastGroupAssignmentGroup;
import java.util.LinkedList;
import java.util.ListIterator;


    public class ReverseList {

        // Generic method to reverse a LinkedList and return a new reversed LinkedList
        public static <E> LinkedList<E> reverseLinkedList(LinkedList<E> list) {
            LinkedList<E> reversedList = new LinkedList<>();
            ListIterator<E> iterator = list.listIterator(list.size()); // Start from the end

            // Traverse the list in reverse and add elements to the new list
            while (iterator.hasPrevious()) {
                reversedList.add(iterator.previous());
            }

            return reversedList;
        }

        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("A");
            linkedList.add("B");
            linkedList.add("C");
            linkedList.add("D");

            System.out.println("Original LinkedList: " + linkedList);
            LinkedList<String> reversedLinkedList = reverseLinkedList(linkedList);
            System.out.println("Reversed LinkedList: " + reversedLinkedList);
        }
    }


