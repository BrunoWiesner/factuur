package model;

/** Represents an address
 * @author Syntra
 * @version 1.0
 * @since 1.0
 */
public class Address{
    private String postCode;
    private String gemeente;
    private String straat;
    private String nummer;

    @Override
    public String toString() {
        return "Address{" +
                "postCode='" + postCode + '\'' +
                ", gemeente='" + gemeente + '\'' +
                ", straat='" + straat + '\'' +
                ", nummer='" + nummer + '\'' +
                ", bus='" + bus + '\'' +
                ", email='" + email + '\'' +
                ", land='" + land + '\'' +
                '}';
    }

    /** creates an address
     */
    public Address(String postCode, String gemeente, String straat, String nummer, String bus, String email, String land) {
        this.postCode = postCode;
        this.gemeente = gemeente;
        this.straat = straat;
        this.nummer = nummer;
        this.bus = bus;
        this.email = email;
        this.land = land;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLand() {
     return land;

    }

    public void setLand(String land) {
        this.land = land;
    }

    private String bus;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    private String email;
    private String land;
}
