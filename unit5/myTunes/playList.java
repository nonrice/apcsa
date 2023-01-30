import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> a;
    private String n;
    
    public Playlist(String name){
        a = new ArrayList<Song>();
        this.n = name;
    }
    
    public String playlistName(){
        return n;
    }
    
    public ArrayList<Song> getList(){
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
    
    public double playlistTime(){
        double t = 0;
        for (Song s : a){
            t += s.getPlayTime();
        }
        return t;
    }
    
    public boolean isSongInPlaylist(String s){
        for (Song sa : a){
            if (sa.getSongName().equals(s)){
                return true;
            }
        }
        return false;
    }
    
    public void songsByArtist(String n){
        for (Song s : a){
            if (s.getArtist().equals(n)) System.out.println(s.toString());
        }
    }
    
    public boolean addSongsFrom(Playlist p){
        for (Song s : p.getList()){
            a.add(s);
        }
        if (p.getList().size() == 0) return false;
        return true;     
    }
}
