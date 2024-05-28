package QAP2;

public class Person {
    String fname;
    String lname;
    String address;

    public Person(String fname, String lname, Address address){
        this.fname = fname;
        this.lname = lname;
        this.address = address.toString();
    }

    public String getPerson(){
        return new String(this.fname+" "+this.lname+" | "+this.address);
    }
}
