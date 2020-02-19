

import model.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class TestAddress {





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



    @BeforeClass
    public static void before() {
        System.out.println("************** Start TestAddress *******************");
    }


    @AfterClass
    public static void after() {
        System.out.println("**************** End TestAddress *******************");
    }





}
