import java.util.Scanner;
import java.util.stream.IntStream;
/**
 * Interactive driver for Util.detectRepeats method.
 * Does not implement error-checking or user experience facilitation.
 * @author Dr. Jody Paul
 * @version 20250315.3
 */
public class Demo {
    /** Number of elements between repeated values. */
    public static final int DEFAULT_INTERVAL = 3;
    /**
     * Accept input from terminal and identify repeated entries at a
     * specified distance from each other.
     * An integer command line parameter specifies the distance.
     * A default value is used if no parameter is given.
     * @param args the number of items between matching values
     */
    public static void main(final String[] args) {
        int interval = DEFAULT_INTERVAL;

        if (args.length > 0) {
            interval = Integer.parseInt(args[0]);
        }
        System.out.println("Using interval: " + interval);

        System.out.println("Enter numbers in sequence (Ctrl+D to end): ");
        IntStream numberStream = new Scanner(System.in)
                                            .tokens()
                                            .mapToInt(Integer::parseInt);
        int result = Util.detectRepeats(numberStream, interval);
        System.out.println("Number of repeats: " + result);
    }
}
