package Module_1.Homework4.Advance1;

public class HomeworkAdvance1 {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести

        Spruce spruce = new Spruce();
        Pine pine = new Pine();
        Rose rose = new Rose();
        Fern fern = new Fern();

        Object[] arrSmellable = new Object[]{spruce, pine, rose};
        Object[] arrBloomable = new Object[]{rose, fern};

        for (Object object:
                arrSmellable) {
            System.out.print(object.getClass().getSimpleName() + ": ");
            ((Smellable) object).Smell();
        }

        for (Object object:
                arrBloomable) {
            System.out.print(object.getClass().getSimpleName() + ": ");
            ((Bloomable) object).Bloom();
        }
    }
}
