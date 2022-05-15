public class List<T> {
    protected Node<T> root;

    //constructores
    public List(T data){
        Node<T> newRoot = mew Node<T>(data);
        this.root = newRoot; 
    }
    public List(){
        this.root = null;
    }


}
