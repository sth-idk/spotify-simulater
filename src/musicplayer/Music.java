package musicplayer;

import java.util.ArrayList;

public class Music {
    String title;
    User singer;
    int numberOfStream = 0;
    public static ArrayList<Music> allMusics = new ArrayList<>();

    public Music(User singer , String title){
        this.singer = singer;
        this.title = title;
    }

    void play(Music music){
        System.out.println("you are streaming "+music.title+" from "+music.singer.username+" right now.");
        ++music.numberOfStream;
    }

    Music search(Music music){
        boolean toCheck = true;
        for (Music m : allMusics){
            if (m == music){
                return m;
            }
        }
        return null;
    }

    Music search(String title , User singer){
        for (Music m : allMusics){
            if (m.title.equalsIgnoreCase(title) && m.singer == singer){
                return m;
            }
        }
        return null;
    }
}
