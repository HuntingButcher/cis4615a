//  FIO08-J: Noncompliant Code
//   - Distinguish between characters or bytes read from a stream and -1

FileInputStream in;
// Initialize stream
int inbuff;
byte data;
while ((inbuff = in.read()) != -1) {
  data = (byte) inbuff;
  // ... 
}