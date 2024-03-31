/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author peter
 */
public class ZooObjects implements IObject{
    public String type;
    private Position position;
    public String size;

    public int turn(int degrees){
        int objectDeg = degrees;
        return objectDeg;
    }
    public Position place(int x, int y){
        this.position.x = x;
        this.position.y = y;
        return this.position;
    }
}
