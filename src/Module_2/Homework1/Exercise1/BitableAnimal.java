package Module_2.Homework1.Exercise1;

public class BitableAnimal extends Animal implements Bitable {

    public BitableAnimal(String animalRepresentation) {
        super(animalRepresentation, Bitable.ANIMAL_ABILITY, Bitable.ANIMAL_MAIN_ACTION);
    }

    @Override
    public void bite() {
        doMainAction();
    }
}
