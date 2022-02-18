public class Lending {
  public static int getTwoPortion() {
    return 2;
  }

  public static int getThreePortion() {
    return 3;
  }

  public static double getRateTwoPortion() {
    return 0.3;
  }

  public static double getRateThreePortion() {
    return 0.45;
  }

  public static void calculator(double number, int portion) {
    if (portion == 2) {

      double valueFinal = number + (number * getRateTwoPortion());

      System.out.println("Value final in lending to twio 2 portion: R$ " + valueFinal);
    } else if (portion == 3) {
      double valueFinal = number + (number * getRateThreePortion());

      System.out.println("Value final in lending to three portion R$ " + valueFinal);
    } else {
      System.out.println("Value error");
    }

  }
}
