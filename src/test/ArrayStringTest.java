
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStringTest {


    ArrayString a=new ArrayString();
    @Test

    public  void compare()
    {
        String[] a1={"10","20","30"};
        String[] a2={"10","20","40"};
        String s="not equal";
        assertEquals(s,a.isComp(a1,a2));

    }
    @Test
    public void duplicate()
    {
        String[] a1={"10","20","10","30"};
        String s="duplicates found";
        assertEquals(s,a.isDupli(a1));
    }
    @Test
    public void append()
    {
        String[] a1={"10","20","30"};
        String[] a2={"50","20","40"};
        String[] s={"10","20","30","50"};
        assertArrayEquals(s,a.isAppen(a1,a2));
    }

    @Test
    public void prepen()
    {
        String[] a1={"10","20","30"};
        String[] a2={"50","60","70"};
        String[] s={"60","10","20","30"};
        assertArrayEquals(s,a.isPrepen(a1,a2));
    }


}