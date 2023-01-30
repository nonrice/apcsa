public class Bird extends Animal {
    String species;
    boolean fly;
    double egg;

    Bird(String name, String sound, String species, boolean fly, double egg){
        super(name, sound);
        this.species = species;
        this.fly = fly;
        this.egg = egg;
    }

    public String getSpecie(){
        return species;
    }

    public double getEggSize(){
        return egg;
    }

    public boolean getCanFly(){
        return fly;
    }

    public String toString(){
        if (fly) return "can fly";
        return "cannot fly";
    }
}
