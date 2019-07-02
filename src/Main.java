import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Season x = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj porę roku");
        String month = scanner.nextLine();

        Season season = Season.fromName(month);
        System.out.println(season.toString());


    }
}
