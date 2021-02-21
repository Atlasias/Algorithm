package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class �����_���_�Ա� {

	public static int[][] graph = new int[1000][1000];
	public static int result = 0;

	public static boolean dfs(int x, int y, int n, int m) {
		if (x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		if (graph[x][y] == 0) {
			graph[x][y] = 1;
			dfs(x - 1, y, n, m);
			dfs(x + 1, y, n, m);
			dfs(x, y - 1, n, m);
			dfs(x, y + 1, n, m);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� ���� N�� ���� ���� M�� �Է��ϼ���>> ");
		int n = sc.nextInt(), m = sc.nextInt();
		sc.nextLine();
		
		System.out.println("���� Ʋ�� ���¸� �Է��ϼ���>> ");
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dfs(i, j, n, m)) {
					result++;
				}
			}
		}

		System.out.println("���� �� �ִ� ���̽�ũ���� ����: " + result);
	}

}
