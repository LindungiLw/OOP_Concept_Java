package procedure_oriented_programming;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("Start the music player ");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("Exit the music player");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("Music Player Volume:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("Music Player Volume:" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("Check the music player status");
        if (data.isOn) {
            System.out.println("Music Player ON, Volume:" + data.volume);
        } else {
            System.out.println("Music Player Off");
        }
    }
}