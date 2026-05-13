public class Triangle extends GeometricObject{
    private int s1, s2, s3;

    public Triangle(){}
    
    //ADD CALL TO SUPER
    public Triangle (int s1, int s2, int s3){
        this.s1 = s1; 
        this.s2 = s2; 
        this.s3 = s3; 
    }

    //COMPLETE CONSTRUCTOR
    public Triangle(int s1, int s2, int s3, String color, boolean filled) {
    }

    //COMPLETE THESE FUNCTIONS
    public double getArea() {  return 0;}

    @Override
    public double getPerimeter() {return 0;}


    //ADD GETDATECREATED()
    public String toString() {
        return "The Triangle was created on "  + 
        getDateCreated() +
        ". The sides are: " + s1 + ", " + s2 + ", " + s3 + ". The area = " + getArea();
    }

    public boolean equals(Triangle r){return false; }
    
    @Override
    public int compareTo(GeometricObject other){
        return 0;
    }

     
    @Override
    public Triangle clone() throws CloneNotSupportedException {
        Triangle copyT = (Triangle) super.clone();

        //Triangle copyT = new Triangle(this.s1, this.s2, this.s3, this.getColor(), this.isFilled());

        //if (getDateCreated() != null) {
        //    copyT.setDateCreated(new java.util.Date(getDateCreated().getTime()));
       // }

        return copyT;
    }
    

}
