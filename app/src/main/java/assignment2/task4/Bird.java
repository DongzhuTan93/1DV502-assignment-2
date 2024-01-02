package assignment2.task4;

/**
 * The bird class extends the animal class.
 *
 */
public class Bird extends Animal {
  private boolean isMigrant;
  private boolean canFly;
  private String nestType;      
    
  /**
   * The Constructors of the class. 
   *
   * @param name The birds name.
   * @param latinName The birds latin name.
   * @param weight  The birds weight.
   * @param isMigrant Determine if the birds is migrant.
   * @param canFly Determine if the birds can fly.
   * @param nestType The birds nest type.
   */
  public Bird(String name, String latinName, double weight,
        boolean isMigrant, boolean canFly, String nestType) {
          
    super(name, latinName, weight);
    this.isMigrant = isMigrant;
    this.canFly = canFly;
    this.nestType = nestType;
  } 
  
  public boolean getMigrant() {
    return isMigrant;
  }
  
  public void setMigrant(boolean isMigrant) {
    this.isMigrant = isMigrant;
  }
  
  public boolean getFly() {
    return canFly;
  }
  
  public void setFly(boolean canFly) {
    this.canFly = canFly;
  }
  
  public String getNestType() {
    return nestType;
  }
  
  public void setNestType(String nestType) {
    this.nestType = nestType;
  }

 
      
}
  
