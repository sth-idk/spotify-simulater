package musicplayer;

import java.util.ArrayList;

import static musicplayer.User.allUsers;

public class Playlist {
    ArrayList<Music> playlist = new ArrayList<>();
    User owner;
    String title;


    public Playlist(User owner , String title){
        this.owner = owner;
        this.title = title;
    }

    void editTitle(String password , Music music , String newTitle) throws InvalidOperationException{
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

    public void addMusic(String password, Music newMusic) throws InvalidOperationException{
        boolean processSucceeded = false;
        boolean toCheck = true;
        for (User u : allUsers){
            if (u.password.equals(password)){
                for (Music m : playlist){
                    if (m == newMusic){
                        throw new InvalidOperationException("this music already exists.");
                    }
                }
                playlist.add(newMusic);
                processSucceeded = true;
                break;
            }
        }
        if (processSucceeded){
            throw new InvalidOperationException("this password is wrong.");
        }
    }

    void removeMusic(String password , Music music) throws InvalidOperationException{
        boolean processSucceeded = false;
        boolean toCheck = true;
        for (User u : allUsers){
            if (u.password.equals(password)){
                for (Music m : playlist){
                    if (m == music){
                        playlist.remove(m);
                        toCheck = false;
                        break;
                    }
                }
                if (!(toCheck)){
                    throw new InvalidOperationException("this music does not exist.");
                }
                processSucceeded = true;
                break;
            }
        }
        if (processSucceeded){
            throw new InvalidOperationException("this password is wrong.");
        }
    }
}
