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
}
