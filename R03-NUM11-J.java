//  IDS03-J: Noncompliant Code
//   - Do not compare or inspect the string representation of floating-point values

int i = 1;
String s = Double.valueOf(i / 1000.0).toString();
if (s.equals("0.001")) {
  // ...
}