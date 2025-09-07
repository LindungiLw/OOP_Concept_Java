package final_;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("Max Number of Participants " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    private static void process(int currentUserCount) {
        System.out.println("Number of Participants :"
                + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("Register as a waitlist.");
        } else {
            System.out.println("Join the game.");
        }
    }
}
