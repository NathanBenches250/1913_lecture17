import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomInt = random.nextInt(100);
        System.out.println("Random number: " + randomInt);
    }
}
