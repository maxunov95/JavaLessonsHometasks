package Module_2.Homework1.Exercise1;

public class Zoo <F extends FlyableAnimal, S extends SwimableAnimal, B extends BitableAnimal> {

    private F flyableAnimal;
    private S swimableAnimal;
    private B bitableAnimal;

    public Zoo(F flyableAnimal, S swimableAnimal, B bitableAnimal) {
        this.flyableAnimal = flyableAnimal;
        this.swimableAnimal = swimableAnimal;
        this.bitableAnimal = bitableAnimal;
    }

    public F getFlyableAnimal() {
        return flyableAnimal;
    }

    public Zoo<F, S, B> setFlyableAnimal(F flyableAnimal) {
        this.flyableAnimal = flyableAnimal;
        return this;
    }

    public S getSwimableAnimal() {
        return swimableAnimal;
    }

    public Zoo<F, S, B> setSwimableAnimal(S swimableAnimal) {
        this.swimableAnimal = swimableAnimal;
        return this;
    }

    public B getBitableAnimal() {
        return bitableAnimal;
    }

    public Zoo<F, S, B> setBitableAnimal(B bitableAnimal) {
        this.bitableAnimal = bitableAnimal;
        return this;
    }

    public void feedFlyable() {

        this.flyableAnimal.fly();
        this.flyableAnimal.eat();
    }

    public void feedSwimable() {

        this.swimableAnimal.swim();
        this.swimableAnimal.eat();
    }

    public void feedBitable() {

        this.bitableAnimal.bite();
        this.bitableAnimal.eat();
    }
}
