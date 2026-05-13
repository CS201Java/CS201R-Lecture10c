public class Main {

    public static void main(String[] args){
      
      System.out.println("EXAMPLE 1: ABSTRACT CLASSES - GEOMETRIC SHAPES");
 
      System.out.println("EXAMPLE 1: CREATE AND PRINT EACH GEOMETRIC OBJECT");
      GeometricObject c1 = new Circle(5);
      GeometricObject t1 = new Triangle(3,4,5);
      Rectangle r1 = new Rectangle(4,5);
      System.out.println(c1);
      System.out.println(t1);
      System.out.println(r1);

      //Create an array of circle objects
      System.out.println("\nEXAMPLE 1: CREATE & PRINT CIRCLE ARRAY");
      Circle[] allCs= {
        new Circle(7 ),
        new Circle(1 ),
        new Circle(19 ),
        new Circle(9 )};

      for (Circle c : allCs)
        System.out.println(c.toString());

      //Create an array of rectangle objects
      System.out.println("\nEXAMPLE 1: CREATE & PRINT RECTANGLE ARRAY");
      Rectangle[] allRs= {
        new Rectangle(7, 34),
        new Rectangle(2,5),
        new Rectangle(15, 8),
        new Rectangle(3,15)};
      for (Rectangle r : allRs)
        System.out.println(r.toString());

      //Create an array of triangle objects
      System.out.println("\nEXAMPLE 1: CREATE & PRINT TRIANGLE ARRAY");
      Triangle[] allTs= {
        new Triangle(1, 2, 2),
        new Triangle(2, 2, 2),
        new Triangle(5, 12, 13),
        new Triangle(1, 1, 1)};
      for (Triangle t : allTs)
        System.out.println(t.toString());

      System.out.println("\n\nEXAMPLE 2: INTERFACES - VEHICLES");
      Tesla tesla = new Tesla("Tesla");
      Toyota toyota = new Toyota("Toyota");

      System.out.println("EXAMPLE 2: TESLA");      
      tesla.start();
      tesla.honk();
      tesla.drive();
      System.out.println("Fuel: " + tesla.fuelType());
      tesla.stop();

      System.out.println();

      System.out.println("EXAMPLE 2: TOYOTA");  
      toyota.start();
      toyota.honk();
      toyota.drive();
      System.out.println("Fuel: " + toyota.fuelType());
      toyota.stop();
  
      System.out.println("\n\nEXAMPLE 3: USING COMPARABLE INTERFACE - compareTo");  
 
      System.out.println("\n\nEXAMPLE 3: compareTo TO SORT CIRCLES");  
      java.util.Arrays.sort(allCs);
 
      for (Circle c : allCs)
        System.out.println(c.toString());
       
      System.out.println("\n\nEXAMPLE 3: compareTo TO SORT RECTANGLES");
      java.util.Arrays.sort(allRs);

      for (Rectangle r : allRs)
        System.out.println(r.toString());
     

    }  

}

