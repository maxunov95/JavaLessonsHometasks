package Module_2.Homework1.Exercise1;

public class Animal {

    private String ANIMAL_REPRESENTATION;
    private String ANIMAL_ABILITY;
    private String ANIMAL_MAIN_ACTION;

    public Animal(
            String animalRepresentation, String animalAbilityRepresentation, String animalMainActionRepresentation) {

        this.ANIMAL_REPRESENTATION = animalRepresentation;
        this.ANIMAL_ABILITY = animalAbilityRepresentation;
        this.ANIMAL_MAIN_ACTION = animalMainActionRepresentation;
    }

    public void eat() {
        System.out.printf("Я %s животное %s, я ем.\n", ANIMAL_ABILITY, ANIMAL_REPRESENTATION);
    }

    public void doMainAction() {
        System.out.printf("Я %s животное %s, я %s.\n", ANIMAL_ABILITY, ANIMAL_REPRESENTATION, ANIMAL_MAIN_ACTION);
    }
}
