import java.util.*;

public class Main {
    public static void main(String[] args){
        int command;
        AnimalShelter Humane = new AnimalShelter();
        Scanner input = new Scanner(System.in);
        //String input;
        if(args.length > 0){
            
        }
        
        while(true){
        String s = new StringBuilder() //creates the interative command prompt
           .append("1: Add new animal \n")
           .append("2: Adopt new animal \n")
           .append("3: Adopt a cat \n")
           .append("4: Adopt a dog\n")
           .append("5: Show anaimals in the shelther \n")
           .append("6: Show cats in the shelter \n")
           .append("7: Show dogs in the shelter \n")
           .append("0: Exit \n")
           .toString();
        System.out.println("Please Enter Command:\n" + s);
        
        command = input.nextInt();
        String name = input.nextLine();
        

        if(command == 0){
            break;
        }
        switch(command){
            case 1: Dog a = new Dog(name);
                    Humane.addAnimal(a);
                break;
            case 2: Humane.adopt();
                break;
            case 3: Humane.adoptCat();
                break;
            case 4: Humane.adoptDog();
                break;
            case 5: Humane.remaningAnimals();
                break;
            case 6: Humane.remaningCats();
                break;
            case 7: Humane.remaningDogs();
                break;    
        }
    }
    input.close();
        //Testing code
        // Dog Jeff = new Dog("Jeff");
        
        // Jeff.cry();

        // Cat Milo = new Cat("Milo");
        // Milo.cry();
        
        // Humane.addAnimal(Milo);
        // Humane.adoptCat();
        // Humane.addAnimal(Jeff);
        // Humane.adopt();
    }
}

