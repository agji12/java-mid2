package collection.link;

public class MyLinkedListV1 {

	private Node first;
	private int size = 0;
	
	public void add(Object e) {
		Node newNode = new Node(e);
		if(first == null) {
			first = newNode;
		}else {
			Node lastNode = getLastNode();
			lastNode.next = newNode;
		}
		size++;
	}

	private Node getLastNode() {
		Node x = first;
		while(x.next != null) {
			x = x.next;
		}
		return x;
	}
	
	//인덱스 노드에 있는 값 변경
	public Object set(int index, Object element) {
		Node x = getNode(index);
		Object oldValue = x.item;
		x.item = element;
		return oldValue;
	}
	
	//인덱스 노드에 있는 값 가져오기
	public Object get(int index) {
		Node node = getNode(index);
		return node.item;
	}

	private Node getNode(int index) {
		Node x= first;
		for(int i = 0;i < index;i++) {
			x = x.next;
		}
		return x;
	}
	
	//데이터를 검색하고 검색된 위치를 반환
	public int indexOf(Object o) {
		int index = 0;
		for(Node x = first;x != null;x = x.next) { //x가 null이 아닐 때까지 for문 돌림
			if(o.equals(x.item)) {
				return index;
			}
			index++;
		}
		return -1;
	}
	
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "MyLinkedListV1 [first=" + first + ", size=" + size + "]";
	}
	
}
