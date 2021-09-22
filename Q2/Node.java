import java.util.*;
public final class Node<T extends Shape> implements Iterable<T> {
    @Override
    public Iterator<T> iterator(){
        return new NodeIterator<T>(this);
    }
    
    public final T v;
    public Node<T> next;
    public Node (T val,Node<T> link){ v =val; next = link;}
    
} 


class ShapeList<T extends Shape> implements Iterable<T> {
    Node<T> node;

    public ShapeList(){} //make an empty list
    public ShapeList(Iterable<T> input){
        
        for( T e : input){
            Node<T> prev = new Node<T>(e, null); //how do i know hwat next is
            this.node.v =e;
            this.node.next = input.iterator().next();
            System.out.println(e);
            
            
        }
    } //make a list of iterables 
    
    @Override
    public Iterator<T> iterator(){ //I wanna use this iterator to call the node iterator to call the NODEiterator class  // How does this work 
                                   
       return node.iterator();
    }

    //  public ShapeList<T> reverse(){ //reverse all the list in a linked list
    //     ShapeList<T> reverse = new ShapeList<T>();
    //     Node<T> prev = null;
    //     T next = null;
    //     while(node.iterator().hasNext()){
    //         next = reverse.iterator().next();
    //         node.next = prev;
    //         prev = node;
    //         node = next;
    //     }
    //     return 
    // } 

    //  public String toString(){

    // }
}



class NodeIterator<T extends Shape> implements Iterator<T>{
    Node<T> currentNode;
    NodeIterator(Node<T> n){ this.currentNode = n;}

    public boolean hasNext(){
        return currentNode != null;
    }

    public T next() { //is this suppseod to be type Node<T> and not <T>
        T val = currentNode.v;
        currentNode = currentNode.next;
        System.out.println("out");
        return val;
    }

    public void printList(){
        for (T e : currentNode){
         System.out.println(e);
     }
    }
    
}
