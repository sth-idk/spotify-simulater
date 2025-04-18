package musicplayer;

import java.util.ArrayList;

public class User {
    String username;
    String password;
    ArrayList<User> followerList = new ArrayList<>();
    ArrayList<User> followingList = new ArrayList<>();
    UserBehavior behavior;
    public ArrayList<Playlist> playlists = new ArrayList<>();
    static ArrayList<User> allUsers = new ArrayList<>();

    public User(String username , String password) {
        this.username = username;
        this.password = password;
        this.behavior = new RegularBehavior();
        allUsers.add(this);
    }


    void follow(User user){
        followingList.add(user);
    }

    public void createPlaylist(String title) throws InvalidOperationException {
        this.behavior.createPlaylist(title, this);
    }

    public void playMusic(Music music) throws InvalidOperationException {
        this.behavior.playMusic(music);
    }

    public void buyPremium(User owner, int month){
        this.behavior.buyPremium(owner , month);
    }
}
