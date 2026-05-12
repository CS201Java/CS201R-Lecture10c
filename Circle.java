public class Circle extends GeometricObject {
    private double radius;

    public Circle(){}
    public Circle (double r){
        super();
        radius = r;
    }
    public Circle(double radius, String color, boolean filled) {
        super();
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {return radius;}
    public void   setRadius(double radius) {this.radius = radius;}
    public double getArea() {return radius * radius * Math.PI;}
    public double getPerimeter() {return 2 * radius * Math.PI;}

    public double getDiameter() {return 2 * radius;}

    public String toString() {
        return "The circle is created " + getDateCreated() + ".  The radius = " + radius + ". The area = " + getArea();
    }

    public boolean equals(Circle c){
        return this.radius == c.radius;
    }

    @Override
    public int compareTo(GeometricObject other){
        if (getArea() > other.getArea())
            return 1;
        else if (getArea() < other.getArea())
            return -1;
        else
            return 0;
    }
}
