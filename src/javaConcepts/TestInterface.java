package javaConcepts;

public interface TestInterface {
    void abstractMethodOfInterface();
    String name = "Ankit";
    int id = 123;

    default void intfaceConcrete(){
        System.out.println("this is a deafult concerte method of the TestInterface");
    }

    default void staticIntfaceConcrete(){
        System.out.println("this is a static concerte method of the TestInterface");
    }
}
