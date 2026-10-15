public class TestLinkedList{

    public static void testLinkedList(){
            System.out.println("\n\nEXAMPLE 1: LINKED LISTS");          
            MyLinkedList<Integer> myLL1 = new MyLinkedList<>();   
            
            myLL1.addLast(5);
            myLL1.addLast(6);
            myLL1.addLast(7);
            
            
            System.out.println(myLL1);



      
            System.out.println("\n\nEXAMPLE 2: LINKED LISTS");          
            Rectangle[] allRs= {
                new Rectangle(7, 34),
                new Rectangle(2,5),
                new Rectangle(15, 8),
                new Rectangle(3,15)};



            MyLinkedList<Rectangle> myLL2 = new MyLinkedList<>(allRs);   
            System.out.println(myLL2);      
      
      
      
      
  }
}