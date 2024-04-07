/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
import java.util.ArrayList;
/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {

    ArrayList<Animal> animals = new ArrayList<Animal>();

    /**
     * @param args the command line arguments
     */
    public ArrayList<Animal> addAnimal(Animal oneAnimal) {
        animals.add(oneAnimal);
        return animals;

    }
    public void zooStats() {

        System.out.println("The zoo has the following statistics:");
    }
    public void feedAnimals() {
        //loop animals and feed each one
        for(Animal i : this.animals){
            i.eat();
        }
        System.out.println("All Animals fed");
        
    }

    public void restAnimals() {
        //call sleep methods for all tired animals
        for(Animal i : this.animals){
            i.sleep();
        }
        System.out.println("All Animals Asleep");
    }

    public void moveAll() {
        //call move methods for all  animals
    }
    public static void main(String[] args) {

        Animal aAnimal = new WaterAnim();
        
    }
    
}

/**
 * Thinking question comments
 * Add some new methods to IEntity to allow interactions between predator/prey, such as to fight or flee
 * Add a data type to the Animal class that defines its diet
 */