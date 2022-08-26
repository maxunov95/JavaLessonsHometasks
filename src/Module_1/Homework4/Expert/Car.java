package Module_1.Homework4.Expert;

public class Car {
    public int price;

    public Car(int price) {
        this.price = price;
    }

    public void printPrice() {
        if (this.price >= 0) {
            System.out.println(this.price + " - (вызванно из объекта Car)");
        } else {
            System.out.println("Неизвестна мне - (вызванно из объекта Car)");
            throw new RuntimeException();
        }
    }
}
