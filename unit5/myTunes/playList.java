public class Playlist {
    private List<Song> a;
    private String n;
    
    public Playlist(String name){
        a = new ArrayList<Song>();
        this.n = name;
    }
    
    public String playlistName(){
        return n;
    }
    
    public List<Song> getList(){
        return a;
    }
    
    public boolean addSong(Song s){
        return a.add(s);
    }
    
    public boolean removeSong(Song s){
        return a.remove(s);
    }
    
    public int totalSongs(){
        return a.size();
    }
    
    public double playListTime(){
        double t = 0;
        for (Song s : a){
            t += s.getPlayTime():
        }
        return t;
    }
    
    public boolean isSongInPlaylist(String s){
        for (Song sa : a){
            if (sa.getName().equals(s)){
                return true;
            }
        }
        return false;
    }
    
    public void songsByArtist(String n){
        for (Song s : a){
            if (s.getArtist().equals(n)) System.out.println(s.getName());
        }
    }
    
    public boolean addSongsFrom(Playlist p){
        for (Song s : p){
            a.add(s);
        }
    }
}
            
