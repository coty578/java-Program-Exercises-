public class CircleMain {
    public static void main(String[] args) {
        Circle circle  = new Circle(1.0,"red");
        Cylinder cylinder = new Cylinder(1.0, 1.0, "blue");

        System.out.println(circle);
        System.out.println("the value of the area is:"+circle.getArea());

        System.out.println(cylinder);
        System.out.println("the value of the volume is :"+cylinder.getVolume());
        
    }
    
}
