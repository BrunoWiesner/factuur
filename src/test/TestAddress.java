package test;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import model.Address;

public class TestAddress {
    public static void main(String[] args) {
        Address address = new Address("2800", "Mechelen", "Oude baan", "2", "", "info@syntra-ab.be","België");
        System.out.println(address);
    }
}
