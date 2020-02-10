package ie.tudublin;

public class Cat extends Animal{
    private int numLives;

    public Cat(String name)
    {
        //Constructor Chaining
        super(name);
        setNumLives(9);
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }
 
    public void speak() {
        System.out.println("Meow!")
    }
}