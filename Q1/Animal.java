

abstract class Animal {
    String name;
    int order;
    // Animal(String c, int o){
    //     color = c;
    //     order = o;
    // }

    public String getName(){
        return name;
    }

    public int getOrder(){
        return 0;
    }
    public void cry(){
        System.out.println("Animal Makes sound");
    }
}


class Dog extends Animal {
    public Dog(String n){
        name = n;
        order++;
    }
    public void cry(){
        System.out.println("Bark");
    }

}

class Cat extends Animal {
    public Cat(String n){
        name = n;
        order++;
    }
    public void cry(){
        System.out.println("Meow");
    }

}