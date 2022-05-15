public class Node <T{
    private T data;
	private Node<T> nextNode;

    // Metodos constructores
	
	public Node(T data, Node<T> nextNode){
		this.data = data;
		this.nextNode = nextNode;
	}
	public Node(T data){
		this(data, null);
	}
	public Node(){
		this(null, null);
	}

    // Metodos setter y getter
	public T getData() {
		return this.data;
	}
	public void setData(T data){
		this.data = data;
	}
	public Node<T> getNextNode(){
		return this.nextNode;
	}
	public void setNextNode(Node<T> nextNode){
		this.nextNode = nextNode;
	}
}
