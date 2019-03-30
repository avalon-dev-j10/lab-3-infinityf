package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;

public class Main {

	public static void sum(int[] array, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + array[i];
			System.out.print(array[i] + ", ");
		}
		System.out.println("\n Sum: " + sum);
	}

    public static void main(String[] args) {
    	/* 0. Создать массив из 20 целых чисел и адресовать
		 *    его с сохранить ссылку в переменную array.*/
		final int size = 20; // < константа
		int[] array = new int[size]; // < важно вызвать new до передачи в метод

		/* 1. Проинициализировать массив значениями
		 *    последовательности чисел Фибоначчи.*/
		System.out.println("Fibo Initializator");
		FibonacciInitializer fib = new FibonacciInitializer(size);
		fib.initialize(array);

		/* 2. Найти сумму элементов массива.*/
		sum(array, size);

		/* 3. Проинициализировать массив последовательностью
		 *    случайных чисел в диапазоне от -50 до 50.*/
		RandomInitializer rand = new RandomInitializer(size);
		rand.initialize(array);
		sum(array, size);

		/* 4. Отсортировать массив с использованием
		 *    пузырьковой сортировки.*/
		BubbleSort bubbleSort = new BubbleSort(size);
		bubbleSort.sort(array);
		sum(array, size);

		/*
	     *

	     *

	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
	}
}
