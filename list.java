public class List<T> {
    protected Node<T> root;

    //constructores
    public List(T data){
        Node<T> newRoot = new Node<T>(data);
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
        while(nodoActual != null){
            strList += nodoActual.toString() + " \n";
            nodoActual = nodoActual.getNextNode();
        }
        return strList; 
    }

    //insertar nodo alfrente
    public void insertFront(T data){
        if(this.root == null){
            this.root = new Node<T>(data);
        }else{
            Node<T> newNode = new Node<T>(data);
            newNode.setNextNode(root);
            this.root = newNode; 
        }
    }

    //insertar nodo por detras
    public void insertBack(T data){
        if(this.root == null){
            this.root = new Node<T>(data);            
        } else{
            Node<T> newNode = new Node<T>(data);
            Node<T> nodoActual = root;
            while(nodoActual.getNextNode() != null){
                nodoActual=nodoActual.getNextNode();
            }
            nodoActual.setNextNode(newNode);
        }

    }

    //Main
    public static void main (String[] args){
        List<Double> li = new List<Double>(143.3);
        li.insertBack(13.3);
        li.insertBack(54.8);
        System.out.println(li.toString());
    }
}
