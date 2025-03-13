public class ControlFlowExamples {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 20; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int j = 1; // Declare i outside
        for (; j <= 6561; j *= 3) {
            System.out.print(j + ", ");
        }
        System.out.println();

        while (i <= 45) { // What does this loop print?
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}
