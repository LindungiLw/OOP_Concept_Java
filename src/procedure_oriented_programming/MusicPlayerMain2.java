package procedure_oriented_programming;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("Start the music player");

        data.volume++;
        System.out.println("Music Player Volume:" + data.volume);

        data.volume++;
        System.out.println("Music Player Volume:" + data.volume);


        data.volume--;
        System.out.println("Music Player Volume:" + data. volume);
        System.out.println("Check the music player status");
        if (data.isOn) {
            System.out.println("Music Player ON, Volume:" + data.volume);
        } else {
            System.out.println("Music Player OFF");
        }
        data.isOn = false;
        System.out.println("Exit the music player");
    }
}
