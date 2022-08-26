package Module_2.Homework1.Exercise1;

public class FlyableAnimal extends Animal implements Flyable {

    public FlyableAnimal(String animalRepresentation) {
        super(animalRepresentation, Flyable.ANIMAL_ABILITY, Flyable.ANIMAL_MAIN_ACTION);
    }

    @Override
    public void fly() {
        doMainAction();
    }
}
