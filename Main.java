public class Main {
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println(circle.toString());

        Circle cyclinder = new Cylinder();
        cyclinder.setRadius(4.5);
        System.out.println(cyclinder.toString());
    }
}