package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ū_����_��Ģ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("N, M, K�� �Է����ּ���>> ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();

		int[] arr = new int[n];
		System.out.printf("N���� �ڿ����� �Է����ּ���>> ");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		// ����
		Arrays.sort(arr);
		int first = arr[n - 1];
		int second = arr[n - 2];

		int rpt = first * 3 + second;

		int result = 0;
		result += rpt * m / (k + 1);
		result += first * m % (k + 1);
		System.out.println("ū ���� ��Ģ�� ���� ���: " + result);
	}

}
