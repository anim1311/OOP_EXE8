public class Circle extends GeometricObject{
    
    private double radius;

    Circle(){
        this.radius = 1;
        this.setX(0);
        this.setY(0);
    }

    Circle(double radius){
        this();
        this.radius = radius;
    }

    Circle(double radius, double x, double y){
        this(radius);
        this.setX(x);
        this.setY(y);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public void printCircle(){
        System.out.println("The circle is created " + this.getDateCreated() + " and the radius is " + this.radius);
    }

    public String toString(){
        return String.format("(%.2f,%.2f)", this.getX(), this.getY()) + String.format(",r:%.2f", this.radius);
    }




}
