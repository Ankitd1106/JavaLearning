package javaConcepts;

public class TestClass extends TestAbstractClass implements TestInterface {
    @Override
    public void abstractMethodOfInterface() {
        System.out.println("this is printing - from TestInterface");
    }

    public void printVariable(){
        System.out.println("printing string from TestInterface = "+name+"\t"+id);
    }

    public void printDefaultMethodFromInterface(){
        intfaceConcrete();
    }

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
        tc.printDefaultMethodFromInterface();
        tc.abstractMethodOfAbstractClass();
        tc.concrtetMethodOfAbstractClass();
    }
}


