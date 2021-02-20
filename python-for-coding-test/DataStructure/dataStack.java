package dataStructure;

import java.util.Stack;

public class DataStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>(); // Stack ����

		s.push(5);	// ����(5)
		s.push(2);	// ����(2)
		s.push(2);	// ����(2)
		s.push(7);	// ����(7)
		s.pop();	// ����()
		s.push(1);	// ����(1)
		s.push(4);	// ����(4)
		s.pop();	// ����()

		// ��� ���� ���� :
		// 1
		// 2
		// 2
		// 5
		while (!s.empty()) { // Stack.empty(): ������ ����ִ����� ��ȯ
			System.out.println(s.peek()); // Stack.peek(): ������ �� �� �� ��ȯ
			s.pop();
		}
	}

}
