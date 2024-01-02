package assignment2.task1;

/**
 * The main method to run the application.
 */
public class PlanetMain {
  /**
   * The main method to run the application.
   *
   * @param args Unused program arguments.
   * @throws Exception A exception object includes a error description.
   */
  public static void main(String[] args) throws Exception {
  
    Planet earthPart1 = new Planet("Earth", 3, 1, 152097701, 147098074);
    Planet marsPart1 = new Planet("Mars", 4, 2, 249209300, 206669000);
  
    System.out.println(earthPart1.getName() + ":");
    System.out.println("  " + "Position: " + earthPart1.getPosition());
    System.out.println("  " + "Moons: " + earthPart1.getNoOfMoons());
    System.out.println("  " + "Aphelion: " + earthPart1.getAphelion());
    System.out.println("  " + "Perihelion: " + earthPart1.getPerihelion());
  
    System.out.println(marsPart1.getName() + ":");
    System.out.println("  " + "Position: " + marsPart1.getPosition());
    System.out.println("  " + "Moons: " + marsPart1.getNoOfMoons());
    System.out.println("  " + "Aphelion: " + marsPart1.getAphelion());
    System.out.println("  " + "Perihelion: " + marsPart1.getPerihelion());
  }
}
// I got insprition here: https://rollbar.com/guides/java/how-to-throw-exceptions-in-java/