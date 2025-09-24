package polymorphism.practice.practice1;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Send to sms: " + message);}
}
