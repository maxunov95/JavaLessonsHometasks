import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Homework2 {
    public static void main(String[] args) {

        // Домашка
        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а

        for (int i = 1; i <= 100; i++) {
            System.out.print(" " + i + "a");
        }

        // Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        System.out.println();

        if (ageChildren <= 6) {
            System.out.println("пошел в сад");
        } else if (ageChildren <= 11) {
            System.out.println("пошел в младшую школу");
        } else if (ageChildren <= 17) {
            System.out.println("пошел в среднюю школу");
        } else {
            System.out.println("пошел в университет");
        }

        // Задание №3
        // Дано:
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken && vegetables && sour && toast) {
            System.out.println("Цезарь");
        } else if ((chicken || sausage) && vegetables && eggs) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощной салат");
        } else {
            System.out.println("У меня ничего нет");
        }
        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.

        Monkey monkey = new Monkey(30, 90);
        Giraffe giraffe = new Giraffe(120, 280);

        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        int iteration = 0;
        while (result <= 1_000_000) {
            result += increment;
            iteration++;
            if (result < 0){
                break;
            }
        }
        if (result > 0) {
            System.out.println(iteration);
        }

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".

        int [] arr = new int[] {1,2,2,1,6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

        double totalCost = 0;
        double discount = 0;
        int totalBrokenParts = 0;

        boolean hasProblems = hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem;

        if (!hasFuel && !hasProblems) {
            totalCost = totalCost + 1000;
        } else if (hasProblems) {

            if (hasMotorProblem) {
                totalBrokenParts++;
                totalCost = totalCost + 10000;
            }

            if (hasElectricsProblem) {
                totalBrokenParts++;
                totalCost = totalCost + 5000;
            }

            if (hasTransmissionProblem) {
                totalBrokenParts++;
                totalCost = totalCost + 4000;
            }

            if (hasWheelsProblem) {
                totalBrokenParts++;
                totalCost = totalCost + 2000;
            }

            if (totalBrokenParts == 2) {
                discount = 0.10;
                if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                    discount = 0.20;
                }
            }
        }

        totalCost = totalCost - totalCost * discount;
        System.out.println("Итого: " + totalCost);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

        Worker w1 = new Worker("001");
        Worker w2 = new Worker("002");
        Worker w3 = new Worker("003");

        Warehouse warehouse = new Warehouse(3);

        w1.getGood(warehouse);
        w1.getGood(warehouse);
        w2.getGood(warehouse);
        w3.getGood(warehouse);

        // Экспертный уровень:
        // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
        // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
        // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
        // К474СЕ178 - где 178 регион

        // Задача №1: узнать сколько всего машин со спец номерами: начинаются на M и заканчиваются на АВ.
        // Не повторяющиеся

        //Входящие данные
        // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
        // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
        // { 1 : {
        //      "out" : ["К474СЕ178"],
        //      "input": ["А222РТ178"]
        //    },
        //   2 : {
        //        "out" : ["К722АВ12", "А222РТ178"],
        //        "input" : ["М001АВ01", "А023РВ73"],
        //   }
        // ..
        //  }

        //Список технологий:
        // Set (HashSet) - узнать что это, set.contains(), set.put()
        // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
        // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
        // Регулярные выражения - вытащить регион авто

        HashMap<Integer, HashMap<String, String[]>> incomingData = new HashMap();

        HashMap<String, String[]> data1 = new HashMap();
        data1.put("out", new String[]{"К474СЕ178", "М231АВ301"});
        data1.put("input", new String[]{"А222РТ178", "М519АВ12"});

        HashMap<String, String[]> data2 = new HashMap();
        data2.put("out", new String[]{"К722АВ12", "А222РТ178"});
        data2.put("input", new String[]{"М001АВ01", "А023РВ73"});

        incomingData.put(1, data1);
        incomingData.put(2, data2);

        HashSet specialNumbers = new HashSet<String>();

        incomingData.forEach((integer, stringHashMap) -> {
            stringHashMap.forEach((s, strings) -> {
                for (String number : strings) {
                    if (number.matches("М\\d{3}АВ\\d{2,3}")) {
                        specialNumbers.add(number);
                    }
                }
            });
        });

        System.out.println("Машин со спец. номерами: " + specialNumbers.size());
    }

    static class Monkey {
        int weight;
        int height;

        public Monkey(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    static class Giraffe {

        int weight;
        int height;

        public Giraffe(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    static class Warehouse {

        int rest;

        public Warehouse(int rest) {
            this.rest = rest;
        }

        public int getRest() {
            return rest;
        }

        public void setRest(int rest) {
            this.rest = rest;
        }
    }

    static class Worker {

        String id;
        int damagedGoods;

        public Worker(String id) {
            this.id = id;
            this.damagedGoods = 0;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getDamagedGoods() {
            return damagedGoods;
        }

        public void setDamagedGoods(int damagedGoods) {
            this.damagedGoods = damagedGoods;
        }

        public void getGood(Warehouse warehouse) {
            if (warehouse.getRest() > 0) {
                damagedGoods++;
                warehouse.rest--;
                System.out.println("Ура я испортил водку!");
            }
        }
    }
}
