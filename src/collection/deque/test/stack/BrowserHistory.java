package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
	
	private Deque<String> stack = new ArrayDeque<>();
	private String currentPage = null;

	public void visitPage(String visit) {
		// 내 코드의 경우 방문 시 무조건 stack에 넣었는데
		// 아래의 코드는 현재 페이지는 stack에 넣지 않는다.
		/* 내 코드
		System.out.println("방문: " + visit);
		stack.push(visit);
		*/
		// null 체크도 해줘야
		if(currentPage != null) {
			stack.push(currentPage); //페이지 첫 방문 시 바로 넣지 않고 두 번째에 넣는다.
		}
		currentPage = visit;
		System.out.println("방문: " + visit);
	}

	public String goBack() {
		/* 내 코드
		stack.pop();
		currentPage = stack.peekFirst();
		System.out.println("뒤로가기: " + currentPage);
		return currentPage;
		*/
		if(!stack.isEmpty()) {
			currentPage = stack.pop();
			System.out.println("뒤로 가기: " + currentPage);
			return currentPage;
		}
		return null;
	}

}
