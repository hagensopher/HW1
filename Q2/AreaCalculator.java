//package Q2;

class AreaCalculator{

    static double calculate(Shape shapes[]){
        double total =0;
        for(int i =0;i<shapes.length;i++){
            total = total + shapes[i].Area();
        }
        return total;
    }
}