package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ����_ī��_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("N, M �Է�>> ");
		int n = scan.nextInt();
		int m = scan.nextInt();

		int max = 0;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scan.nextInt();
			}
			Arrays.sort(arr[i]);
			if (arr[i][0] > max)
				max = arr[i][0];
		}

		System.out.println("�� ���� �ּҰ��� �ִ밪: " + max);
	}

}
