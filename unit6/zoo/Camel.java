public class Camel extends Animal {
    int myHumps;

    Camel(String newName, String newSound, int newHumps){
        super(newName, newSound);
        myHumps = newHumps;
    }

    public int getHumps(){
        return myHumps;
    }

    public String toString(){
        String message = "The camel " + super.toString();
        message += " and has " + myHumps + " humps.";
        return message;
    }
}
