public class ArrayInsert {
    public static String[] arr = {"A", "B", "C", "D", "E", "F", "G"};

    public static void main(String[] args) {
        insert("Sus", 5);
        for (String s : arr) System.out.print(s + " ");
        System.out.println();
    }

    public static void insert(String word, int pos) {
        String[] temp = new String[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            temp[i] = arr[i];
        }
        temp[pos] = word;
        for (int i = pos + 1; i < arr.length + 1; i++) {
            temp[i] = arr[i - 1];
        }
        arr = temp;
    }
}
