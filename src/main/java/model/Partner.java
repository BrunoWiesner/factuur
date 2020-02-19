package model;

import java.util.HashMap;
import java.util.List;

/** Represents a partner (customer or supplier)
 * @author Syntra
 * @version 1.0
 * @since 1.0
 */
public class Partner {

    // *********************** FIELDS
    private String naam;
    private String telefoon;
    private  String email;
    private String btwnr;
    private Address adres;
    private String reknr;
    private char partnerType;
    private HashMap<Character, String> typeParams;
    private boolean validateTelefoon;
    private boolean validateemai;
    private boolean validateBtwnr;
    private boolean validateReknr;




    // ********************* CONSTRUCTOR
    /** creates a partner
     * @param naam partnername
     * @param partnerType  <br><b>values:</b><br>
     * <ul><li>l (supplier)</li><li>k  (client)</li></ul>
     * @param adres (see Address class for more info)
     */
    public Partner(String naam, String telefoon, String email, String btwnr, String reknr, char partnerType,Address adres) {
        this.naam = naam;
        this.email=email;
        this.btwnr = btwnr;
        this.reknr = reknr;
        this.telefoon=telefoon;
        this.partnerType = partnerType;
        this.adres = adres;



        getConfig();

    }






    // ********************* GETTERS/SETTERS
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam=naam;
    }


    public String getTelefoon() {
        return telefoon;
    }

    public String getEmail() {
        return email;
    }

    public String getBtwnr() {
        return btwnr;
    }

    public void setBtwnr(String btwnr)
    {
        this.btwnr=btwnr;
    }


    public Address getAdres() {
        return adres;
    }


    public void setAdres(String postCode, String gemeente, String straat, String nummer, String bus, String email, String land)
    {
        adres = new Address(postCode,gemeente,straat,nummer,bus,email,land);
    }



    public void setEmail(String email)
    {
            this.email=email;
    }


    public void setTelefoon(String telefoon)
    {
        this.telefoon=telefoon;
    }


    public String getReknr() {
        return reknr;
    }

    public void setReknr(String reknr)
    {
        this.reknr=reknr;
    }

    public char getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(char partnerType)
    {
        this.partnerType=partnerType;
    }


    // ********************* METHODS

    /**
     * @return a String containing Typedescription
     */
    public  String getPartnerTypeDescription() {
       return typeParams.get(partnerType);
   }


    @Override
    public String toString() {
        return "Partner{" +
                "naam='" + naam + '\'' +
                ", telefoon='" + telefoon + '\'' +
                ", email='" + email + '\'' +
                ", btwnr='" + btwnr + '\'' +
                ", adres=" + adres +
                ", reknr='" + reknr + '\'' +
                ", partnerType=" + partnerType +
                '}';
    }





    private void getConfig()
    {
        typeParams = new HashMap<Character, String>();

        typeParams.put('k',"klant");
        typeParams.put('K',"klant");
        typeParams.put('l',"leverancier");
        typeParams.put('L',"leverancier");

    }

}


