package musicplayer;

public class PremiumBehavior implements UserBehavior{
    int month;

    public PremiumBehavior(int month) {
        this.month = month;
    }

    @Override
    public void createPlaylist(String Title, User Owner) {
        Playlist playlist = new Playlist();
    }

    @Override
    public void playMusic(Music music) {

    }

    @Override
    public void buyPremium(User owner, int month) {
        this.month += month;
    }
}
