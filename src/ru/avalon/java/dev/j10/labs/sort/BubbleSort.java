package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Пузырьковая сортировка (англ. bubble sort).
 *
 * <p>Простой алгоритм сортировки. Для понимания и
 * реализации этот алгоритм — простейший, но эффективен он
 * лишь для небольших массивов. Сложность алгоритма: O(n^2).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC">Пузырьковая сортировка</a>
 */
public class BubbleSort implements Sort {
    private
    int m_size;
    public BubbleSort(int size) {
        m_size = size;
    }

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса BubbleSort
         */
        int max_unsorted_index = m_size;
        for (int iter = 0; iter < max_unsorted_index; iter++) {
            int swaps = 0; // кол-во перестановок за проход
            // перебор индексов массива
            for (int i = 0; i < max_unsorted_index; i++) {
                if (i+1 != m_size) { // индекс следующего элемента не выходит за пределы массива
                    // меняем местами, если соседние элементы в неверном порядке
                    if (array[i] > array[i+1]) {
                        int temp = array[i]; // сохраняем значение во временную переменную
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        swaps++;
                    }
                }
            }
            if (swaps == 0) {
                break; // если не было перестановок, значит всё отсортировано
            }
            // последний элемент при полном проходе всегда будет максимальным
            max_unsorted_index--;
        }
    }
}
