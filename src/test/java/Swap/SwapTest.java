package Swap;

import Table.Table;
import org.junit.Assert;
import org.junit.Test;

/**
 * Get the tests passing.
 */
public class SwapTest<T> {
    @Test
    public void testSwap() {
        T[] result = (T[]) Swap.swap(0,1, 1, 2,3);
        Integer[] expected = {2, 1, 3};
        Assert.assertArrayEquals(expected, result);
    }
}