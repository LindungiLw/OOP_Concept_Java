package polymorphism.practice.practice1;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Send to facebook: " + message);
    }
}
