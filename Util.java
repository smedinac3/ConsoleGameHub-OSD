/**
 * General utility class for experimentation.
 *
 * @author Dr. Jody Paul
 * @author CS3250 Spring 2024
 * @version 20240127
 */
public class Util {
    /**
     * Hidden constructor for utility class
     */
    private Util() { }

    /**
     * A Fibonacci sequence generator.
     *
     * @param  index  the index into the Fibonacci sequence
     * @return the Fibonacci number corresponding to the parameter
     */
    public static long fibon(int index) {
        if (index <= 0) return 0;
        if (index == 1) return 1;
        return fibon(index - 1) + fibon(index - 2);        
    }
}
