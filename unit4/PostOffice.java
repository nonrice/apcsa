public class PostOffice {
    private Letter a[];
    
    public PostOffice(int sz){
        a = new Letter[sz];
    }
    
    public boolean placeLetter(Letter x, int p){
        if (p<0 || p>=a.length || a[p]!=null) return false;
        a[p] = x;
        return true;
    }
    
    public String retrieveMsg(int p){
        if (p<0 || p>=a.length) return "Box does not exist!";
        if (a[p] == null) return "Empty!";
        return a[p].getMsg();
    }
    
    public Letter findSender(String s){
        for (Letter v : a) if (v!=null && v.getSender().equals(s)) return v;
        return null;
    }
}
    
