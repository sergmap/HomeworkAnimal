import models.*;

public class HomeworkAnimalApplication {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cow cow = new Cow();
        Goat goat = new Goat();
        Grass grass = new Grass();

        cow.Eating(new Grass());
        goat.Eating(new Grass());
        lion.Eating(cow);
        lion.Eating(goat);

        //goat.Eating(lion); Error
        //lion.Eating(new Grass()); Error
    }
}
