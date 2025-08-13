package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
	
	private Queue<Task> tasks = new ArrayDeque<>();

	public void addTask(Task task) {
		if(task != null) {
			tasks.offer(task);
		}
	}

	public int getRemainingTasks() {
		return tasks.size();
	}

	public void processNextTask() {
		/*
		if(tasks.peek() != null) {
			Task task = tasks.poll();
			task.execute();
		}
		*/
		// 굳이 peek() 쓰지 않아도 된다.
		Task task = tasks.poll();
		if(task != null) {
			// 구현체인 new CompressionTask() 가 들어오게 되며
			// 오버라이딩 된 execute()가 실행된다!
			task.execute();
		}
	}
	
}
