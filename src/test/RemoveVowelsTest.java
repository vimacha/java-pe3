

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels oe;


    @Test
    public void removeVowels() {
        oe = new RemoveVowels();
        String[] str2 = {"gun", "car", "violin", "bike"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"gn", "cr", "vln", "bk"};

        assertArrayEquals(str1, str);


    }
    @Test
    public void AllVowels() {
        oe = new RemoveVowels();
        String[] str2 = {"aeiou", "AEIOU"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"",""};

        assertArrayEquals(str1, str);


    }

    @Test
    public void VowelsConsonants() {
        oe = new RemoveVowels();
        String[] str2 = {"v", "a", "e", "y"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"v","","","y",} ;

        assertArrayEquals(str1, str);


    }
    @Test
    public void nullPointer() {
        oe = new RemoveVowels();
        String s = "";

        String str = oe.nullPointerException(s);
        assertEquals("input string cannot be null",str);

    }

    @Test
    public void numericalValues() {
        oe = new RemoveVowels();
        String s = "1234";

        String str = oe.numericalValues(s);
        assertEquals("input string should have only characters",str);


    }





}