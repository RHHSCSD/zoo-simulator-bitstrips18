/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author peter
 */
public class WaterAnim extends Animal implements ISwimmable{
    public boolean canBreathe;
    public boolean diving;
    WaterAnim(String sound,Gender sex, int size, String name, int age) {
		super(sound,sex,size,name,age);
		
	}
    //the location of the animal, either above or underwater
    public void dive(){
        diving = true;
    }
    /**
     * Makes the animal go underwater
     */
    public void surface(){
        diving = false;
    }
    /**
     * Makes the animal go above water
     */ 
    public boolean isDiving(){
        return diving;
    }
    /**
     * Checks if the animal is currently diving
     * @return the diving variable
     */
@Override public void turn(int degrees){}
    
@Override public void place(int x, int y){}
    
}
