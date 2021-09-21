//package Q2;



public class Main{

    public static void main(String[] args){
        Shape shape[] = new Shape[args.length];
        if(args.length < 1){
            System.out.println("Please Enter some shapes");
            System.exit(0);
        }
        // for(int i =0;i<args.length;i++){
        //     System.out.println(args[i]);
        // }
        for(int i=0;i<args.length;i++){
            char ch = args[i].charAt(0);
            String[] temp = args[i].split(" ");
            // for(int j =0;j<temp.length;j++){
            //     System.out.println(temp[j]);
            // }
            if(ch == 'r'){
                shape[i] = new Rectangle( new Point(Double.parseDouble(temp[1]),Double.parseDouble(temp[2])),
                                          new Point(Double.parseDouble(temp[3]),Double.parseDouble(temp[4])) );
            }
            else if(ch == 'c'){
                
                shape[i] = new Circle( new Point(Double.parseDouble(temp[1]),Double.parseDouble(temp[2])),
                                       Double.parseDouble(temp[3]));
            }
            else { //Triangle
                shape[i] = new Triangle( new Point(Double.parseDouble(temp[1]),Double.parseDouble(temp[2])),
                                          new Point(Double.parseDouble(temp[3]),Double.parseDouble(temp[4])),
                                          new Point(Double.parseDouble(temp[5]),Double.parseDouble(temp[6])) );
            }
        }
        
      System.out.printf("The total area for the %d objects is %1.2f units squared. \n",shape.length, AreaCalculator.calculate(shape));
    }
}