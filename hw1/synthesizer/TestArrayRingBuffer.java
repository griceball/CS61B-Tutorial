package synthesizer;
import edu.princeton.cs.algs4.In;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        ArrayRingBuffer<Integer>  arb= new ArrayRingBuffer(2);
        assertTrue(arb.isEmpty());
        arb.enqueue(1);
        arb.enqueue(20);
        assertTrue(arb.isFull());
        assertEquals((int)arb.peek(),1);
        assertEquals((int)arb.dequeue(),1);

    }

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(TestArrayRingBuffer.class);
    }
} 
