public class Name {
    private String f, m, l;
    
    public Name(){
        f = m = l = "";
    }
    
    public Name(String f, String m, String l){
        this.f = f;
        this.m = m;
        this.l = l;
    }
    
    public String getFirst(){
        return f;
    }
    
    public String getMiddle(){
        return m;
    }
    
    public String getLast(){
        return l;
    }
    
    public String firstMiddleLast(){
        return f + " " + m + " " + l;
    }
    
    public boolean equals(Name a){
        return f.equalsIgnoreCase(a.getFirst()) && m.equalsIgnoreCase(a.getMiddle()) && l.equalsIgnoreCase(a.getLast());
    }
    
    public String initials(){
        char a='', b='', c='';
        if (f.length() > 0) a = Character.toUpperCase(f.charAt(0));
        if (m.length() > 0) b = Character.toUpperCase(m.charAt(0));
        if (l.length() > 0) c = Character.toUpperCase(l.charAt(0));
        return "" + a + b + c;
    }
}
    
