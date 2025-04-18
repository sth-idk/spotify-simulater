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

    void follow(User user){
        followingList.add(user);
    }
}
