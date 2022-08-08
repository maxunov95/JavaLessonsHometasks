package Homework4.Advance2;

public class HomeworkAdvance2 {
    public static void main(String[] args) {
        //Задача №2
        //2. Создать следующую структуру из классов и интерфейсов
        // магазин (обладает работниками)
        // работник (обладает часами - (часы одни))
        // часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
        // Бренд (обладает массивом магазинов)
        // Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
        // у каждого работника по часам. У одного работника часы сломаны, у второго нет.
        // После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
        // обработать ошибку сломанных часов.
        // Ожидание вывода на экран:
        // Часы тикают
        // Ошибка: Часы сломались.

        Brand brand = new Brand(
                new Score[]{
                        new Score(
                                new Employee[]{
                                        new Employee(new Watch(false)),
                                        new Employee(new Watch(true))}),
                        new Score(
                                new Employee[]{
                                        new Employee(new Watch(false)),
                                        new Employee(new Watch(true))})});

        for (Score score :
                brand.getScores()) {
            for (Employee employee :
                    score.getEmployees()) {
                Watch watch = employee.getWatch();
                try {
                    watch.Tick();
                } catch (WatchBrokenError e){}
            }
        }
    }
}
