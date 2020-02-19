package model;

import nl.garvelink.iban.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** This class contains custom static validators
 * <h2><b>Method-list</b></h2>
 * <ul><li>isMailAddressValid</li>
 * <li>formatPhoneNumber</li></ul>
 * @author Syntra
 * @version 1.0
 * @since 1.0
 */
final public class Validator {


    /**
     * Checks if the email-address contains 1 @ character
     * @param mailAddress
     * @return
     */
    public static boolean isMailAddressValid(String mailAddress)
    {
        if(mailAddress.contains("@") && (mailAddress.indexOf("@") == mailAddress.lastIndexOf("@")))
        {
            // check domain
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * reformats the phone-number according to custom standards
     * <ul>
     * <li>non valid characters will be removed</li>
     * <li>characters between round brackets will be removed (including the brackets)</li>
     * <li>if phonenumber doesn't start with a + sign then BE-country code will be implemented</li></ul>
     */
    public static String formatPhoneNumber(String phoneNumber)
    {
        int pos1=0;
        int pos2=0;
        String countrycode="+32";
        phoneNumber=phoneNumber.replaceAll("[A-Za-z./ ]", "");
        pos1=phoneNumber.indexOf('(');
        pos2=phoneNumber.indexOf(')');
        if(pos1>-1 && pos2>-1){
            phoneNumber = phoneNumber.substring(0,pos1) + phoneNumber.substring(pos2+1);
        }
        if(!phoneNumber.substring(0,1).equals("+"))
        {
            phoneNumber = countrycode+phoneNumber;
        }
        return phoneNumber;
    }




    /** validation of bank-account
     * Detailed info about the api is available on
     * <a href="http://www.garvelink.nl/java-iban/#Copyright-and-License">Java IBAN api</a>
     * @param bankAccount (example:BE73 7330 1153 3128) Creation of object will fail if number is incorrec
     */
    public static boolean isBankAccountValid(String bankAccount)
    {
        try {
            IBAN iban = IBAN.valueOf(bankAccount);

            // You can use the Modulo97 class directly to compute or verify the check digits on an input.
            boolean valid = Modulo97.verifyCheckDigits( bankAccount );
            System.out.printf("Checksum check on number %s : %s\n",bankAccount,String.valueOf(valid));
            if(!valid) {
                return false;
            }
            // Get the Bank Identifier and Branch Identifier (pre-JDK 8):
            String bankId = IBANFieldsCompat.getBankIdentifier( iban );
                System.out.printf("Check bankid %s : %s\n",bankAccount,String.valueOf(!(bankId==null||bankId.equals(""))));
            if(bankId==null || bankId.equals(""))
            {
                return false;
            }

        }catch(Exception e)
        {
            System.out.println("error in iban-check-routine : " + e.getLocalizedMessage());
            return false;
        }
        return true;
    }

}
