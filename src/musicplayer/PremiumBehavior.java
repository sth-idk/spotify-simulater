package musicplayer;

public class PremiumBehavior implements UserBehavior{
    int month;

    public PremiumBehavior(int month) {
        this.month = month;
    }

    @Override
    public void createPlaylist(String title, User owner) {
        Playlist playlist = new Playlist(owner , title);
        owner.playlists.add(playlist);
    }

    @Override
    public void playMusic(Music music) {
        music.play(music);
    }

    @Override
    public void buyPremium(User owner, int month) {
        this.month += month;
    }
}
