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
}
