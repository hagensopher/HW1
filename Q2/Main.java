//package Q2;
import java.util.Arrays;


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

        //Arrays.sort(shape);
        int count =0;
        for(Shape s :shape){
            System.out.println(++count + ")"+ s+"\t\t area="+s.Area());
        }

        Circle c1 = new Circle(new Point(1.0,1.0),1.0);
        Circle d1 = new Circle(new Point(2.0,2.0),2.0);
        Circle e1 = new Circle(new Point(3.0,3.0),3.0);
        //Circle f1 = new Circle(new Point(4.0,4.0),4.0);

        ShapeList<Shape> emptyShapes = new ShapeList<Shape>();
        ShapeList<Circle> someCircles = new ShapeList<Circle>(Arrays.asList(c1, d1, e1));
        

        System.out.println("emptyShapes = " + emptyShapes.toString());
        System.out.println("someCircles = " + someCircles);
        System.out.println("reversed someCircles = " + someCircles.reverse());


    }
}