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
        boolean processSucceedNot = true;
        boolean toCheck = true;
        for (User u : allUsers){
            if (u.password.equals(password)){
                for (Music m : playlist){
                    if (m == newMusic){
                        throw new InvalidOperationException("this music already exists.");
                    }
                }
                playlist.add(newMusic);
                processSucceedNot = false;
                break;
            }
        }
        if (processSucceedNot){
            throw new InvalidOperationException("this password is wrong.");
        }
    }

    void removeMusic(String password , Music music) throws InvalidOperationException{
        boolean processSucceedNot = true;
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
                processSucceedNot = false;
                break;
            }
        }
        if (processSucceedNot){
            throw new InvalidOperationException("this password is wrong.");
        }
    }

    Music searchInPlaylist(Music music){
        boolean toCheck = true;
        for (Music m : playlist){
            if (m == music){
                return m;
            }
        }
        return null;
    }

    Music searchInPlaylist(String title , User singer){
        for (Music m : playlist){
            if (m.title.equalsIgnoreCase(title) && m.singer == singer){
                return m;
            }
        }
        return null;
    }

    public void playPlaylist(Playlist playlist1) throws InvalidOperationException {
        System.out.println("you are streaming playlist "+"\""+playlist1.title+"\""+" from "+playlist1.owner.username+" right now:");
        for (Music m : playlist){
            owner.playMusic(m);
        }
    }
    
}
