package Homework4.Advance1;

public interface Smellable {
    default void Smell() {
        System.out.println("пахну");
    };
}
