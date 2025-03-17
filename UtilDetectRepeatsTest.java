import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

/**
 * Tests for Util.detectRepeats
 *
 * @author  Dr. Jody Paul
 * @author  CS3250 Spring 2025
 * @version 20250327
 */
public class UtilDetectRepeatsTest {
    /**
     * Constructor for test class.
     */
    public UtilDetectRepeatsTest() {
    }

    /**
     * Set up the test fixture before every test case method.
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     * Tear down the test fixture after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }

    /** Example test (interval == 2). */
    @Test
    public void detectRepeats2Test() {
        IntStream inputStream = IntStream.of(4, 53, 6, 4, 9, 6, 0, 9);
        int count = Util.detectRepeats(inputStream, 2);
        assertEquals(3, count);
        inputStream = IntStream.of(1, 2, 3, 3, 2, 3, 1, 1, 2, 1, 1, 2, 3);
        count = Util.detectRepeats(inputStream, 2);
        assertEquals(5, count);
    }
}
