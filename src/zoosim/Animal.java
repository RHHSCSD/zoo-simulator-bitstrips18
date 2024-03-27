/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author peter
 */
public class Animal implements IEntity{
    public int id;
    public String name;
    public String species;
    public char gender;
    public int age;
    public position(int xlocation, int ylocation);
    public String sizel;
    public int direction;
    public int hunger;
    public int fatigue;
    public String sound;
    public image Image;
   
    public void makeSound(){
        System.out.println(animalSound);
    }
    public move(int x, int y){
        xlocation = xlocation + x;
        ylocation = ylocation + y;
       
    }
    public void eat(){
        hunger = 0;
        System.out.println("Full Appetite");
    }
    public void sleep(){
     fatigue = 0;
     System.out.println("Well Rested");
    }
    public turn(String direction, double degrees){
        
    }
}
