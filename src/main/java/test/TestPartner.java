


import model.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestPartner {


    @Test
    public void testObjectCreation()
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
        System.out.printf("partnertype= %s \n" , partner.getPartnerTypeDescription());
        assertEquals(naam,partner.getNaam());
        assertEquals(telefoon,partner.getTelefoon());
        assertEquals(partnerEmail,partner.getEmail());
        assertEquals(btwnr,partner.getBtwnr());
        assertEquals(reknr,partner.getReknr());
        assertEquals(partnerType,partner.getPartnerType());

/*
        System.out.println("check getNaam = " + (naam.equals(partner.getNaam())));
        System.out.println("check getTelefoon = " + (telefoon.equals(partner.getTelefoon())));
        System.out.println("check getEmail = " + (partnerEmail.equals(partner.getEmail())));
        System.out.println("check getBtwnr = " + (btwnr.equals(partner.getBtwnr())));
        System.out.println("check getReknr = " + (reknr.equals(partner.getReknr())));
        System.out.println("check getPartnerType = " + (partnerType==partner.getPartnerType()));
        System.out.println("partnertype= " + partner.getPartnerTypeDescription());
  */
    }


    @Test
    public void testIbanMissingCountryCode()
    {
        assertFalse(Validator.isBankAccountValid( "7330 1153 3128"));
    }
    @Test
    public void testIbanWrongNumber()
    {
        assertFalse(Validator.isBankAccountValid( "BE37 7330 1153 3121"));
    }

    @Test
    public void testIbanCorrectNumber()
    {
        assertTrue(Validator.isBankAccountValid("BE37 7330 1153 3128"));
    }


    @Test
    public void testInvalidMailWithoutAtSign()
    {
        assertFalse(Validator.isMailAddressValid("ongeldigMailAdres"));
    }

    @Test
    public void testInvalidMailWithMultipleAtSigns()
    {
        assertFalse(Validator.isMailAddressValid("ongeldig@Mail@Adres"));
    }

    @Test
    public void testInvalidMailAddress()
    {
        assertTrue(Validator.isMailAddressValid("geldigMailAdres@Syntra.be"));
    }

    @Test
    public void testPhoneNumberFormatting()
    {
        String valueBeforeFormatting="(0)15/33.33.33 nummer kantoor";
        String valueAfterFormatting="+3215333333";
        assertEquals(valueAfterFormatting,Validator.formatPhoneNumber(valueBeforeFormatting));
    }


    @BeforeClass
    public static void before() {
        System.out.println("************* Start TestPartner ********************");
    }


    @AfterClass
    public static void after() {
        System.out.println("**************** End TestPartner ********************");
    }

}
