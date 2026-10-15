
//COMPLETE THIS CLASS
//EXTEND GEOMETRICOBJECT 
//IMPLEMENT COMPARABLE

public class Rectangle extends GeometricObject{
    private int width;
    private int height;

    public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    //EX1:  ADD CALL TO SUPER
    public Rectangle (int w, int h){
        super();
        width = w; 
        height = h;
    }

    //EX1: ADD CALL TO SUPER
    public Rectangle(int w, int h,String color, boolean filled) {
        super(color, filled);
        width = w; 
        height = h;
    }

    //GETTERS AND SETTERS ARE DONE FOR YOU
    public int getWidth() {return width;}
    public int getheight() {return height;}
    public void   setWidth(int w) {this.width = w;}
    public void   setheight(int h) {this.height = h;}

    //EX1: COMPLETE THESE FUNCTIONS
    public double getArea() { return width*height;}
    public double getPerimeter() { return 2*width + 2*height;}
    public boolean equals(Rectangle rhs){
        return (this.width == rhs.width && this.height == rhs.height);  
    }

    //ADD GETDATECREATED()
    public String toString() {
        return "The rectangle was created on "  + 
        getDateCreated() +
        ". The width is " + width + " and the height is " + height + ". The area = " + getArea();
    }

    @Override
    public int compareTo(GeometricObject other){
        if (this.getArea() > other.getArea())
            return 1;
        else if (this.getArea() < other.getArea())
            return -1;
        else
            return 0;
    }


}
