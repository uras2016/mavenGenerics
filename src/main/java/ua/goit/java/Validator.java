package ua.goit.java;

public interface Validator <T> {

    // Валидирует переданое значение
    boolean isValid(T result);

}
