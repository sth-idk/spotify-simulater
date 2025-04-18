package musicplayer;

public class RegularBehavior implements UserBehavior{
    int playingLimit = 5;

    @Override
    public void createPlaylist(String Title, User Owner) throws InvalidOperationException {

        throw new InvalidOperationException("get premium and create your favourite playlists.");

    }

    @Override
    public void playMusic(Music music) {

    }

    @Override
    public void buyPremium(User owner, int month) {

    }
}
