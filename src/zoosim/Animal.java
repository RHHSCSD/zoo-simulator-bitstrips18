/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author peter
 */

   enum Gender {
         M,
         F
   };

//location of the animal in reference to a coordinate grid
public abstract class Animal implements IEntity{

    public int id;
    //unique identifier for each animal
    private String name;
    private String species;
    private Gender sex;
    private int age;
    private Position position;
    private int size;
    public int speed;
    public double direction;
    private int hunger;
    private int fatigue;
    private String sound;
    private Image image;
   Animal(String sound,Gender sex, int size, String name, int age) {
    	this.sound= sound;
    	this.sex = sex;
    	this.size = size;
    	this.name = name;
    	this.age = age;
    }
   
    /**
     * @return the animal name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the animal name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
@Override
public void makeSound(){
        System.out.println(this.sound);
    }
    public void move(int x, int y){
        this.position.x +=  x;
        this.position.y += y;
       
    }
    /**
     * Resets the animal hunger to 0 and prints a message
     */
    @Override
    public void eat(){
        this.hunger = 0;
        System.out.println("Full Appetite");
    }
    /**
     * Resets the animal fatigue to 0 and prints a message
     */
    @Override
    public void sleep(){
     this.fatigue = 0;
     System.out.println("Well Rested");
    }
    /**
     * Turns the animal clockwise by a specific number of degrees
     * @param degrees 
     */
   
    public void turn(double degrees){
        this.direction +=degrees;
    }
    @Override
    public void move(int x, int y, int turn){
        
    }
    
}
