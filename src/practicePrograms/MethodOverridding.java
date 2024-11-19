class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }


