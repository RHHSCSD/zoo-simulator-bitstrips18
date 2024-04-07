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
    void move(int time);
    void makeSound();
    void eat();
    void sleep();
}
