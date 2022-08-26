package Module_1.Homework4.Advance2;

public class WatchBrokenError extends RuntimeException{
    public WatchBrokenError() {
        super();
        System.out.println("Ошибка: Часы сломались");
    }
}
