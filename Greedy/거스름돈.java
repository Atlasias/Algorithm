package Greedy;

import java.util.Scanner;

public class �Ž����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("�Ž������� �Է����ּ���>> ");
		int n = scan.nextInt();

		int[] coins = { 500, 100, 50, 10 };
		int cnt = 0;

		for (int coin : coins) {
			cnt += n / coin;
			n = n % coin;
		}
		System.out.println("�Ž������ �� ������ �ּ� ����: " + cnt);
	}

}
