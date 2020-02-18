
package test;
import com.sun.prism.shader.Solid_ImagePattern_Loader;
import model.Address;


public class TestAddress {


 public static void main(String[] args) {
        testObjectCreation();
    }



    private static void testObjectCreation()
    {
        String postCode="2800";
        String gemeente="Mechelen";
        String straat="Oude baan";
        String nummer="2";
        String bus="";
        String email="info@syntra-ab.be";
        String land="België";

        Address address = new Address(postCode,gemeente,straat,nummer,bus,email,land);System.out.println(address);
        System.out.println("check getPostCode = " + (postCode.equals(address.getPostCode())));
        System.out.println("check getGemeente = " + (gemeente.equals(address.getGemeente())));
        System.out.println("check getStraat = " + (straat.equals(address.getStraat())));
        System.out.println("check getNummer = " + (nummer.equals(address.getNummer())));
        System.out.println("check getBus = " + (bus.equals(address.getBus())));
        System.out.println("check getEmail = " + (email.equals(address.getEmail())));
        System.out.println("check getLand = " + (land.equals(address.getLand())));
    }




}
