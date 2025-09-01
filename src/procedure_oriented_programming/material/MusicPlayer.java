package procedure_oriented_programming.material;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("Start the music player ");
    }

    void off() {
        isOn = false;
        System.out.println("Exit the music player ");
    }

    void volumeUp() {
        volume++;
        System.out.println("Music Player Volume: " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("Music Player Volume: " + volume);
    }
    void showStatus() {
        System.out.println("Check the music player status");
        if (isOn) {
            System.out.println("Music Player ON, Volume:" + volume);
        } else {
            System.out.println("Music Player OFF");
        }
    }
}
