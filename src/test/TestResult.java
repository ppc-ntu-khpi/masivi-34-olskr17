package test;

import domain.Exercise;

/**
 * Виведення результатів обчислення
 * 
 * @author olya_skrypnyk
 *
 */
public class TestResult {
	/**
	 * Статичний метод main
	 * 
	 * @param args параметр запуску програми
	 */
	public static void main(String[] args) {
		int N = 6, M = 6;

		System.out.println("Сума всіх елементів в матриці: " + Exercise.Calculate(N, M));
	}
}
