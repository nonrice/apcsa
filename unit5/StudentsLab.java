import java.util.ArrayList;
import java.util.Collections;

public class StudentsLab {
    public static void printList(ArrayList<String> a){
        int i=1;
        for (String s : a){
            System.out.println(i++ + ". " + s);
        }
    }
    
    public static void removeCh(ArrayList<String> a, char ch){
        for (int i=0; i<a.size(); ++i){
            if (a.get(i).charAt(0) == ch){
                a.remove(i);
                --i;
            }
        }
    }
    
    public static void addArray(ArrayList<String> a, String[] b){
        for (String s : b) a.add(s);
    }
    
    public static void replaceName(ArrayList<String> a, String s, String t){
        for (int i=0; i<a.size(); ++i){
            if (a.get(i).equals(s)) a.set(i, new String(t));
        }
    }
    
    public static void removeDup(ArrayList<String> a){
        for (int i=a.size()-1; i>=0; --i){
            if (a.indexOf(a.get(i)) != i && a.indexOf(a.get(i))!=-1){
                a.remove(i);
            }
        }
    }
    
    public static ArrayList<String> mergeLists(ArrayList<String> a, ArrayList<String> b){
        ArrayList<String> c = new ArrayList<String>();
        c.addAll(a);
        c.addAll(b);
        removeDup(c);
        Collections.sort(c);
        return c;
    }
}
