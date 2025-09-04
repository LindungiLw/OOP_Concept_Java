package access_modifier.classlevel;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        System.out.println("Modify direct access to volume field");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
