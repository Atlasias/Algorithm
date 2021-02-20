package implementation;

import java.util.Scanner;

public class ����_���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("���� ũ��(N*M)�� �Է��ϼ���>> ");
		int n = sc.nextInt(), m = sc.nextInt();

		System.out.printf("ĳ������ ��ǥ�� ����(0: ��, 1: ��, 2: ��, 3: ��)�� �Է��ϼ���>> ");
		int x = sc.nextInt(), y = sc.nextInt(), d = sc.nextInt();

		System.out.println("���� ������ �Է��ϼ���>> ");
		int[][] map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int turn = 0; // ȸ�� Ƚ��
		int result = 0; // �̵� Ƚ��
		int stop = 0; // ������ ��ư
		while (stop == 0) { // ĳ���� �̵� ����
			if (d > 0)
				d--;
			else
				d = 3;
			turn++;

			if (turn == 4) {
				switch (d) {
				case 0:
					if (map[x+1][y] == 0) {
						map[x][y]=1;
						x++;}
					else
						stop = 1;
					break;
				case 1:
					if (map[x][y-1] == 0) {
						map[x][y]=1;
						y--;}
					else
						stop = 1;
					break;
				case 2:
					if (map[x-1][y] == 0) {
						map[x][y]=1;
						x--;}
					else
						stop = 1;
					break;
				case 3:
					if (map[x][y+1] == 0) {
						map[x][y]=1;
						y++;}
					else
						stop = 1;
					break;
				}
			} else {
				switch (d) {
				case 0:
					if (map[x-1][y] == 0) {
						map[x][y]=1;
								x--;
						turn = 0;
						result++;
					}
					break;
				case 1:
					if (map[x][y+1] == 0) {
						map[x][y]=1;
								y++;
						turn = 0;
						result++;
					}
					break;
				case 2:
					if (map[x+1][y] == 0) {
						map[x][y]=1;
								x++;
						turn = 0;
						result++;
					}
					break;
				case 3:
					if (map[x][y-1] == 0) {
						map[x][y]=1;
								y--;
						turn = 0;
						result++;
					}
					break;
				}
			}
		}
		System.out.println("�̵� Ƚ��: " + result);
	}

}
