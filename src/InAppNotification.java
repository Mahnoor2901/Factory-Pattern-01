public class InAppNotification implements Notification {

    @Override
    public boolean send(String recipient, String message) {
        System.out.println("[INAPP] To userId: " + recipient
                + " | Message: " + message);
                return true;
    }

}
