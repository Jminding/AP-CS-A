public class ArrayRemove {
    public static String[] a = {"A", "B", "C", "D", "E", "F", "G"};

    public static void main(String[] args) {
        remove(3);
        for (String s : a) System.out.print(s + " ");
        System.out.println();
    }

    public static void remove(int pos) {
        String[] temp = new String[a.length - 1];
        if (pos >= 0) System.arraycopy(a, 0, temp, 0, pos);
        if (a.length - 1 - pos >= 0) System.arraycopy(a, pos + 1, temp, pos, a.length - 1 - pos);
        a = temp;
    }
}
