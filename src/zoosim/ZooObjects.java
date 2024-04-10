/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author peter
 */
public class ZooObjects implements IObject {

    private String type;
    private Position position;
    private String size;

    /**
     * Rotates the direction of the zoo object by int degrees
     *
     * @param degrees
     * @return objectDeg
     */
    @Override
    public void turn(int degrees) {
        int objectDeg = degrees;

    }

    /**
     * Places the object at the assigned x and y coordinates
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public void place(int x, int y) {
        this.position.x = x;
        this.position.y = y;

    }
}
