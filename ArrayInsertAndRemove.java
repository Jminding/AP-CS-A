import java.util.*;

public class ArrayInsertAndRemove {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G"};
        Object[] arr1 = insert(arr, "Sus", 4);
        Object[] arr2 = remove(arr, 4);
        for (Object s : arr1) System.out.print(s + " ");
        System.out.println();
        for (Object s : arr2) System.out.print(s + " ");
        System.out.println();
    }

    public static<T> Object[] insert(T[] arr, T word, int pos) {
        ArrayList<T> temp = new ArrayList<T>(Arrays.asList(arr));
        temp.add(pos, word);
        return temp.toArray();
    }

    public static<T> Object[] remove(T[] arr, int pos) {
        ArrayList<T> temp = new ArrayList<T>(Arrays.asList(arr));
        temp.remove(pos);
        return temp.toArray();
    }
}
