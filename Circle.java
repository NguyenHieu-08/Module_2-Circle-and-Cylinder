public class Circle {

    private double radius;
    private String color;

    public Circle() {
        this.radius = 2.5;
        this.color = "White";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double circleArea() {
        return Math.pow(this.radius,2) * Math.PI;
    }

    public String toString() {
        return "Ban Kinh: " + getRadius() + "\nMau sac: " + this.color + "\nDien tich: " + circleArea();
    }

}