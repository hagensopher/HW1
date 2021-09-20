//package Q2;



public class Main{

    public static void main(String[] args){
        Shape shape[] = new Shape[args.length];
        
        
        
        System.out.printf("The total area for the %d objects is 1.2%f units squared. \n",shape.length, AreaCalculator.calculate(shape));
    }
}