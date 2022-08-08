package Homework4.Base;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            System.out.println("Ошибка: утка ранена");
            throw new FlyException();
        } else System.out.println("утка летит");
    }
}
