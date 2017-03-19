/**
 * Created by Sulaiman Samaai on 2017/03/18.
 */
import jdk.nashorn.internal.ir.annotations.Ignore;
import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static sun.nio.cs.Surrogate.is;

public class TestAssign2 extends TestCase {
    public void testFloat() throws Exception {

        assertEquals(" Expected value was inadequate: ", Assign2.subtract(9.0f, 4.5f), 4.5f);
    }

    public void testInt() throws Exception {

        assertEquals("Expected value was inadequate: ", Assign2.addition(72, 74), 146);
    }

    public void testEquality() throws Exception {

        assertSame("Expected value was inadeqaute: ", Assign2.equality("Hi", "Bye"), "Hi");
    }

    public void testnonEquality() throws Exception {

        assertNotSame("Expected value was inadeqaute: ", Assign2.equality("Hi", "Bye"), "Bye");
    }

    public void testTrue() throws Exception {
        //Assign2 a= new Assign2(); If method not made static
        assertTrue("The lucky value was not correct:", Assign2.trueOrFalse(7)); //The value must be 7 to return true.
    }

    public void testFalse() throws Exception {

        assertFalse("Guess a digit other than 7", Assign2.trueOrFalse(6));
    }

    public void testnullification() throws Exception {

        assertNull("Name value is not null", Assign2.nullification());
    }

    public void testnonNullification() throws Exception {

        assertNotNull("Name value is not null", Assign2.nonNullification());
    }

    public void testFailure() throws Exception {

        Assign2.failure();
    }

    @Test(timeout= 30000)
    public void timeOutTest() throws Exception
    {

        Assign2.timeout();
    }

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testSame()
    {
        assertThat(1, is(1));
    }

    @Test
    public void testArr() throws Exception
    {
        int[] list1 = {0,5,10,15};
        int[] list2 = {0,1,2,3};
        int[] list3 = {0,5,10,15};

        Assert.assertArrayEquals(list1, list3);
    }
}

