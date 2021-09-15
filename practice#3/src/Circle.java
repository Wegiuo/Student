import java.lang.*;
public class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.radius = 0;
        this.color = "unknown";
        this.filled = false;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color=color;
        this.filled=filled;
    }
    public Circle(double radius){

        this.radius = radius;
        this.color = "unknown";
        this.filled = false;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*Math.pow(2,this.radius);
    }
    public double getPerimeter(){
        return 3.14*2*this.radius;
    }
    public String toString(){
        return "Radius: "+this.radius+"  Color: "+this.color+"  Filled: "+ this.filled;
    }
}
