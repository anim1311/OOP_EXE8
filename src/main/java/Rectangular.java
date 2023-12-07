public class Rectangular extends GeometricObject{
    
    private double width;
    private double height;

    Rectangular(){
        this.width = 1;
        this.height = 1;
        this.setX(0);
        this.setY(0);
    }

    Rectangular(double width, double height){
        this();
        this.width = width;
        this.height = height;
    }

    Rectangular(double width, double height, double x, double y, double theta){
        this(width, height);
        this.setX(x);
        this.setY(y);
        this.setTheta(theta);   
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    public void changeColor(String color){
        this.setColor(color);
    }

    public String toString(){

        String result = "";
        double angle = this.getTheta();
        double tempX = this.getX();
        double tempY = this.getY();

        

        result += String.format("(%.2f,%.2f),", tempX, tempY);
        //System.out.println("X: " + tempX + " Y: " + tempY);
        tempX += width * Math.cos(angle);
        tempY += width * Math.sin(angle);
        angle += 2 * Math.PI / 4;

        result += String.format("(%.2f,%.2f),", tempX, tempY);
        //System.out.println("X: " + tempX + " Y: " + tempY);
        tempX += height * Math.cos(angle);
        tempY += height * Math.sin(angle);
        angle += 2 * Math.PI / 4;

        result += String.format("(%.2f,%.2f),", tempX, tempY);
        //System.out.println("X: " + tempX + " Y: " + tempY);
        tempX += width * Math.cos(angle);
        tempY += width * Math.sin(angle);
        angle += 2 * Math.PI / 4;

        result += String.format("(%.2f,%.2f),", tempX, tempY);
        

        result = result.substring(0, result.length() - 1);

        return result;

    }
}
