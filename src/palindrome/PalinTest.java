package palindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalinTest {

    private Palin palin;

    @Before
    public void init(){
        palin = new Palin();
    }

    @org.junit.Test
    public void shouldReturnIntegerOutOfStringArray() {
        //given
        String[] array = {"1", "2", "3"};
        int expected = 123;

        //when
        int actual = palin.convertStringArrayToInt(array);

        //then
        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnTrueIfNumberIsPalindorme(){
        //given
        int number = 212;

        //when
        boolean palindrome = palin.isPalindrome(number);

        //then
        assertTrue(palindrome);
    }

    @Test
    public void shouldReturnFalseIfNumberIsPalindorme(){
        //given
        int number = 21;

        //when
        boolean palindrome = palin.isPalindrome(number);

        //then
        assertFalse(palindrome);
    }


    @Test
    public void shouldReturnMinPalindromeBiggerThanGivenNumber(){
        //given
        int number = 808;
        int expected = 818;

        //when
        int actual = palin.findPalindrome(number);

        //then
        assertEquals(expected, actual);
    }


}