package test;

import domain.Exercise;

/**
 * ��������� ���������� ����������
 * 
 * @author olya_skrypnyk
 *
 */
public class TestResult {
	/**
	 * ��������� ����� main
	 * 
	 * @param args �������� ������� ��������
	 */
	public static void main(String[] args) {
		int N = 6, M = 6;

		System.out.println("���� ��� �������� � �������: " + Exercise.Calculate(N, M));
	}
}
