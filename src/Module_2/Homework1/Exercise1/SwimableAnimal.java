package Module_2.Homework1.Exercise1;

public class SwimableAnimal extends Animal implements Swimable {

    public SwimableAnimal(String animalRepresentation) {
        super(animalRepresentation, Swimable.ANIMAL_ABILITY, Swimable.ANIMAL_MAIN_ACTION);
    }

    @Override
    public void swim() {
        doMainAction();
    }
}
