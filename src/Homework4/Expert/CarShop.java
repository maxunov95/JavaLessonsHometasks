package Homework4.Expert;

public class CarShop {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void sellCar() {
        System.out.println("Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):");
        try {
            this.car.printPrice();
            System.out.println("Хочешь купить авто? (Вызвано из объекта CarShop)");
        } catch (RuntimeException e) {
           System.out.println("Давайте посмотрим другое авто? (Вызвано из объекта CarShop)");
        }
    }
}
