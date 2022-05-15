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

    //metodos set y get
    public Node<T> getRoot(){
        return this.root;
    }
    public void setRoot(Node<T> root){
        this.root = root;
    }

    //imprimir
    public String toString(){
        String strList = "Contenido: \n";
        Node<T>  nodoActual = root;
        while(){
            strList += nodoActual.toString() + " \n";
            nodoActual = nodoActual.getNextNode();
        }
        return strList; 
    }
    

}
