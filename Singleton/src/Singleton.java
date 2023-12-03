
// Classic Implemention
public class Singleton {

  private static Singleton instance = null;

  private Singleton() {}

  public static Singleton getInstance() {
    // Check if the instance is already created
    if(instance == null) {
      // Create instance
      instance = new Singleton();
    }
    // Return the old one if already created
    return instance;
  }
}
