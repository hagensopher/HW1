//package Q2;
import java.lang.Math;



abstract class Shape implements Comparable<Shape>{
    Shape(){}

    abstract double Area();
    abstract Point position();
}

class Rectangle extends Shape{
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,0);
    Rectangle(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    double Area(){
        double height = Math.abs(p1.x-p2.x);
        double len = Math.abs(p1.y-p2.y);
        return height*len;
    }
    Point position(){
        return p1;
    }
    public String toString(){
        return "Rectangle (" +p1.x+","+p1.y+")-("+p2.x+","+p2.y+")";
    }
    @Override
    public boolean equals(Object obj) {
        
        if(this == obj){  
            System.out.println("equals");
                return true;
        }
        if(!(obj instanceof Rectangle)){ 
            System.out.println("not equals");
            return false;
        }
            
        Rectangle rec = (Rectangle) obj;
        boolean temp =  p1.equals(rec.p1) && p2.equals(rec.p2);
        return temp;
        
    }

    @Override
    public int hashCode(){
        //a simple hascode
        int total = 17;
        total = total + (31 * p1.hashCode());
        total = total + (31 * p2.hashCode());
        return total;
    }
    public int compareTo(Shape obj){
        if(this.Area() > obj.Area()){
            return 1;
        }
        else if(this.Area() == obj.Area()){
            return 0;
        }
        else{
            return -1;
        }
    }

}
//START OF THE CIRCLE CLASS
class Circle extends Shape {
    Point p1 = new Point(0,0);
    double r =0;
    Circle(Point p1, double r){
        this.p1 = p1;
        this.r = r;
    }

    double Area(){
        return Math.PI * Math.pow(r, 2);
    }
    Point position(){
        return p1;
    }
    public String toString(){
        return "Circle (" +p1.x+","+p1.y+") radius = "+r;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){  
                return true;
        }
        if(!(obj instanceof Circle)){ 
            return false;
        }      
        //what does this do??
        Circle rec = (Circle) obj;
        boolean temp =  p1.equals(rec.p1) && r == rec.r;
        return temp;
        
    }

    @Override
    public int hashCode(){ 
        //a simple hascode
        int total = 17;
        total = total + (31 * p1.hashCode());
        total = total + (int)(31*r);
        return total;
    }

    public int compareTo(Shape obj){
        //natural ordering check
        if(this.Area() > obj.Area()){
            return 1;
        }
        else if(this.Area() == obj.Area()){
            return 0;
        }
        else{
            return -1;
        }
    }

}

//START OF THE TRIANGLE CLASS

class Triangle extends Shape{
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,0);
    Point p3 = new Point(0,0);
    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    double Area(){
        //System.out.println(.5 * (((p2.y - p3.y)*p1.x) + ((p3.y-p1.y)*p2.x) + ((p1.y-p2.y)*p3.x)));
        return Math.abs(.5 * (((p2.y - p3.y)*p1.x) + ((p3.y-p1.y)*p2.x) + ((p1.y-p2.y)*p3.x)));
        
    }
    Point position(){
        return p1;
    }
    public String toString(){
        return "Triangle (" +p1.x+","+p1.y+")-("+p2.x+","+p2.y+")-("+p3.x+","+p3.y+")";
    }
    @Override
    public boolean equals(Object obj) {
        //the override equals function with the check if all points are the same then the shape must be the same
        if(this == obj){  
                return true;
        }
        if(!(obj instanceof Triangle)){ 
            System.out.println("not equals");
            return false;
        }
            
        //what does this do??
        Triangle rec = (Triangle) obj;
        boolean temp =  p1.equals(rec.p1) && p2.equals(rec.p2) && p3.equals(rec.p3);
        return temp;
        
    }

    @Override
    public int hashCode(){
        //a simple hascode
        int total = 17;
        total = total + (31 * p1.hashCode());
        total = total + (31 * p2.hashCode());
        total = total + (31 * p3.hashCode());
        return total;
    }

    public int compareTo(Shape obj){ //checks which area is greater
        if(this.Area() > obj.Area()){
            return 1;
        }
        else if(this.Area() == obj.Area()){
            return 0;
        }
        else{
            return -1;
        }
    }
}