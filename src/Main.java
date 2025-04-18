import musicplayer.*;

public class Main {
    public static void main(String[] args) {
        try {
            User dude = new User("dude", "dude123");


            User TaylorSwift = new User("Taylor Swift" , "why Should I Know Her Password?");
            Music firstSong = new Music(TaylorSwift , "I Hate It Here");
            Music.allMusics.add(firstSong);


            User GracieAbrams = new User("Gracie Abrams" , "it's right i don't have taylor's pass but doesn't mean i don't have gracie's.");
            Music secondSong = new Music(GracieAbrams , "I Told You Things");
            Music.allMusics.add(secondSong);

            
            
            //dude plays music as regular:
            for (int i = 0; i < 5; i++) {
                dude.playMusic(firstSong);
            }

            
            //dude buys premium for 2 months:
            dude.buyPremium(dude, 2);


            //dude creates a playlist:
            dude.createPlaylist("Things that make me survive this life", dude);

            Playlist dudePlaylist = dude.playlists.get(0);
            dudePlaylist.addMusic("dude123", firstSong);
            dudePlaylist.addMusic("dude123", secondSong);


            //dude plays music as premium:
            dude.playMusic(secondSong);

            //dude plays playlist as premium
            dudePlaylist.playPlaylist(dudePlaylist);

            
        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
