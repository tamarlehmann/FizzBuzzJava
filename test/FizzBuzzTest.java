import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzBuzz(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void testBuzz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzBuzz(5);
        assertEquals("Buzz",result);
    }

    @Test
    public void testFizz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzBuzz(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void testNumber(){
        FizzBuzz test = new FizzBuzz();
        String result = test.fizzBuzz(16);
        assertEquals("16",result);
    }

}