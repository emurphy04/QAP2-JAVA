package QAP2;

public class Address {
    String street;
    String city;
    String province;
    String postalCode;

    public Address(String street, String city, String province, String postalCode){
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    @Override
    public String toString(){
        return new String(this.street+", "+this.city+" "+this.province+", "+this.postalCode);
    }
}
