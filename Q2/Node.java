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
    Node<T> node = new Node<T>(null,null); // a refrence to the head
    Node<T> prev = new Node<T>(null,null); // the previous node for linking the list
    //Iterable<T> node; //take this using the for each loop to do the work
    //
    public ShapeList(){} //make an empty list
    public ShapeList(Iterable<T> input){
        //call codes in each for loop - done
        //makes a new node - done
        //connects the node -done
        int count =0;
        
        for (T e: input){
            //System.out.println("AHHHHH");
            if(count ==0){
                Node<T> temp = new Node<T>(e,null);
                prev = temp; //the previoues node for linking
                node = temp; //a refrence to the head pointer
                //System.out.println("The current node is :"+temp);
                count++;
                continue;
            }
            //System.out.println("The orginal node is" + prev); //currently point till node
                //System.out.println(e);
                Node<T> current = new Node<T>(e,null);
               // System.out.println("The current node is :"+current);
                prev.next = current;
                //System.out.println("The prev node next is : "+prev.next);
                prev = current; 
                count++; 
               
        }
    
    } //make a list of iterables 
    
    @Override
    public Iterator<T> iterator(){ //I wanna use this iterator to call the node iterator to call the NODEiterator class  // How does this work 
                                   
       return node.iterator(); //
    }

    public ShapeList<T> reverse(){ //reverse all the list in a linked list
        //ShapeList<T> reverse = new ShapeList<T>(node);
        
        //make a stack.
        Stack<T> stack = new Stack<T>();
        Stack<T> reversestack = new Stack<T>();
        for(T e: node){ //inside of node is a shape
            stack.push(e); //this pushes a shape from the node list
            //System.out.println(e);
        } 
        while(!stack.isEmpty()){
            reversestack.push(stack.pop());
        }
            
            //System.out.println(e);
        
        ShapeList<T> reverse = new ShapeList<T>(reversestack);
        
        return reverse;
    } 
    
     public String toString(){
        String total = "[";
        if(node.v ==null){
            total = "[]";
        }
        else{
            for( T e : node){
            
                total = total +"{"+ e +"},";
            }
            total = total + "]";
        }
        
        return total;
    }
}

class NodeIterator<T extends Shape> implements Iterator<T>{
    Node<T> currentNode;
    NodeIterator(Node<T> n){ this.currentNode = n;}

    public boolean hasNext(){
        return currentNode != null; //IT IS CURRENTNODE NOT THE NEXT NO WONDER IT NEVER STOPPED
    }

    public T next() { //is this suppseod to be type Node<T> and not <T>
        
        if(!hasNext()){ //if next node is null
            throw new NoSuchElementException();
        }
        T val = currentNode.v;
        currentNode = currentNode.next;
        
        //System.out.println("out");
        return val;
        
    }

    public void printList(){
        for (T e : currentNode){
         System.out.println(e);
     }
    }
    
}
