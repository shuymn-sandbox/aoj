import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    String[][] strButton = {
      {".",",","!","?"," "},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}
    };

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int num = Integer.parseInt(str);

    String[] strArray = new String[num];
    int[][] numArray = new int[num][];

    for (int i = 0; i < num; i++) {
      strArray[i] = br.readLine(); 
      numArray[i] = new int[strArray[i].length()];

      for (int j = 0; j < strArray[i].length(); j++) {
        String str1 = String.valueOf(strArray[i].charAt(j));
        numArray[i][j] = Integer.parseInt(str1);
      }
    }

    String[][] strAnswer = new String[num][76];
    for (int i = 0; i < num; i++) {
      int num1 = 0;

      for (int j = 0; j < numArray[i].length; j++) {
        if (numArray[i][j] != 0) {
          int count = 1;
          int k;
          for (k = 0; numArray[i][j+k+1] != 0; k++) {
            count++;
          }

          int num2 = numArray[i][j] - 1;
          int num3;
          if (count % strButton[num2].length == 0) {
            num3 = strButton[num2].length - 1;
          }
          else {
            num3 = count % strButton[num2].length - 1;
          }

          strAnswer[i][num1] = strButton[num2][num3];

          num1++;
          j += k + 1;
        }
      }
    }

    for (int i = 0; i < num; i++) {
      for (int j = 0; strAnswer[i][j] != null; j++) {
        System.out.print(strAnswer[i][j]);
      }
      System.out.print("\n");
    }
  }
}
