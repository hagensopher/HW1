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
    //Node<T> node;
    Iterable<T> node; //take this using the for each loop to do the work
    public ShapeList(){} //make an empty list
    public ShapeList(Iterable<T> input){
        node = input;
        
        
    } //make a list of iterables 
    
    @Override
    public Iterator<T> iterator(){ //I wanna use this iterator to call the node iterator to call the NODEiterator class  // How does this work 
                                   
       return node.iterator();
    }

    public ShapeList<T> reverse(){ //reverse all the list in a linked list
        ShapeList<T> reverse = new ShapeList<T>(node);
        
        Iterable<T> prev = null;
        Iterable<T> next = null;
        while(reverse.iterator().hasNext()){
            next = reverse.node; //set next to currents next
            reverse.node = prev; //set currents next to prev (null for head)
            prev = reverse.node; //set prev to current
            reverse.node = next; //move current up
        }
        return reverse;
    } 
    
     public String toString(){
        return "Hello";
    }
}

class NodeIterator<T extends Shape> implements Iterator<T>{
    Node<T> currentNode;
    NodeIterator(Node<T> n){ this.currentNode = n;}

    public boolean hasNext(){
        return currentNode != null;
    }

    public T next() { //is this suppseod to be type Node<T> and not <T>
        
        if(!hasNext()){
            throw new NoSuchElementException();
        }
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
