import java.lang.annotation.Retention;

/**
 * Given an input string, write a function that returns the Run Length Encoded string for the input string.
 * 
 * For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”.
 */
public class RunLengthEncoding {


  public static void main(String[] args) {
    RunLengthEncoding rle = new RunLengthEncoding();
    String str = "wwwwaaadexxxxxxywww"; 
    String output = rle.printRLE(str);
    if (!"w4a3d1e1x6y1w3".equals(output)) {
      System.out.println("Output isn't correct!  Expected 'w4a3d1e1x6y1w3', but got " + output + "'");
    }
    System.out.println(output);

  }

  String printRLE(String str) {
    int cnt = 0;
    char lastChar = str.charAt(0);
    StringBuilder buf = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (c != lastChar) {
        buf.append(lastChar);
        buf.append(cnt);

        lastChar = c;
        cnt = 1;
      } else {
        cnt ++;
      }
    }

    buf.append(lastChar);
    buf.append(cnt);

    return buf.toString();
  }
}
