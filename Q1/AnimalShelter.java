import java.util.*;

public class AnimalShelter {
    
    
    ArrayList<Animal> animals = new ArrayList<Animal>();
    public void addAnimal(Animal a){
        animals.add(a);
    }

    public void adopt(){
        System.out.println("You adopted "+animals.get(0).getName());
        animals.remove(0);
    }

    public void adoptCat(){
        for(int i =0;i<animals.size();i++){
            if(animals.get(i) instanceof Cat){
                System.out.println("You adopted "+animals.get(i).getName());
                animals.remove(i);
                break;
            }
        }

    }
    
    public void adoptDog(){
        for(int i =0;i<animals.size();i++){
            if(animals.get(i) instanceof Dog){
                System.out.println("You adopted "+animals.get(i).getName());
                animals.remove(i);
                break;
            }
        }
    }

    public void remaningAnimals(){
       //for loop of going through each animal in the order
       for(int i =0;i<animals.size();i++){     
            System.out.println("You adopted "+animals.get(i).getName());
            System.out.println("Order:"+ i);
        }
    }

    public void remaningDogs(){
        //for loop of going through each animal in the order
        for(int i =0;i<animals.size();i++){
            if(animals.get(i) instanceof Dog){
                System.out.println("You adopted "+animals.get(i).getName());
                System.out.println("Order:"+ i);
            }
        }
    }

    public void remaningCats(){
        //for loop of going through each animal in the order
        for(int i =0;i<animals.size();i++){
            if(animals.get(i) instanceof Cat){
                System.out.println("You adopted "+animals.get(i).getName());
                System.out.println("Order:"+ i);
                
            }
        }
    }
}
