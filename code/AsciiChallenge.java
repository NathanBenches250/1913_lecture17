import java.util.Arrays;

public class AsciiChallenge {
    public static void main(String[] args) {
        char[] arr = new char[10];

        // Generate ASCII characters.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ((int) (Math.random() * (126 - 33 + 1)) + 33); //33-126
        }

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        int vowelCount = 0;
        // Count vowels.
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                vowelCount = vowelCount + 1;
            }
        }

        //Count uppercase letters
        int uppercaseCount = 0;
        for (char c : arr) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }

        //Find the smallest ASCII character
        char smallestChar = arr[0];
        for (char c : arr) {
            if (c < smallestChar) {
                smallestChar = c;
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Uppercase Count: " + uppercaseCount);
        System.out.println("Smallest ASCII Character: " + smallestChar);
    }

    // Check if a character is a Vowel.
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
