package ie.tudublin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //This is not polymorphism
        Cat topcat = new Cat("Topcat");

        //This is polymorphism
        Animal mino = new Cat("Mino");

        //A virtual method
        //Also known as Dynamic Binding
        mino.speak();

        //Will not compile
        //System.out.println(mino.getNumLives());
        
        //Will compile
        System.out.println(((Cat)mino).getNumLives());

        mino = new Dog("Misty");
        //topcat = new Dog("Tara"); This wont compile

        Animal a = new Cat("a");
        Animal b = new Cat("b");

        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);
    }
}

