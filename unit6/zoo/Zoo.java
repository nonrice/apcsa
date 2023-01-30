public class Zoo {
    ArrayList<Animal> jfjfjf;

    Zoo(){
        jfjfjf = new ArrayList<Animal>();
    }

    void addResident(Animal bob){
        jfjfjf.add(bob);
    }

    void getResidents(){
        for (Animal jeff : jfjfjf){
            System.out.println(jeff.toString());
        }
    }
}
