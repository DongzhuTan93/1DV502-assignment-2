package assignment2.task2;

import java.util.ArrayList;

/**
 * The second planet.
 */
public class Planet {
  private String name;
  private int position;
  private int aphelion;
  private int perihelion;
  private ArrayList<Moon> moons = new ArrayList<Moon>();
  
  /**
   * The Constructors of the class. 
   *
   * @param name The name of the plants and moons. 
   * @param position The position of the moons.
   * @param aphelion The aphelion of the planets.
   * @param perihelion The perihelion of the planets.
   */ 
  public Planet(String name, int position, int aphelion, int perihelion) throws Exception {
    setName(name);
    setAphelion(aphelion);
    setPerihelion(perihelion);
  }
      
  public String getName() {
    return name;
  }
  
  /**
   * A method which can set and validate the value.
   *
   * @param name The name of the plants and moons. 
   */
  public void setName(String name) throws Exception {
    if (name == null) {
      throw new Exception("Please enter a valid name! ");
    }
    if (name.length() < 2) {
      throw new Exception("The name should be at least 2 characters long! ");
    }
    this.name = name;
  }
  
  public int getPosition() {
    return position;
  }
  
  /**
   * A method which can set and validate the position value.
   *
   * @param position The position of the moons.
   */
  public void setPosition(int position) throws Exception {
    if (position == 0) {
      throw new Exception("Please enter a suitable number! ");
    }
    if (position < 0) {
      throw new Exception("The position can´t be negative! ");
    }
    this.position = position;
  }
  
  public int getAphelion() {
    return aphelion;
  }
  
  /**
   * A method which can set and validate the aphelion value.
   *
   * @param aphelion The aphelion of the planets.
   */
  public void setAphelion(int aphelion) throws Exception {
    if (aphelion == 0) {
      throw new Exception("Please enter a suitable number! ");
    }
    if (aphelion < 0) {
      throw new Exception("The number of aphelion should be positive! ");
    }
    this.aphelion = aphelion;
  }
  
  public int getPerihelion() {
    return perihelion;
  }
  
  /**
   * A method which can set and validate the perihelion value.
   *
   * @param perihelion The perihelion of the planets.
   */
  public void setPerihelion(int perihelion) throws Exception {
    if (perihelion == 0) {
      throw new Exception("Please enter a suitable number! ");
    }
    if (perihelion < 0) {
      throw new Exception("The number of perihelion should be positive! ");
    }
    this.perihelion = perihelion;
  }

  public Moon[] getMoons() {
    Moon[] moonArray = moons.toArray(new Moon[moons.size()]);
    return moonArray;
  }

  public void addMoon(Moon moon) {
    this.moons.add(moon);
  }
}
  

