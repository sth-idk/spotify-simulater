package musicplayer;

import java.util.ArrayList;

public class User {
    String username;
    String password;
    static ArrayList<User> followerList = new ArrayList<>();
    static ArrayList<User> followingList = new ArrayList<>();
    UserBehavior behavior;
}
