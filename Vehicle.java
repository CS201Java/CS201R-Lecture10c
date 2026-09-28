public interface Vehicle {
    void start();     // no body
    void stop();
    default void honk(){
        System.out.println("makes no sound");
    }
}