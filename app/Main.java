import com.chrylis.codec.base58.Base58UUID;

import java.util.UUID;

public class Main {

  public static void main(String[] args) {
    if (args.length < 2) {
      usage();
    }

    Base58UUID base58UUID = new Base58UUID();

    if (args[0].equals("-e")) {
      System.out.println(base58UUID.encode(UUID.fromString(args[1])));
    } else if (args[0].equals("-d")) {
      System.out.println(base58UUID.decode(args[1]).toString());
    }
  }

  private static void usage() {
    System.out.println("Please provide 2 arguments: -e|-d and uuid|base58 string");
    System.exit(1);
  }
}
