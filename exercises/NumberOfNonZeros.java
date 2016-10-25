public class NumberOfNonZeros {
  public static void main(String[] args) {
    System.out.println();
    int numofnonzeros_1 = numOfNonZeros("50678041");
    System.out.println("numofnonzeros_1 = " + numofnonzeros_1);

    int numofnonzeros_2 = numOfNonZeros("56784167");
    System.out.println("numofnonzeros_2 = " + numofnonzeros_2);

    int numofnonzeros_3 = numOfNonZeros("20348102309506250");
    System.out.println("numofnonzeros_3 = " + numofnonzeros_3);
    }
  
  public static int numOfNonZeros(String str) {
    int nonZeros = 0;
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) != '0') {
        nonZeros++;
      }
    }
    return nonZeros;
  }
}
