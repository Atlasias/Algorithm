package implementation;

import java.util.Scanner;

public class �ð� {

	public static boolean check(int h, int m, int s) {
		if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� N�� �Է��ϼ���>> ");
		int n = sc.nextInt();

		int result = 0;
		for (int h = 0; h <= n; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					if (check(h, m, s))
						result++;
				}
			}
		}

		System.out.println("3�� ���Ե� �ð��� ��: " + result);

	}

}
