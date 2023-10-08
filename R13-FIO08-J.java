//  FIO08-J: Noncompliant Code
//   - Distinguish between characters or bytes read from a stream and -1

FileInputStream in;
// Initialize stream
byte data;
while ((data = (byte) in.read()) != -1) {
  // ...
}