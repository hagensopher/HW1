//package Q2;
import java.util.Arrays;


public class Main{

    public static Shape maxArea(Node<Shape> shape){
        double area =0.0;
        Node<Shape> maxShape = shape;
        
       while(shape.next != null){
        
            if(area < shape.v.Area()){
                area = shape.v.Area();
                maxShape = shape;
            }
           shape =  shape.next;
       }
       return maxShape.v;
    }

    public static Rectangle boundingRect(Node<Rectangle> rect){
        double area =0.0;
        Node<Rectangle> maxShape = rect;
        while(rect.next != null){
        
            if(area < rect.v.Area()){
                area = rect.v.Area();
                maxShape = rect;
            }
           rect =  rect.next;
       }
       return maxShape.v;
    }

    public static void main(String[] args){
        Shape shape[] = new Shape[args.length];
        if(args.length < 1){
            System.out.println("Please Enter some shapes");
            System.exit(0);
        }

        for(int i=0;i<args.length;i++){
            char ch = args[i].charAt(0);
            String[] temp = args[i].split(" ");
           //goes through each command line argument and parses the shapes
            if(ch == 'r'){ //Rectangle
                shape[i] = new Rectangle( new Point(Double.parseDouble(temp[1]),Double.parseDouble(temp[2])),
                                          new Point(Double.parseDouble(temp[3]),Double.parseDouble(temp[4])) );
            }
            else if(ch == 'c'){ //Circle
                
                shape[i] = new Circle( new Point(Double.parseDouble(temp[1]),Double.parseDouble(temp[2])),
                                       Double.parseDouble(temp[3]));
            }
            else { //Triangle
                shape[i] = new Triangle( new Point(Double.parseDouble(temp[1]),Double.parseDouble(temp[2])),
                                          new Point(Double.parseDouble(temp[3]),Double.parseDouble(temp[4])),
                                          new Point(Double.parseDouble(temp[5]),Double.parseDouble(temp[6])) );
            }
        }
        //Prints the total area for the list of shapes
      System.out.printf("The total area for the %d objects is %1.2f units squared. \n",shape.length, AreaCalculator.calculate(shape));
        //Prints the sorted list
        Arrays.sort(shape);
        int count =0;
        for(Shape s :shape){
            System.out.println(++count + ")"+ s+"\t\t area="+s.Area()); //prints the sorted list of shapes
        }

        //USE THESE FOR TESTING HASHCODE
        /*Triangle t1 = new Triangle(new Point(1.0, 1.0), new Point(2.0, 2.0),new Point(3.0, 3.0));
        System.out.println("the object 1 is "+ t1);
        System.out.println("the hashcode for object 1 is "+ t1.hashCode());
        Triangle t2 = new Triangle(new Point(1.0, 1.0), new Point(2.0, 2.0),new Point(3.0, 3.0));
        System.out.println("the object 2 is "+ t2);
        System.out.println("the hashcode for object 2 is "+ t2.hashCode());
        System.out.println(t1.equals(t2));

        Rectangle r1 = new Rectangle(new Point(1.0, 1.0), new Point(2.0, 2.0));
        System.out.println("the object 1 is "+ r1);
        System.out.println("the hashcode for object 1 is "+ r1.hashCode());
        Rectangle r2 = new Rectangle(new Point(1.0, 1.0), new Point(2.0, 2.0));
        System.out.println("the object 2 is "+ r2);
        System.out.println("the hashcode for object 2 is "+ r2.hashCode());
        System.out.println(r1.equals(r2));
        */
        //Hash Test for Circles the others are above
        Circle c1 = new Circle(new Point(1.0, 1.0), 1.0);
        System.out.println("the object 1 is "+ c1);
        System.out.println("the hashcode for object 1 is "+ c1.hashCode());
        Circle c2 = new Circle(new Point(1.0, 1.0), 1.0);
        System.out.println("the object 2 is "+ c2);
        System.out.println("the hashcode for object 2 is "+ c2.hashCode());
        System.out.println(c1.equals(c2));
        //END OF Q2 MAIN CODE


        //START OF Q3 MAIN CODE

        //make linked listof Node<Shape> for the maxArea()
        Node<Shape> head = new Node<Shape>(null,null); //refrence to the head
        Node<Shape> prev = new Node<Shape>(null,null); //refrence to the prev node
        for(int i =0;i<3;i++){ //loop to create a linked list of nodes
            Circle c01 = new Circle(new Point(i+3,i+1),i+1);
            if(i==0){
                Node<Shape> temp = new Node<Shape>(c01, null);
                prev = temp;
                head = temp;
                continue;
            }
            Node<Shape> current = new Node<Shape>(c01, null);
            prev.next = current;
            prev = current; 
            count++; 
            
        }
        System.out.println("The max area shape is"+maxArea(head));

        //Q3 A BETTER LINKED LIST

        //CIRCLE SHAPELIST TEST
        Circle c01 = new Circle(new Point(1.0,1.0),1.0);
        Circle d1 = new Circle(new Point(1.0,1.0),1.0);
        Circle e1 = new Circle(new Point(3.0,3.0),3.0);
        //Circle f1 = new Circle(new Point(4.0,4.0),4.0);
        ShapeList<Shape> emptyShapes = new ShapeList<Shape>();
        ShapeList<Circle> someCircles = new ShapeList<Circle>(Arrays.asList(c01, d1, e1));
        
        //EMPY SHAPES AND SOMECIRCLES
        System.out.println("emptyShapes = " + emptyShapes);
        System.out.println("reversed emptyShapes = " + emptyShapes.reverse());
        System.out.println("someCircles = " + someCircles);
        System.out.println("reversed someCircles = " + someCircles.reverse());
        
       /* //RECTANGLE LIST TEST
        Rectangle r01 = new Rectangle(new Point(1.0,2.0), new Point(3.0, 4.0));
        Rectangle r02 = new Rectangle(new Point(2.0,3.0), new Point(4.0, 5.0));
        Rectangle r03 = new Rectangle(new Point(3.0,5.0), new Point(5.0, 7.0));
        ShapeList<Rectangle> someRec = new ShapeList<Rectangle>(Arrays.asList(r01,r02,r03));
        System.out.println("someCircles = " + someRec);
        System.out.println("reversed someCircles = " + someRec.reverse());
        */


        //CALCULATE THE SUM OF THE POINTS USING MY SHAPELIST
        double sumOfXs = 0.0;
        double sumOfYs = 0.0;
        for(Circle c : someCircles){
            sumOfXs += c.position().x;
            sumOfYs += c.position().y;
        }
        System.out.println("Some of Xs = " + sumOfXs);
        System.out.println("Some of Ys = " + sumOfYs);

    }
}