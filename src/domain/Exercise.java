package domain;

import java.util.Arrays;

/**
 * ���������� ����� ������
 * 
 * @author olya_skrypnyk
 *
 */
public class Exercise {
	/**
	 * ���������� ���� ��� �������� ������� NxM
	 * 
	 * @param N - ������� �����
	 * @param M - ������� ��������
	 * @return ���� ��� �������� �������
	 */
	public static short Calculate(int N, int M) {

		byte[][] array = new byte[N][M];
		short sum = 0;

		System.out.println("�������:");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				array[i][j] = (byte) (Math.random() * 100);

			}
		}

		for (byte[] row : array) {
			System.out.println(Arrays.toString(row));
			for (byte i : row) {
				sum += i;
			}

		}
		return sum;
	}
}
