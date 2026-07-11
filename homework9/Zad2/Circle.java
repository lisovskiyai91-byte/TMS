package TMSnew.homework7.TMS.homework9.Zad2;

public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI *Math.sqrt(r);
    }

    @Override
    public double getPerimeter() {
        return 2 *Math.PI*r;
    }
}
