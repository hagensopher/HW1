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
            Rectangle rec = (Rectangle) obj;
            if(this.p1 == rec.p1 && this.p2 == rec.p2){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + p1.hashCode();
        result = 31 * result + p2.hashCode();
        return result;
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
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            Circle rec = (Circle) obj;
            if(this.p1 == rec.p1 && this.r == rec.r){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + p1.hashCode();
        result = 31 * result;
        return result;
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
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            Triangle rec = (Triangle) obj;
            if(this.p1 == rec.p1 && this.p2 == rec.p2 && this.p3 == rec.p3){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + p1.hashCode();
        result = 31 * result + p2.hashCode();
        result = 31 * result + p3.hashCode();
        return result;
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