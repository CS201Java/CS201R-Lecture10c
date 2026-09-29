public class TestLinkedList{

    public static void testLinkedList(){
            System.out.println("\n\nEXAMPLE: LINKED LISTS");          
            Rectangle[] allRs= {
                new Rectangle(7, 34),
                new Rectangle(2,5),
                new Rectangle(15, 8),
                new Rectangle(3,15)};

            MyLinkedList<Rectangle> myList = new MyLinkedList<>(allRs);   
            System.out.println(myList.toString());
      }
}