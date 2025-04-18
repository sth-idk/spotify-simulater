import musicplayer.*;

public class Main {
    public static void main(String[] args) {
        try {
            User dude1 = new User("dude 1", "dude123");
            User dude2 = new User("dude 2", "dude456");


            User TaylorSwift = new User("Taylor Swift" , "why Should I Know Her Password?");
            Music firstSong = new Music(TaylorSwift , "I Hate It Here");
            Music.allMusics.add(firstSong);

            User GracieAbrams = new User("Gracie Abrams" , "it's right i don't have taylor's pass but doesn't mean i don't have gracie's.");
            Music secondSong = new Music(GracieAbrams , "For Real This Time");
            Music.allMusics.add(secondSong);



            System.out.println("dude1 plays music as regular:");
            for (int i = 0; i < 5; i++) {
                dude1.playMusic(firstSong);
            }

            System.out.println("dude1 buys premium for 2 months:");
            dude1.buyPremium(dude1, 2);

            System.out.println("dude1 creates a playlist:");
            dude1.createPlaylist("Things that make me survive", dude1);


            Playlist myPlaylist = dude1.playlists.get(0);
            myPlaylist.addMusic("dude123", firstSong);
            myPlaylist.addMusic("dude123", secondSong);


            System.out.println("dude1 plays music as premium:");
            dude1.playMusic(secondSong);

        } catch (InvalidOperationException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}