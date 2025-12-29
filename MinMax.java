import java.util.Arrays;
import java.util.Random;

public class MinMax {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = random.ints(10, 1, 101).toArray();
        
        System.out.print("Array elements: ");
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
        
        System.out.println();
        System.out.println();

        int minNumber = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Smallest element: " + minNumber);
        
        int maxNumber = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Largest element: " + maxNumber);
    }
}