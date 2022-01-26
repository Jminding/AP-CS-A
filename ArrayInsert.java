import java.util.*;

public class ArrayInsert {
    public static String[] arr = {"A", "B", "C", "D", "E", "F", "G", null, null};
    public static void main(String[] args) {
        insert("Sus", 5);
        for (String s : arr) System.out.print(s + " ");
        System.out.println();
    }
    public static void insert(String word, int pos) {
        if (arr.length - 1 - pos >= 0) System.arraycopy(arr, pos, arr, pos + 1, arr.length - 1 - pos);
        arr[pos] = word;
    }
}
