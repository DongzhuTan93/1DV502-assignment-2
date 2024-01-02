package assignment2.task4;

/**
 * The mammal class extends the animal class.
 *
 */
public class Mammal extends Animal {
  private String furColor;
  private boolean hasWinterFur;
     
  /**
   * The Constructors of the class. 
   *
   * @param name The mammals name.
   * @param latinName The mammals latin name.
   * @param weight The mammals weight.
   * @param furColor The mammals fur color.
   * @param hasWinterFur Determine if an animal has winter fur.
   */
  public Mammal(String name, String latinName, double weight, 
       String furColor, boolean hasWinterFur) {
  
    super(name, latinName, weight);
    this.furColor = furColor;
    this.hasWinterFur = hasWinterFur;

  } 
  
  public String getFurColor() {
    return furColor;
  } 
  
  public void setFurColor(String furColor) {
    this.furColor = furColor;
  }  
  
  public boolean getWinterFur() {
    return hasWinterFur;
  }  
  
  public void setWinterFur(boolean hasWinterFur) {
    this.hasWinterFur = hasWinterFur;
  }

 
  
}
  
