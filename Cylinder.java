public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height,double raduis){
        super(raduis);
        this.height = height;
    }
    public Cylinder(double height,double raduis,String color){
        super(raduis,color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String toString(){
        return "height:"+height+" raduis: "+super.getRaduis()+" color :"+super.getColor();
    }
    public double getVolume(){
        return super.getArea() * height;
    }
}
