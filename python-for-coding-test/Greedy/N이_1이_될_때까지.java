package Greedy;

import java.util.Scanner;

public class N��_1��_��_������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("N, K�� �Է��ϼ���>> ");

		int n = sc.nextInt();
		int k = sc.nextInt();

		int cnt = 0;

		while (n != 1) {
			if (n % k == 0)
				n /= k;
			else
				n -= 1;
			cnt++;
		}

		System.out.println("N�� 1�� ����� �ּ� Ƚ��: " + cnt);
	}

}
