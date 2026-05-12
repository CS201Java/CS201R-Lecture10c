import java.util.Date;

public abstract class GeometricObject implements GeometricInt, Comparable<GeometricObject>, Cloneable{
    private String color;
    private boolean filled;
    private Date dateCreated;

     protected GeometricObject(){
        color = "green";
        filled = false;
        dateCreated = new java.util.Date();
     }
     protected GeometricObject(String c, boolean f){
        color = c;
        filled = f;
        dateCreated = new java.util.Date();
     }
     
     public String getColor() {return color;}
     public void setColor(String c) {color = c;}
     public boolean isFilled(){return filled;}
     public void setFilled(boolean f) {filled = f;}

     public Date getDateCreated() {
        return dateCreated;
        //return (dateCreated == null) ? null : new Date(dateCreated.getTime());
      }
     
     public void setDateCreated(Date d) {
        dateCreated = d;
        //dateCreated = (d == null) ? null : new Date(d.getTime());
     }
     
     public String toString(){return "created on: " + dateCreated + "\ncolor: " + color + " and filled: " + filled;}

     public abstract double getArea();
     public abstract double getPerimeter();

     @Override
     public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}