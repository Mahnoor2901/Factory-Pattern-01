import java.util.Arrays;
import java.util.List;
public class FactoryPatternDemo {
     static class Notifier {

        static void notify(Notification notifier,
                            String recipient,
                            String message) {

            boolean success = notifier.send(recipient, message);

            if (success) {
                System.out.println("ACK");
            } else {
                System.out.println("NACK");
            }
        }
    }
public static void main(String[] args) {
NotificationFactory factory = new NotificationFactory();
// Simulated notification requests: type, recipient, message
List<String[]> requests = Arrays.asList(
new String[] {"email", "alice@example.com", "Welcome to the course!"},
new String[] {"SMS", "923001234567", "Class starts at 10:00 AM"},
new String[] {"Push", "device-abc-123", "Assignment due tomorrow"},
new String[] {"fax", "1234", "This will show unknown"},
new String[] {"InApp", "User-8225", "This is InApp Notificatiion"}
);
for (String[] req : requests) {
String type = req[0];
String recipient = req[1];
String message = req[2];
Notification notifier = factory.getNotification(type);
System.out.print("Request: " + type + " -> ");
  if (notifier != null) {
                Notifier.notify(notifier, recipient, message);
            } else {
                System.out.println("No such notification channel: " + type);
            }
        }
}
}