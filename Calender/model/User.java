package Calender.model;

public class User {
    private int id;
    private String name;

    public User(int id, String name){
        if (name==null||name.isEmpty())
            throw new IllegalArgumentException("Invalid name");
        this.id=id;
        this.name=name;
    }

    public String getName(){ return name; }
}