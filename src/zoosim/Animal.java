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
    public String name;
    public String species;
    private Gender sex;
    public int age;
    public Position position;
    public int size;
    public int speed;
    public double direction;
    public int hunger;
    public int fatigue;
    public String sound;
    public Image image;
   

public void makeSound(){
        System.out.println(this.sound);
    }
    public void move(int x, int y){
        this.position.x +=  x;
        this.position.y += y;
       
    }
    public void eat(){
        this.hunger = 0;
        System.out.println("Full Appetite");
    }
    public void sleep(){
     this.fatigue = 0;
     System.out.println("Well Rested");
    }
    
    public void turn(double degrees){
        this.direction +=degrees;
    }
    /**
     * Turns the animal clockwise by a specific number of degrees
     * @param degrees 
     */
}