package ie.tudublin;

public class Animal {

    private String name;

    //Constructor 
    //Same name as the class
    //No return type
    //If you don't add one, its added by default
    public Animal(String name) 
    {
        setName(name);    
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        //name = name; 
        this.name = name; //Correct way 
    }

    public void speak() {
        System.out.println("I can't speak!")
    }
}