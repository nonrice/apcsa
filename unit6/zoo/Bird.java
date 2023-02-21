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
        String msg = "";
        if (fly) msg += "can fly";
        else msg += "cannot fly";
        return super.toString() + " " + msg +  " " + egg + " " + species + " this lab so dumb";
    }
}
