/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author peter
 */
public interface IEntity extends IObject{
    public void move(int x, int y, int turn);
    public void makeSound();
    public void eat();
    public void sleep();
}
