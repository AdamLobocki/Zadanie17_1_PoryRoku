import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Season x = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj porę roku");
        String month = scanner.nextLine();

        if (month.equals("Zima")) {
            x = Season.WINTER;
        } else if (month.equals("Wiosna")) {
            x = Season.SPRING;
        } else if (month.equals("Lato")) {
            x = Season.SUMMER;
        } else if (month.equals("Jesień")) {
            x = Season.AUTUM;
        }
        System.out.println(x.toString());
    }
}
