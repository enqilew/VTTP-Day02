package cars;

public class Car {

    //Members of the class
    private String make;
    private String owner;

    //Constructor -same name as methods but no type "void"
    public Car() {}

    //Getters and setters
    //make property
    public void setMake(String m){this.make = m;}
    public  String getMake(){return this.make;}

    public void setOwner(String o){this.owner = o;}
    public String getOwner(){return this.owner;}
    //Mehtods - behabiours
    public void info() {
        System.out.printf("Make: %S, Owner: %S", this.make, this.owner);
    }


}