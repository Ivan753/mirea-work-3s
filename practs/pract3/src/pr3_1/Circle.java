package pr3_1;
import java.lang.Math;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public boolean equal(Circle c){

        if(this.radius == c.radius && this.color == c.color && this.filled == c.filled) {
            return true;
        }else{
            return false;
        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "The Circle\nColor: "+this.color+"\nIs filled: "+this.filled+"\nRadius: "+this.radius;
    }
}
