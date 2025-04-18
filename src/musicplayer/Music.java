package musicplayer;

import java.util.ArrayList;

public class Music {
    String title;
    User singer;
    int numberOfStream = 0;
    static ArrayList<Music> allMusics = new ArrayList<>();

    void play(Music music){
        System.out.println("you are streaming "+music+" right now.");
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
