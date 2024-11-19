package practicePrograms;/*
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
        System.out.println("practicePrograms.Singleton pattern achieved");
    }
}
