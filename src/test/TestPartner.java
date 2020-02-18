
package test;
import com.sun.prism.shader.Solid_ImagePattern_Loader;
import model.Address;
import model.Partner;

public class TestPartner {

    public static void main(String[] args) {

        testObjectCreation();

    }



    private static void testObjectCreation()
    {

        String naam="Max";
        String telefoon="32(0)15/42.45.14";
        String partnerEmail="Max@ibm.com";
        String btwnr="BE4511525";
        String reknr="BE4526589545";
        char partnerType='k';

        String postCode="2800";
        String gemeente="Mechelen";
        String straat="Oude baan";
        String nummer="2";
        String bus="";
        String adresEmail="info@syntra-ab.be";
        String land="België";

        Address address = new Address(postCode,gemeente,straat,nummer,bus,adresEmail,land);
        Partner partner = new Partner(naam,telefoon,partnerEmail,btwnr,reknr,partnerType,address);
        System.out.println(partner);
        System.out.println("check getNaam = " + (naam.equals(partner.getNaam())));
        System.out.println("check getTelefoon = " + (telefoon.equals(partner.getTelefoon())));
        System.out.println("check getEmail = " + (partnerEmail.equals(partner.getEmail())));
        System.out.println("check getBtwnr = " + (btwnr.equals(partner.getBtwnr())));
        System.out.println("check getReknr = " + (reknr.equals(partner.getReknr())));
        System.out.println("check getPartnerType = " + (partnerType==partner.getPartnerType()));
        System.out.println("partnertype= " + partner.getPartnerTypeDescription());
    }

}
