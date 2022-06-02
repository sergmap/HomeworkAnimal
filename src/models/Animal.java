package models;

public class Animal extends NaturalEntity{

    public Animal() {
    }

    protected void Eating(NaturalEntity food) {
       System.out.println(this + " eats " + food);
    };
}
