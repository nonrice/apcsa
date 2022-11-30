public class Song {
    private String n;
    private String a;
    private double p;
    
    public Song(String n, String a, String p){
        this.n = n;
        this.a = a;
        this.p = p;
    }
    
    public String toString(){
        return "song: " + name + ", artist: " + artist + ", playTime: " + playTime;
    }
    
    public double getPlayTime(){
        return p;
    }
    
    public String getArtist(){
        return a;
    }
    
    public String getName(){
        return n;
    }
}

    
