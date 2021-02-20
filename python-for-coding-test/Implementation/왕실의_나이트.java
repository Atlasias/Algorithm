package implementation;

import java.util.Scanner;

public class �ս���_����Ʈ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("����Ʈ�� ��ǥ�� �Է��ϼ���>> ");
		String input = sc.nextLine();

		int row = input.charAt(1) - '0';
		int col = input.charAt(0) - 'a' + 1;

		int[] drow = { -2, -2, -1, -1, 1, 1, 2, 2 };
		int[] dcol = { -1, 1, -2, 2, -2, 2, -1, 1 };

		int[] trow = new int[8];
		int[] tcol = new int[8];

		int result = 0;

		for (int i = 0; i < 8; i++) {
			trow[i] = row + drow[i];
			tcol[i] = col + dcol[i];
			if (trow[i] >= 1 && trow[i] <= 8 && tcol[i] >= 1 && tcol[i] <= 8)
				result++;
		}

		System.out.println("����Ʈ�� �̵��� �� �ִ� ����� ��: " + result);

	}

}
