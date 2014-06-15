import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.text.html.HTMLDocument.Iterator;

public class ListManipulator {
    public static List<Integer> sort(List<Integer> originalList) {
        List<Integer> copyList = new ArrayList<>(originalList);
        Collections.sort(copyList);
        return copyList;
        // Collections.sort(originalList);
        // return originalList;
    }

    public static List<Integer> reverse(List<Integer> originalList) {
        List<Integer> sortedList = ListManipulator.sort(originalList);
        Collections.reverse(sortedList);
        return sortedList;
    }

    public static boolean isMonotonic(List<Integer> list) {

        return ((list.equals(ListManipulator.reverse(list)) || list.equals(ListManipulator.sort(list))) ? true : false);
    }

}
