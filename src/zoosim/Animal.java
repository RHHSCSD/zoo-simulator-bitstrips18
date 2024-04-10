/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * This class is abstract, and when the object is created, the properties of
 * sound, size, name, age and sex should be provided
 *
 * @author peter
 */

//location of the animal in reference to a coordinate grid
public abstract class Animal implements IEntity {

    //unique identifier for each animal
    private String name;
    private String species;
    private Gender sex;
    private int age;
    private Position position;
    private int size;
    private int speed;
    private double direction;
    private int hunger;
    private int fatigue;
    private String sound;
    private Image image;

    Animal(String sound, Gender sex, int size, String name, int age) {
        this.sound = sound;
        this.sex = sex;
        this.size = size;
        this.name = name;
        this.age = age;
    }

    /**
     * Changes the speed of the animal
     *
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Retrieves the animal location
     *
     * @param position
     * @return animal position
     */
    public Position getPosition(Position position) {
        return position;
    }

    /**
     * retrieves animal name
     *
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

    /**
     * retrieves animal species
     *
     * @return the species of the animal
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Outputs the sound associated with the animal
     */
    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }

    /**
     * Resets the animal hunger to 0 and prints a message
     */
    @Override
    public void eat() {
        this.hunger = 0;
        System.out.println("Full Appetite");
    }

    /**
     * Resets the animal fatigue to 0 and prints a message
     */
    @Override
    public void sleep() {
        this.fatigue = 0;
        System.out.println("Well Rested");
    }

    /**
     * Turns the animal clockwise by a specific number of degrees
     *
     * @param degrees
     */

    public void turn(double degrees) {
        this.direction += degrees;
    }

    /**
     * Moves the animal on the grid to a new location depending on the speed and
     * the angle
     */
    public void move() {
        //turn direction (degrees) into Radians using Math.toRadians
        double radDirection = Math.toRadians(this.direction);
        //figure out the amount to move.
        double moveX = this.speed * (Math.cos(radDirection));
        double moveY = this.speed * (Math.sin(radDirection));
        //change the x value.
        this.position.x += (int) moveX;
        //change y value
        this.position.y += (int) moveY;
    }

}
