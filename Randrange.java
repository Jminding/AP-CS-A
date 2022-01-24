import java.util.*;
public class Randrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = in.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = in.nextInt();
        System.out.println((int) Math.floor(Math.random() * (upper - lower + 1) + lower));
    }
}
