public class EmailNotification implements Notification {
@Override
public boolean send(String recipient, String message) {
// Simulate sending email
System.out.println("[EMAIL] To: " + recipient + " | Message: " + message);
return true;
}
}