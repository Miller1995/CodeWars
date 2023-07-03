
public class Banjo {

    public static void main(String[] args) {

        String name = "Ralf";
        System.out.println(Banjo.areYouPlayBanjo(name));
    }

    public static String areYouPlayBanjo(String name) {

        if (name.toLowerCase().startsWith("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}