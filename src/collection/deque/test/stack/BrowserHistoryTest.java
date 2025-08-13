package collection.deque.test.stack;

public class BrowserHistoryTest {

	public static void main(String[] args) {
		BrowserHistory browser = new BrowserHistory();

		// 사용자가 웹페이지를 방문하는 시나리오
		browser.visitPage("youtube.com");
		browser.visitPage("google.com");
		browser.visitPage("facebook.com");
		// 세 번 방문시 두 개의 url만 Stack에 쌓여 있고,
		// facebook.com은 currentPage에 저장되어있다.

		// 뒤로 가기 기능을 사용하는 시나리오
		String currentPage1 = browser.goBack();
		System.out.println("currentPage1 = " + currentPage1);

		String currentPage2 = browser.goBack();
		System.out.println("currentPage2 = " + currentPage2);
	}

}
