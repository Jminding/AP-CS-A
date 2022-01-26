public class ArrayRemove {
    public static String[] a = {"A", "B", "C", "D", "E", "F", "G"};

    public static void main(String[] args) {
        remove(3);
        for (String s : a) System.out.print(s + " ");
        System.out.println();
    }

    public static void remove(int pos) {
        if (a.length - 1 - pos >= 0) System.arraycopy(a, pos + 1, a, pos, a.length - 1 - pos);
        a[a.length - 1] = null;
    }
}
