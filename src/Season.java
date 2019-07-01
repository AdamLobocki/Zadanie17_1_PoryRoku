import java.util.Arrays;

public enum Season {
    SPRING("Wiosna", new String[] { "Marzec", "Kwiecień", "Maj" }),
    SUMMER("Lato", new String[] {"Czerwiec", "Lipiec", "Sierpień"}),
    AUTUM("Jesień", new String[] { "Wrzesień", "Październik", "Listopad"}),
    WINTER("Zima", new String[] {"Grudzień", "Styczeń", "Luty"});

    @Override
    public String toString() {
        return "Season{" +
                "months=" + Arrays.toString(months) +
                ", name='" + name + '\'' +
                '}';
    }

    private  String[] months;
    private  String name;

    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }
}
