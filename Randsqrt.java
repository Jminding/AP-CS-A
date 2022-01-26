public class Randsqrt {
    public static void main(String[] args) {
        int n = (int) Math.floor(Math.random() * (144 - 121 + 1) + 121);
        System.out.println(n);
        System.out.println(sqrt((double) n));
    }

    public static double sqrt(double num) {
        return Math.pow(num, 0.5);
    }
}
