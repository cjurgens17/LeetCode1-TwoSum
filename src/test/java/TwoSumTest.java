import static org.junit.Assert.*;

public class TwoSumTest {

    @org.junit.Test
    public void twoSum() {
        int[] expected = new int[] {0,1};
        int target = 9;

        int[] expected2 = new int[] {1,2};
        int target2 = 6;

        int[] expected3 = new int[] {0,1};
        int target3 = 6;

        int[] actual1 = TwoSum.twoSum(new int[] {2,7,11,15},target);
        int[] actual2 = TwoSum.twoSum(new int[] {3,2,4},target2);
        int[] actual3 = TwoSum.twoSum(new int[] {3,3},target3);

        assertArrayEquals(expected,actual1);
        assertArrayEquals(expected2,actual2);
        assertArrayEquals(expected3,actual3);

    }
}