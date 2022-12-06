public class NewMovie {
    private String s;
    
    public NewMovie(String s){
        this.s = s;
    }
    
    public String toString(){
        return s;
    }
    
    public double likenessScore(NewMovie o){
        double match = 0;
        for (int i=0; i<s.length(); i+=3){
            boolean f = true;
            for (int j=0; j<3; ++j){
                if (s.charAt(i+j) != o.s.charAt(i+j)){
                    f = false;
                    break;
                }
            }
            if (f == true) ++match;
        }
        return match/(s.length()/3);
    }
}
