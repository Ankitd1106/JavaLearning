package javaConcepts;

public abstract class TestAbstractClass {

    //constructor
    public TestAbstractClass(){
        System.out.println("contructor of TestAbstractClass");
    }

    public abstract void abstractMethodOfAbstractClass();

    public void concretetMethodOfAbstractClass(){
        System.out.println("concrete method of Abstract class");
    }



}
