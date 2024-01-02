package assignment2.task4;

/**
 * The reptile class extends the animal class.
 *
 */
public class Reptile extends Animal {
  private String habitat;
  private boolean isPoisonous;
     
  /**
   *The Constructors of the class. 
   *
   * @param name The reptiles name.
   * @param latinName The reptiles latin name
   * @param weight The the weight of the reptiles.
   * @param habitat The reptiles habits.
   * @param isPoisonous Determine whether it is a poisonous animal.
   */
  public Reptile(String name, String latinName, double weight,
           String habitat, boolean isPoisonous) {
  
    super(name, latinName, weight);
    this.habitat = habitat;
    this.isPoisonous = isPoisonous;
    
  } 
  
  public String getHabitat() {
    return habitat;
  }
  
  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }
  
  public boolean getPoisonous() {
    return isPoisonous;
  }
  
  public void setPoisonous(boolean isPoisonous) {
    this.isPoisonous = isPoisonous;
  }


}