public class PushNotification implements Notification {
@Override
public boolean send(String recipient, String message) {
// Simulate push notification
System.out.println("[PUSH] To device: " + recipient + " | Message: " + message);
return true;
}
}