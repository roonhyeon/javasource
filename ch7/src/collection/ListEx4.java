package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ListEx4 {

	public static void main(String[] args) {
		
		Stack<String> stack=new Stack<>();
		Queue<String>queue=new LinkedList<>(); //Queue는 인터페이스이므로 인스턴스 생성이 불가능하기 때문에 LinkedList와 연결해주었다.
		
		//스택에 삽입
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		//큐 삽입
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		
		System.out.println("===========Stack==========="); //원리에 따라 제일 나중에 추가해준 3부터 출력
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("===========Queue==========="); //차례대로 출력
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
