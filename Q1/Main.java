import java.util.*;

public class Main {
    public static void main(String[] args){
        int command;
        AnimalShelter Humane = new AnimalShelter();
        Scanner input = new Scanner(System.in);
        
        if(args.length > 0){
            for(int i=0;i<args.length;i++){
                String[] temp = args[i].split(" ");
                if(args[i].charAt(0) == 'c'){ //args[i] is a cat
                    Humane.addAnimal(new Cat(temp[1]));
                }
                else{ //args[i] is a dog
                    Humane.addAnimal(new Dog(temp[1]));
                }
            }
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
        String[] inputAnimal = name.split(" ");
        
        if(command == 0){
            break;
        }
        switch(command){ //basic switch case for interactive command prompt
            case 1: 
                if(inputAnimal[1].equals("c")) {
                    Cat c = new Cat(inputAnimal[2]);
                    Humane.addAnimal(c);
                }
                else if(inputAnimal[1].equals("d")){
                    Dog d = new Dog(inputAnimal[2]);
                    Humane.addAnimal(d);
                } 
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
        //TESTING CODE FOR MANUAL ADD AND ADOPT
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

