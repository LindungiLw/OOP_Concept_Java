package access_modifier.classlevel;

public class Speaker {
    int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if (volume >= 100){
            System.out.println("The volume cannot be increased. This is the maximum volume.");
        } else {
            volume += 10;
            System.out.println("Increases volume by 10.");
        }
    }
    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown Calls");
    }
    void showVolume() {
        System.out.println("Current Volume:" + volume);
    }
}
