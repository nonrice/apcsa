public class Dolphin extends Animal {
    int iq;
    double lifespan;

    Dolphin(){
        super();
    }

    Dolphin(String name, String sound, int iq, double lifespan){
        super(name, sound);
        this.iq = iq;
        this.lifespan = lifespan;
    }

    public int getIQ(){
        return iq;
    }

    public double getLifespan(){
        return lifespan;
    }

    public String toString(){
        return "this lab sucks";
    }
}
