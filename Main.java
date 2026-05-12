public class Main {

    public static void main(String[] args){
      /*
      System.out.println("EXAMPLE 1: VEHICLES");
      Tesla tesla = new Tesla("Tesla");
      Toyota toyota = new Toyota("Toyota");

      System.out.println("EXAMPLE 1: TESLA");      
      tesla.start();
      tesla.honk();
      tesla.drive();
      System.out.println("Fuel: " + tesla.fuelType());
      tesla.stop();

      System.out.println();

      System.out.println("EXAMPLE 1: TOYOTA");  
      toyota.start();
      toyota.honk();
      toyota.drive();
      System.out.println("Fuel: " + toyota.fuelType());
      toyota.stop();
    
      
      System.out.println("\n\nEXAMPLE 2: GEOMETRY - CIRCLES");

      Circle c1 = new Circle(5);
      System.out.println("\n\nCircle 1: " + c1.toString());

      
      Circle[] allCs= {
        new Circle(7 ),
        new Circle(1 ),
        new Circle(19 ),
        new Circle(9 )};

      for (Circle c : allCs)
        System.out.println(c.toString());

      
      System.out.println("\n\nEXAMPLE 3: GEOMETRY - RECTANGLES");
      Rectangle r1 = new Rectangle(6, 8 );
      System.out.println("\n\nRectangle 1: " + r1.toString());

      Rectangle[] allRs= {
        new Rectangle(7, 34),
        new Rectangle(2,5),
        new Rectangle(15, 8),
        new Rectangle(3,15)};
      for (Rectangle r : allRs)
        System.out.println(r.toString());

      
      System.out.println("\n\nEXAMPLE 4: GEOMETRY - TRIANGLES");
      Triangle t1 = new Triangle(3, 4, 5);
      System.out.println("\n\nTriangle 1: " + t1.toString());

      Triangle[] allTs= {
        new Triangle(1, 2, 2),
        new Triangle(2, 2, 2),
        new Triangle(5, 12, 13),
        new Triangle(1, 1, 1)};
      for (Triangle t : allTs)
        System.out.println(t.toString());
  
      System.out.println("\n\nEXAMPLE 5: GEOMETRY - compareTo TRIANGLES");  
      if (allTs[1].compareTo(allTs[3]) < 0)
        System.out.println("allTs[1] is smaller than allTs[3] ");
      else
         System.out.println("allTs[1] is >= than allTs[3] ");   

 
      System.out.println("\n\nEXAMPLE 6: GEOMETRY - compareTo CIRCLES");  
      java.util.Arrays.sort(allCs);
 
      for (Circle c : allCs)
        System.out.println(c.toString());
       
      System.out.println("\n\nEXAMPLE 7: GEOMETRY - compareTo RECTANGLES");
      java.util.Arrays.sort(allRs);

      for (Rectangle r : allRs)
        System.out.println(r.toString());
     
      */
      System.out.println("\n\nEXAMPLE 8: GEOMETRY - ISSUES WITH SHALLOW COPY");
      Triangle t2 = new Triangle(5,7,9);
      System.out.println("\nBefore: " + t2.getDateCreated());
      //java.util.Date d = t2.getDateCreated();
      //d.setTime(0); 
      System.out.println("After:  " + t2.getDateCreated());

      System.out.println("\n\nEXAMPLE 9: GEOMETRY - USING CLONE");
      Triangle t3 = t2;
      t3.getDateCreated().setTime(0);
      System.out.println("t2:  " + t2.getDateCreated());
      System.out.println("t3:  " + t3.getDateCreated());

      try{
      Triangle t4 = (Triangle)t2.clone();
      t4.getDateCreated().setTime(System.currentTimeMillis());
      System.out.println("\n\nt2:  " + t2.getDateCreated());
      System.out.println("t4:  " + t4.getDateCreated());
      } 
      catch(CloneNotSupportedException e){
        System.out.println("clone issue");
      } 
    }  
}

