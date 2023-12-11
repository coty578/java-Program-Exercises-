public class Circle {
    private double raduis;
    private String color;

    public Circle(){
    }

    public Circle(double raduis){
        this(raduis,"");
    }

    public Circle(double raduis ,String color){
        this.raduis = raduis;
        this.color = color;
    }
    public double getRaduis(){
        return raduis;
    }
    public void setRaduis(double raduis){
        this.raduis = raduis;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "raduis : "+raduis+" color:"+color;
    }
    public double getArea(){
        return Math.PI * raduis * raduis;
    }
    
}
