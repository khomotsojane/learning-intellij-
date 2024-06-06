package org.example;

public class Person {
    String name;
    String department;
    int id;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "org.example.Person{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                '}';
    }
}
