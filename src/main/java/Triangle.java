public class Triangle extends GeometricObject {
    
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    Triangle(){
        super();
        this.setX(0);
        this.setY(0);
        this.setTheta(0);
    }

    Triangle(double side1, double side2, double side3){
        this();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    Triangle(double side1, double side2, double side3, double x, double y, double theta){
        this(side1, side2, side3);
        this.setX(x);
        this.setY(y);
        this.setTheta(theta);
    }

    Triangle(String color, boolean filled, double side1, double side2, double side3, double x, double y, double theta){
        this(side1, side2, side3, x, y, theta);
        this.setColor(color);
        this.setFilled(filled);
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea(){
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public void rotate(double theta){
        this.setTheta(this.getTheta() + theta);
    }

    public String toString(){

        String result = "";
        double angle = this.getTheta();

        double x1 = this.getX();
        double y1 = this.getY();

        result += String.format("(%.2f,%.2f),", x1, y1);

        x1 = x1 + this.getSide1() * Math.cos(angle);
        y1 = y1 + this.getSide1() * Math.sin(angle);

        angle += 2*Math.PI /3 ;
        result += String.format("(%.2f,%.2f),", x1, y1);

        x1 = x1 +  this.getSide2() * Math.cos(angle);
        y1 = y1 + this.getSide2() * Math.sin(angle);

        result += String.format("(%.2f,%.2f)", (double)Math.round(x1), Math.floor(y1));

        return result;
    }

}
