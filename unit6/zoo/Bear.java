public class Bear extends Animal {
    String color;

    Bear(){
        super();
    }

    Bear(String name, String sound, String color){
        super(name, sound);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return super.toString() + " " + color + " This sucks";
    }
}
