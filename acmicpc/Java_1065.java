package acmicpc;

import java.util.Scanner;

public class Java_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[] chk = new boolean[1001];

		int d = 0; // ����
		int result = 0;

		for (int i = 1; i <= n; i++) {// 1���� 1000���� �ݺ�
			if (i <= 99) {// 1~99������ �Ѽ��̹Ƿ� �ѱ�
				chk[i] = true;
				result++;
				continue;
			}
			int number = i;
			d = number / 10 % 10 - number % 10;
			number = number / 10;
			while (number >= 10) {// ���ڸ����� �� �� ���� �ݺ�
				if (d == number / 10 % 10 - number % 10) {
					chk[i] = true;
					number = number / 10;
					continue;
				} else {
					chk[i] = false;
					break;
				}
			}
			if (chk[i])
				result++;
		}

		System.out.println(result);
	}

}
