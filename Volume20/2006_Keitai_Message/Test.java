import java.io.*;

class Test {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Input  : ");
    String str = br.readLine();
    System.out.println("Output : " + str);

    /*
    int[] numArray = new int[str.length()];

    for (int i = 0; i < str.length(); i++) {
      String strPart = String.valueOf(str.charAt(i));
      numArray[i] = Integer.parseInt(strPart);
    }

    System.out.println("文字列strの長さ: " + str.length());
    System.out.println("配列numArrayの要素数: " + numArray.length);

    for (int i = 0; i < numArray.length; i++) {
      System.out.print(numArray[i]);
    }
    */
  }
}
