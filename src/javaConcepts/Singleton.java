package javaConcepts;

/*
https://www.youtube.com/watch?v=khnair65cVc
 */

public class Singleton {
    private volatile static Singleton sngl;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (sngl == null) {
            synchronized (Singleton.class) {
                if (sngl == null) {
                    sngl = new Singleton();
                }
            }
        }
        return sngl;
    }

    public void testMethod(){
        System.out.println("Singleton pattern achieved");
    }

    public static void main(String[] args) {
        Singleton single = Singleton.getInstance();
        single.testMethod();
    }
}
