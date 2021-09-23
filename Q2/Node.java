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
    //Iterable<T> node; //take this using the for each loop to do the work
    //
    public ShapeList(){} //make an empty list
    public ShapeList(Iterable<T> input){
        //call codes in each for loop
        //makes a new node
        //connects the node
        
        
    } //make a list of iterables 
    
    @Override
    public Iterator<T> iterator(){ //I wanna use this iterator to call the node iterator to call the NODEiterator class  // How does this work 
                                   
       return node.iterator();
    }

    public ShapeList<T> reverse(){ //reverse all the list in a linked list
        ShapeList<T> reverse = new ShapeList<T>(node);
        
        //make a stack.
        Stack<T> stack = new Stack<>();
        for(T e: node){
            stack.push(e);
        } 
        for(T e : stack){
            T thing = stack.pop();
            reverse = ;
        }
        return reverse;
    } 
    
     public String toString(){
        String total = "{[";
        if(node == null){
            return "[]";
        }
        for( T e : node){
            
            total = total + e;
        }
        return total;
    }
}

class NodeIterator<T extends Shape> implements Iterator<T>{
    Node<T> currentNode;
    NodeIterator(Node<T> n){ this.currentNode = n;}

    public boolean hasNext(){
        return currentNode.next != null;
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
