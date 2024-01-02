package assignment2.task4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The code for the task 4.
 */
public class ComparableMain {

  /**
   * The main method to run the application.
   *
   * @param args Unused program arguments.
   * @throws Exception A exception object includes a error description. 
   */
  public static void main(String[] args) {
    ArrayList<Animal> allOfAnimal = new ArrayList<>();

    Bird bird1 = new Bird(" Kivi ", "Apteryx mantell i", 1.1, true, true, "the ground ");
    Bird bird2 = new Bird(" Indian peafowl ", "Pavo cristatus ",
        3, true, true, "the ground ");
    Mammal mammal1 = new Mammal(" Cattle ", "Bos taurus ",
        1100, "red and white", true);
    Mammal mammal2 = new Mammal(" Tiger ", "Panthera tigris ", 
        240, "yellow and black ", true);
    Reptile reptile1 = new Reptile(" Nile crocodile ", "Crocodilus niloticus ",
        230, "fresh water ", true);
    Reptile reptile2 = new Reptile(" Green sea turtle ", 
        "Chelonia mydas ", 315, "sea ", true);

    allOfAnimal.add(bird1);
    allOfAnimal.add(bird2);
    allOfAnimal.add(mammal1);
    allOfAnimal.add(mammal2);
    allOfAnimal.add(reptile1);
    allOfAnimal.add(reptile2);
    
  
    Collections.sort(allOfAnimal);
    // I got inspiration here: https://www.javatpoint.com/Comparable-interface-in-collection-framework

    for (Animal animal : allOfAnimal) {
      if (animal instanceof Bird) {
        System.out.println(animal.getLatinName() + "puts its egg in/on " 
            +  ((Bird) animal).getNestType());
      } else if (animal instanceof Mammal) {
        System.out.println(animal.getLatinName() + "has a fur that " 
            +  ((Mammal) animal).getFurColor());
      } else if ((animal instanceof Reptile)) {
        System.out.println(animal.getLatinName() + "lives in " +  ((Reptile) animal).getHabitat());
      }
    }
    
  }
}
  