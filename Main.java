import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner in = new Scanner(new File("test.in"));
    PrintWriter out = new PrintWriter("test.out");
    while (in.hasNextInt()) {
      out.println(in.nextInt()+1);
    }
    in.close();
    out.close();

    }
}
