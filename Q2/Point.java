//package Q2;

public class Point {

    double x=0;
    double y=0;

    Point(double X, double Y){
        this.x = X;
        this.y = Y;
    }
    public boolean equals(Object obj){ //NEEDED TO UPDATE THIS EQUALS AS WELL AHHHHHHHHHHH
        if(this == obj){  
            //System.out.println("equals");
            System.out.println("equals");
                return true;
        }
        if(!(obj instanceof Point)){ 
            System.out.println("not equals");
            return false;
        }
        Point p = (Point) obj;
        return p.x == x && p.y ==y;
    }
    public int hashCode(){
        return 11* (int)x;
    }
}