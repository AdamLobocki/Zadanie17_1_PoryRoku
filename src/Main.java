import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Season x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj porę roku");
        String month = scanner.nextLine();
switch (month){
    case "Zima":
        x = Season.WINTER;
        System.out.println(x.WINTER.toString());
        System.out.println();
        break;
    case "Wiosna":
        x = Season.SPRING;
        System.out.println(x.SPRING.toString());
        break;
    case "Lato":
        x = Season.SUMMER;
        System.out.println(x.SUMMER.toString());
        break;
    case "Jesień":
        x = Season.AUTUM;
        System.out.println(x.AUTUM.toString());
        break;
}


    }
}
