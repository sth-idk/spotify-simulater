package musicplayer;

import java.util.ArrayList;

public class User {
    String username;
    String password;
    ArrayList<User> followerList = new ArrayList<>();
    ArrayList<User> followingList = new ArrayList<>();
    UserBehavior behavior;
    ArrayList<Playlist> playlists = new ArrayList<>();
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

    void createPlaylist(String title , User owner){
        this.behavior.createPlaylist(title, owner);
    }

    void playMusic(Music music){
        this.behavior.playMusic(music);
    }

    void buyPremium(User owner , int month){
        this.behavior.buyPremium(owner , month);
    }
}
