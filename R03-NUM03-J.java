//  NUM03-J: Noncompliant Code
//   - Use integer types that can fully represent the possible range of unsigned data

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}