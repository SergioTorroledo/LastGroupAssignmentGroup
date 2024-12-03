package LastGroupAssignmentGroup;
import java.util.ArrayList;
public class reverseArray {


    public class ReverseList {

        // Generic method to reverse an ArrayList in place
        public static <E> void reverseArrayListInPlace(ArrayList<E> list) {
            int left = 0;
            int right = list.size() - 1;

            while (left < right) {
                // Swap elements at left and right indices
                E temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);

                // Move the pointers
                left++;
                right--;
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);

            System.out.println("Original ArrayList: " + arrayList);
            reverseArrayListInPlace(arrayList);
            System.out.println("Reversed ArrayList: " + arrayList);
        }
    }

}
