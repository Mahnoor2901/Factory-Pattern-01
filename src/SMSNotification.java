public class SMSNotification implements Notification {
@Override
public boolean send(String recipient, String message) {
// Simulate sending SMS
System.out.println("[SMS] To: " + recipient + " | Message: " + message);
if(recipient == null || !recipient.startsWith("+")){
    return false;
}
return false;
}
}