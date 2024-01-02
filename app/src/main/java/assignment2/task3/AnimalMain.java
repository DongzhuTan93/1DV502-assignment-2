package assignment2.task3;

/**
 * The code for the task 3.
 */
public class AnimalMain {

  /**
   * The main method to run the application.
   *
   * @param args Unused program arguments.
   * @throws Exception A exception object includes a error description. 
   */
  public static void main(String[] args) throws Exception {

    Mammal cattle = new Mammal(" cattle", "Mammalia", 5.5, " red and white", true, " Muuuuu!");
    Bird peafowl = new Bird("Peafowl", "Aves", 1.1, true, true, "Wood", " Kaka-kaka");
    Reptile reptile = new Reptile("Comodo dragon", "Reptilia", 2.2, "desert", false, " kshhhhhh kshhhh");

    System.out.println("A Swedish" + cattle.getFurColor() + cattle.getName() + " " + cattle.makeSound());
    System.out.println("A " + peafowl.getName() + " " + peafowl.makeSound());
    System.out.println("A " + reptile.getName() + " " + reptile.makeSound());

  }
}
