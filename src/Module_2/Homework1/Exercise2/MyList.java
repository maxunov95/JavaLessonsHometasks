package Module_2.Homework1.Exercise2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList <T extends Object> {

    private final int DEFAULT_LENGTH = 3;

    private T[] objects;
    private int size;
    private Class<T> classT;

    public MyList(Class<T> classT) {
        this.classT = classT;
        this.objects = (T[]) Array.newInstance(classT, DEFAULT_LENGTH);
        this.size = 0;
    }

    public void add(T newObject) {
        if (this.size == this.objects.length) {
            T[] objects = (T[]) Array.newInstance(this.classT, this.objects.length * 2);
            for (int i = 0; i < this.objects.length; i++) {
                objects[i] = this.objects[i];
            }
            this.objects = objects;
        }
        this.objects[this.size] = newObject;
        this.size++;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.objects);
    }
}
