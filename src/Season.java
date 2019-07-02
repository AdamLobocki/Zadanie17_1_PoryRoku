import java.util.Arrays;

public enum Season {
    SPRING("Wiosna", new String[] { "Marzec", "Kwiecień", "Maj" }),
    SUMMER("Lato", new String[] {"Czerwiec", "Lipiec", "Sierpień"}),
    AUTUM("Jesień", new String[] { "Wrzesień", "Październik", "Listopad"}),
    WINTER("Zima", new String[] {"Grudzień", "Styczeń", "Luty"});

    public String getName() {
        return name;
    }

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

    public  static Season fromName(String name){
        Season[] values = values();
        for(Season season:values){
            if(season.getName().equals(name))
                return season;
        }
        return  null;
    }

}
