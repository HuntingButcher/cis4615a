//  MSC07-J: Noncompliant Code
//   - Prevent multiple instantiations of singleton objects

class MySingleton {
  private static final MySingleton instance = new MySingleton();
 
  private MySingleton() {   
    // Private constructor prevents instantiation by untrusted callers
  }
 
  public static synchronized MySingleton getInstance() {   
    return instance;
  }
}