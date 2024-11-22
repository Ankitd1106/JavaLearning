package javaConcepts;

public class TestClass extends TestAbstractClass implements TestInterface {
    @Override
    public void abstractMethodOfInterface() {
        System.out.println("this is printing - from TestInterface");
    }

    public void printVariable(){
        System.out.println("printing string from TestInterface = "+name+"\t"+id);
    }

    public void intfaceConcrete(){
        System.out.println("default method in TestInterface - overridden in TestClass");
    }

//    public void staticIntfaceConcrete(){
//        System.out.println("static method in TestInterface - overridden in TestClass");
//    }

    @Override
    public void abstractMethodOfAbstractClass() {
        System.out.println("this is printing - from TestInterface");
    }

    public void concrtetMethodOfAbstractClass() {
        concretetMethodOfAbstractClass();
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.abstractMethodOfInterface();
        tc.printVariable();
        tc.intfaceConcrete();
        tc.staticIntfaceConcrete();
        tc.abstractMethodOfAbstractClass();
        tc.concrtetMethodOfAbstractClass();
    }
}


