package assignment2.task4;

/**
 * The abstract class of the animal.
 */
public abstract class Animal implements Comparable<Animal> {
 
  private String name;
  private String latinName;
  private double weight;
  
  
  /**
   * The Constructors of the class. 
   *
   * @param name The animals name.
   * @param latinName The animals latin name
   * @param weight The weight of the animals.
  
   */
  public Animal(String name, String latinName, double weight) {
    this.name = name;
    this.latinName = latinName;
    this.weight = weight;
    
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
  


  /**
   * Compare the animals latin name.
   *
   * @return Return an integer representing the character order.
   */
  @Override
    public int compareTo(Animal animal) {
    if ((this.getLatinName().compareTo(animal.getLatinName())) < 1) {   
      // The compareTo() method compares two strings lexicographically.
      return -1;
    } else if ((this.getLatinName().compareTo(animal.getLatinName())) > 1) {
      return 1;
    } else {
      return 0;
    } 
    //  I got inspiration here: https://www.w3schools.com/java/ref_string_compareto.asp
    // https://www.geeksforgeeks.org/compare-two-strings-lexicographically-in-java/
  }
}
  
