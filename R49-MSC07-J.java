//  MSC07-J: Noncompliant Code
//   - Prevent multiple instantiations of singleton objects

class MySingleton {
  private static MySingleton instance;
 
  protected MySingleton() {   
    instance = new MySingleton();
  }
 
  public static synchronized MySingleton getInstance() {   
    return instance;
  }
}