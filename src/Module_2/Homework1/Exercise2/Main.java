package Module_2.Homework1.Exercise2;

public class Main {
    //Задача №2
    //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
    //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
    //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
    //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
    //2.Скопировать со старого массива все значения в новый
    //3.Присвоить экземпляру MyList новый массив.

    public static void main(String[] args) {

        Object simpleObject = new Object() {
            @Override
            public String toString() {
                return "simple object";
            }
        };

        MyList<Object> objectMyList = new MyList<Object>(Object.class);
        objectMyList.add(simpleObject);
        objectMyList.add(simpleObject);
        objectMyList.add(simpleObject);

        System.out.println(objectMyList);
        System.out.println(objectMyList.size());

        objectMyList.add(simpleObject);

        System.out.println(objectMyList);
        System.out.println(objectMyList.size());
    }
}
