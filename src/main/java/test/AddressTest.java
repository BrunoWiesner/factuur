

import model.*;
import org.junit.*;
//import org.junit.gen5.api.BeforeAll;
//import org.junit.gen5.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AddressTest {

    @BeforeClass
    public static void startTest(){
            System.out.println("**************  Start AddressTest **************");}


@Test
    public void test_Aanmaak_Address_Object(){
    String postCode="2800";
    String gemeente="Mechelen";
    String straat="Oude baan";
    String nummer="2";
    String bus="";
    String email="info@syntra-ab.be";
    String land="België";

    Address address = new Address(postCode,gemeente,straat,nummer,bus,email,land);

    assertTrue(postCode.equals(address.getPostCode()));
    assertTrue("gemeente".equals(address.getGemeente()));
 assertTrue(straat.equals(address.getStraat()));
    assertTrue(nummer.equals(address.getNummer()));
    assertTrue(bus.equals(address.getBus()));
    assertTrue(email.equals(address.getEmail()));
    assertTrue(land.equals(address.getLand()));


}



    @Test
   public void testObjectCreation()
    {
        String postCode="2800";
        String gemeente="Mechelen";
        String straat="Oude baan";
        String nummer="2";
        String bus="";
        String email="info@syntra-ab.be";
        String land="België";

        Address address = new Address(postCode,gemeente,straat,nummer,bus,email,land);

        System.out.println(address);
        assertEquals(postCode,address.getPostCode());
        assertEquals(gemeente,address.getGemeente());
        assertEquals(straat,address.getStraat());
        assertEquals(nummer,address.getNummer());
        assertEquals(bus,address.getBus());
        assertEquals(email,address.getEmail());
        assertEquals(land,address.getLand());


/*        System.out.println("check getPostCode = " + (postCode.equals(address.getPostCode())));
        System.out.println("check getGemeente = " + (gemeente.equals(address.getGemeente())));
        System.out.println("check getStraat = " + (straat.equals(address.getStraat())));
        System.out.println("check getNummer = " + (nummer.equals(address.getNummer())));
        System.out.println("check getBus = " + (bus.equals(address.getBus())));
        System.out.println("check getEmail = " + (email.equals(address.getEmail())));
        System.out.println("check getLand = " + (land.equals(address.getLand())));

 */
    }


/*
    @BeforeClass
    public static void before() {
        System.out.println("************** Start AddressTest *******************");
    }


    @AfterClass
    public static void after() {
        System.out.println("**************** End AddressTest *******************");
    }

*/

    @AfterClass
    public static void endTest(){
        System.out.println("**************  End AddressTest **************");}

}
