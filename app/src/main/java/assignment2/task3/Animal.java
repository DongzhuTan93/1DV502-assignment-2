package assignment2.task3;

/**
 * The abstract class of the animal.
 */
public abstract class Animal {
  private String name;
  private String latinName;
  private double weight;
  protected String sound;

  /**
   * The Constructors of the class. 
   *
   * @param name The animals name.
   * @param latinName The animals latin name
   * @param weight The weight of the animals.
   */
  public Animal(String name, String latinName, double weight, String sound) {
    this.name = name;
    this.latinName = latinName;
    this.weight = weight;
    this.sound = sound;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLatinName() {
    return latinName;
  }

  public void setLatinName(String latinName) {
    this.latinName = latinName;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public abstract String makeSound();

}
