import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers c=new ConsecutiveNumbers();
    @Test
    public void testConsecutiveNumbers() {

        String s = "10,11,12,13,14,15,16,17";
        assertEquals(
                "check in sequential order if is it consecutive or not",
                "consecutive", c.getConsecutiveNumbers(s));
    }

    @Test
    public void testConsecutive() {
        String s = "11,10,9,8,7,6";
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "consecutive", c.getReverseConsecutiveNumbers(s));
    }
    @Test
    public void testConsecutiveNegative() {
        String s = "0,-1,-2,-3,-4,-5";
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "consecutive", c.getNegativeConsecutiveNumbers(s));
    }
    @Test
    public void testConsecutiveSame() {
        String s = "6,6,6,6,6,6";
        assertEquals(
                "check in reverse order if is it consecutive or not",
                "Non consecutive", c.getConsecutiveNumbers(s));
    }
}