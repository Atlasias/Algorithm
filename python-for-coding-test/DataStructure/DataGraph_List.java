package dataStructure;

import java.util.ArrayList;

/**
 * ����Ʈ ����� ��� ��ĺ��� �޸𸮴� ���� ������ �ӵ��� ����.
 * 
 * �ڽŰ� ����� ����� ������ ������ �����Ƿ� ��� ���� ��带 ��ȸ�ؾ� �ϴ� ��� ��� ��ĺ��� �޸𸮸� �� �����.
 * 
 * @author Hwisaek
 *
 */

class Node { // ��� Ŭ����

	private int index;
	private int distance;

	public Node(int index, int distance) { // ������
		this.index = index;
		this.distance = distance;
	}

	public void show() {
		System.out.printf("(" + this.index + "," + this.distance + ") ");
	}
}

public class DataGraph_List {

	// ArrayList<Node>�� �����ͷ� ������ ArrayList ����
	// ArrayList ������ ArrayList �� Node�� �̷��������.
	// �� ��忡�� ����� ������ ����� ����Ǿ� ����.
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			graph.add(new ArrayList<Node>()); // �׷����� ��� 1, 2, 3 �߰�
		}

		graph.get(0).add(new Node(1, 7)); // ��� 0 �� ��� 7�� ��� 1 �߰�
		graph.get(0).add(new Node(2, 5)); // ��� 0 �� ��� 5�� ��� 2 �߰�

		graph.get(1).add(new Node(0, 7)); // ��� 1 �� ��� 7�� ��� 0 �߰�

		graph.get(2).add(new Node(0, 5)); // ��� 2 �� ��� 5�� ��� 0 �߰�

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < graph.get(i).size(); j++) {
				graph.get(i).get(j).show();
			}
			System.out.println();
		}
	}

}
