public class Message {
  public static void getMessage(int hour) {
    switch (hour) {
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
        MessageGoodMorning();
        break;
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
        MessageGoodAfernoon();
        break;
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 00:
      case 1:
      case 2:
      case 3:
      case 4:
        MessageGooodNinght();
        break;
      default:
        System.out.println("Hour error");
        break;
    }
  }

  public static void MessageGoodMorning() {
    System.out.println("Good Morning");
  }

  public static void MessageGoodAfernoon() {
    System.out.println("Good Afernoon");
  }

  public static void MessageGooodNinght() {
    System.out.println("Good Ninght");
  }
}
