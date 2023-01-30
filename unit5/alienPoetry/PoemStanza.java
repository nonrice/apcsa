import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class PoemStanza {
    private ArrayList<PoemLine> a;
    
    public PoemStanza(ArrayList<PoemLine> list){
        a = list;
    }
    
    public String convertToAlienLine(String s){
        String[] w = s.split(" ");
        Collections.reverse(Arrays.asList(w));
        return String.join(" ", w);
    }
    
    public ArrayList<String> convertToAlienStanza(){
        String r[] = new String[a.size()];
        
        for (int i=0; i<a.size(); ++i) r[i] = convertToAlienLine(a.get(i).getEnglishLine())+" ";
        ArrayList<String> rt = new ArrayList<String>(Arrays.asList(r));
        Collections.reverse(rt);
        return rt;
    }
}
        
     
