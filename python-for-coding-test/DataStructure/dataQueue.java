package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class dataQueue {

	public static void main(String[] args) {
		// ť ����
		Queue<Integer> q = new LinkedList();
		
        // ����(5) - ����(2) - ����(3) - ����(7) - ����() - ����(1) - ����(4) - ����()
		q.offer(5);	// ����(5)
		q.offer(2); // ����(2)
		q.offer(3); // ����(3)
		q.offer(7); // ����(7)
		q.poll();	// ����()
		q.offer(1);	// ����(1)
		q.offer(4);	// ����(4)
		q.poll();	// ����()
		
		// ť ����: 4 - 1 - 7 - 3
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // Queue.poll()�� ť�� �� �� �ڷḦ ��ȯ�ϰ� ������
		}
	}

}
