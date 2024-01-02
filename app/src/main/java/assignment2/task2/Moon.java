package assignment2.task2;

/**
 * The moon class.
 */
public class Moon {
  private String name;
  private int kmSize;

  /**
   * The Constructors of the class. 
   *
   * @param name The name of the moon.
   * @param kmSize The size of the moon.
   * @throws Exception A exception object includes a error description. 
   */
  public Moon(String name, int kmSize) throws Exception {
    setName(name);
    setKmSize(kmSize);
  }
  
  public String getName() {
    return name;
  }
  
  /**
   * A method which can set and validate the value.
   *
   * @param name The name of the plants and moons. 
   * @throws Exception A exception object includes a error description.
   */
  public void setName(String name) throws Exception {
    if (name == null) {
      throw new Exception("Please enter a valid name! ");
    }
    if (name.length() < 2) {
      throw new Exception("The name should be at least 2 characters long!");
    }
    this.name = name;
  }
  
  public int getKmSize() {
    return kmSize;
  }
  
  /**
   * A method which can set and validate the value of the size.
   *
   * @param kmSize The size of the moons.
   */
  public void setKmSize(int kmSize) throws Exception {
    if (kmSize == 0) {
      throw new Exception("Please enter a suitable number! ");
    }
    if (kmSize < 0) {
      throw new Exception("The size of the moon should be positive number!");
    }
    this.kmSize = kmSize;
  }
}
  
