//  THI00-J: Noncompliant Code
//   - Do not invoke Thread.run()

public final class Foo implements Runnable {
  @Override public void run() {
    // ...
  }
 
  public static void main(String[] args) {
    Foo foo = new Foo();
    new Thread(foo).run();
  }
}