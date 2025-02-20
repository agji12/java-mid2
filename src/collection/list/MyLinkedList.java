package collection.list;

public class MyLinkedList<E> implements MyList<E> {

	private Node<E> first;
	private int size = 0;
	
	@Override
	public void add(E e) {
		Node<E> newNode = new Node<>(e); //타입추론으로 new Node<E>에서 E 생략
		if(first == null) {
			first = newNode;
		}else {
			Node<E> lastNode = getLastNode();
			lastNode.next = newNode;
		}
		size++;
	}

	private Node<E> getLastNode() {
		Node<E> x = first;
		while(x.next != null) {
			x = x.next;
		}
		return x;
	}
	
	//추가 코드
	@Override
	public void add(int index, E e) {
		Node<E> newNode = new Node<>(e);
		if(index == 0) {
			newNode.next = first;
			first = newNode;
		}else {
			Node<E> prev = getNode(index - 1);
			newNode.next = prev.next;
			prev.next = newNode;
		}
		size++;
	}
	
	//인덱스 노드에 있는 값 변경
	@Override
	public E set(int index, E element) {
		Node<E> x = getNode(index);
		E oldValue = x.item;
		x.item = element;
		return oldValue;
	}
	
	//추가 코드
	@Override
	public E remove(int index) {
		Node<E> removeNode = getNode(index);
		E removedItem = removeNode.item;
		if(index == 0) {
			first = removeNode.next;
		}else {
			Node<E> prev = getNode(index - 1);
			prev.next = removeNode.next;
		}
		removeNode.item = null;
		removeNode.next = null;
		size--;
		return removedItem;
	}
	
	//인덱스 노드에 있는 값 가져오기
	@Override
	public E get(int index) {
		Node<E> node = getNode(index);
		return node.item;
	}

	private Node<E> getNode(int index) {
		Node<E> x= first;
		for(int i = 0;i < index;i++) {
			x = x.next;
		}
		return x;
	}
	
	//데이터를 검색하고 검색된 위치를 반환
	@Override
	public int indexOf(E o) {
		int index = 0;
		for(Node<E> x = first;x != null;x = x.next) { //x가 null이 아닐 때까지 for문 돌림
			if(o.equals(x.item)) {
				return index;
			}
			index++;
		}
		return -1;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "MyLinkedListV1 [first=" + first + ", size=" + size + "]";
	}
	
	private static class Node<E>{
		
		E item;
		Node<E> next;
		
		public Node(E item) {
			this.item = item;
		}
		
		//[A->B->C]
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Node<E> x = this;
			sb.append("[");
			while(x != null) {
				sb.append(x.item);
				if(x.next != null) {
					sb.append("->");
				}
				x = x.next;
			}
			sb.append("]");
			return sb.toString(); //StringBuilder를 String으로
		}
		
	}
	
}
