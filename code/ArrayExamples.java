import java.util.Arrays;

public class ArrayExamples{
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            b[i] = 0;
        }
        int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] d = new int[]{0, 0, 0, 0, 0, 0, 0,0, 0, 0}; // hmmm?

        System.out.println(a == b);
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.equals(c, d));
        System.out.println(a);
    } // Are these arrays equal?
}
