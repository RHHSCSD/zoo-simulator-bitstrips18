/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author peter
 */
public abstract class BirdAnim extends Animal implements IFlyable{
    public boolean canFly;
    public boolean flying;
    //The location of the animal, either landed or flying
    /**
     * If the animal is currently grounded, makes it fly
     */
    public void fly(){
        flying = true;
    }
    /**
     * If the animal is flying, makes it land
     */
    public void land(){
        flying = false;
    }
    /**
     * Checks if the animal is currently flying
     * @return the flying variable
     */
    public boolean isFlying(){
    return flying;
}
}
