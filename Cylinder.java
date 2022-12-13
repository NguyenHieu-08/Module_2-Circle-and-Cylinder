public class Cylinder extends Circle {
    
    private double height;

    public Cylinder() {
        super();
        this.height = 5.2;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double cylinderVolume() {
        return Math.PI * Math.pow(this.getRadius(),2) * this.height;
    }

    @Override
    public String toString() {
        return "Ban Kinh: " + this.getRadius()
                + "\nMau sac: " + this.getColor()
                + "\nChieu cao: " + this.getHeight()
                + "\nThe tich hinh tru: " + this.cylinderVolume();  
    }

}