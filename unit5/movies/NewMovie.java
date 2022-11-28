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
        for (int i=0; i<Math.min(s.length(), o.s.length()); i+=3){
            bool f = true;
            for (int j=0; j<3; ++j){
                if (s[i+j] != o.s[i+j]){
                    f = false;
                    break;
                }
            }
            if (f == true) ++match;
        }
        return match/(Math.max(s.length(), o.s.length())/3);
    }
}
