package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

import java.util.Random;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    private
    int m_size;
    public RandomInitializer(int size){
        m_size = size;
    }
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < m_size; i++) {
            array[i] = rand.nextInt(100) - 50;
        }
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
    }
}
