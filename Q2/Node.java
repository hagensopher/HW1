import java.util.*;
public final class Node<T extends Shape>  {
    
    public final T v;
    public Node<T> next;
    public Node (T val,Node<T> link){ v =val; next = link;}
}
class List<T> {
    LinkedList<T> list = new LinkedList<T>();
}
class NodeIterator<T> implements Iterator<T>{
    Node<T> currentNode;
    NodeIterator(Node<T> n){}

    public boolean hasNext(){
        return currentNode != null;
    }

    public T next() {
        T val = currentNode.v;
        currentNode = currentNode.next;
    }
    
    // for (T e : list){
    //     System.out.println(e);
    // }
}
