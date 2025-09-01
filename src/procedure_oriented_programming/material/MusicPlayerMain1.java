package procedure_oriented_programming.material;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("Start the music player");

        volume++;
        System.out.println("Music Player Volume:" + volume);

        volume++;
        System.out.println("Music Player Volume:" + volume);

        volume--;
        System.out.println("Music Player Volume:" + volume);

        System.out.println("Check the music player status");
        if (isOn) {
            System.out.println("Music Player ON, Volume:" + volume);
        } else {
            System.out.println("Music Player OFF");
        }

        isOn = false;
        System.out.println("Exit the music player");
    }
}
