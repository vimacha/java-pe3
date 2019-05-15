import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks x=new StudentMarks();
    @Test
    public void equal()
    {
        String v=x.isComp(10);
        assertEquals("true",v);
    }
    @Test
    public void GreaterValue()
    {
        String v=x.isComp(125);
        assertEquals("Input should not be more than 100",v);
    }
    @Test
    public void LessValue()
    {
        String v=x.isComp(-5);
        assertEquals("Input should not be less than 0",v);
    }

}