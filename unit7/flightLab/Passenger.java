public class Passenger {
    private String name;
    public Passenger(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        if (name.equals("")) return "";
        return name;
    }
}