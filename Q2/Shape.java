//package Q2;
import java.lang.Math;

abstract class Shape{
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

}

class Circle extends Shape {
    Point p1 = new Point(0,0);
    double r =0;
    Circle(Point p1, double r){
        this.p1 = p1;
        this.r = r;
    }

    double Area(){
        //System.out.println("The radius is r: "+r);
        return Math.PI * Math.pow(r, 2);
    }
    Point position(){
        return p1;
    }
    public String toString(){
        return "Circle (" +p1.x+","+p1.y+") radius = "+r;
    }

}

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
        return "Triangle (" +p1.x+","+p1.y+")-("+p2.x+","+p2.y+")-("+p2.x+","+p2.y+")";
    }
}