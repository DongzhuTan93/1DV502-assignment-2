package assignment2.task2;

import java.util.ArrayList;

/**
 * The code for the task 2.
 */
public class MoonMain {

  /**
   * The main method to run the application.
   *
   * @param args Unused program arguments.
   * @throws Exception A exception object includes a error description. 
   */
  public static void main(String[] args) throws Exception {

    Planet marsPart2 = new Planet("Mars", 4, 249209300, 206669000);
    Moon phobos = new Moon("Phobos", 22);
    Moon deimos = new Moon("Deimos", 12);
    marsPart2.addMoon(phobos);
    marsPart2.addMoon(deimos);

    Planet earthPart2 = new Planet("Earth", 3, 152097701, 147098074);
    Moon moon = new Moon("The moon", 3474);
    earthPart2.addMoon(moon);

    ArrayList<Planet> planets = new ArrayList<Planet>();
    planets.add(marsPart2);
    planets.add(earthPart2);

    for (Planet planet : planets) {
      System.out.println(" ");
      System.out.println("The planet is called " + planet.getName() 
          + " and has the following moons: ");
      
      int count = 0;
      for (Moon currentMoon : planet.getMoons()) {
        count = count + 1;
        System.out.println(" " + " Moon " + count + " is called " + currentMoon.getName() + " " 
            + "(" + currentMoon.getKmSize() + "km" + ")");
      }
    }
  }
}
