//  IDS03-J: Noncompliant Code
//   - Do not compare or inspect the string representation of floating-point values

int i = 1;
BigDecimal d = new BigDecimal(Double.valueOf(i / 1000.0).toString());
if (d.compareTo(new BigDecimal("0.001")) == 0) {
  // ...
}