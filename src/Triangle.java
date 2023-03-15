public class Triangle extends Shape{
    public Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public Triangle() {
    }

    public double getArea(){
      double  sum = super.side1 + super.side2 + super.side3;
        return  Math.sqrt(sum+(sum- super.side1)*(sum- super.side2)*(sum- super.side3));
    }
    public  double getPrimeter(){
        return super.side1 + super.side2 + super.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "diện tích="+getArea()+ "chu vi="+getPrimeter()+
                '}';
    }
}
