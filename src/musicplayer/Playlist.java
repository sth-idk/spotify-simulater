package musicplayer;

import java.util.ArrayList;

import static musicplayer.User.allUsers;

public class Playlist {
    ArrayList<Music> playlist = new ArrayList<>();
    User owner;

    void editTitle(String password , Music music , String newTitle){
        boolean toCheck = true;
        for (User u : allUsers){
            if (u.password.equals(password)){
                music.title = newTitle;
                toCheck = false;
                break;
            }
        }
        if (!(toCheck)){
            throw new InvalidOperationException("this password is wrong.");
        }
    }


}
