package com.example.capp;

public class Sibling extends FamilyMember{

    public Sibling (){
        super();
        super.setEmail("jlinburg@doversd.org");
    }
    public Sibling (String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        super.setEmail("jlinburg@doversd.org");
    }

    public String toString(){
        String output = "Sibling: " + this.getFirstName() + " " + this.getLastName();
        return output;
    }


}
