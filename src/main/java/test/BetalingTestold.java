

import model.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class BetalingTestold {


    @Test
    public void testObjectCreation() {
        String comment = "Dit is een mededeling die op de factuur komt";

        Betaling betaling = new Betaling(comment);
        System.out.println(betaling);
        assertEquals(comment, betaling.getMededeling());
    }




        @BeforeClass
    public static void before() {
        System.out.println("************** Start BetalingTestold *******************");
    }


    @AfterClass
    public static void after() {
        System.out.println("**************** End BetalingTestold *******************");
    }
}
