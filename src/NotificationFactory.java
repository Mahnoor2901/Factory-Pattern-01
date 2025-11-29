public class NotificationFactory {
/**
* Create a Notification object based on type.
* Accepts case-insensitive strings: "EMAIL", "SMS", "PUSH".
* Returns null for unknown types (simple demo behavior).
*/
public Notification getNotification(String type) {
      try {
            NotificationType notificationType = NotificationType.fromString(type);

            if (notificationType == null) {
                return null;
            }

            // Reflection: create instance
            return notificationType
                    .getClazz()
                    .getDeclaredConstructor()
                    .newInstance();

        } catch (Exception e) {
            // Lab requirement: convert all failures into null
            return null;
        }
// if (type == null) return null;
// String key = type.trim().toUpperCase();
// switch (key) {
// case "EMAIL":
// return new EmailNotification();
// case "SMS":
// return new SMSNotification();
// case "PUSH":
// return new PushNotification();
// case "INAPP":
// return new InAppNotification();
// default:
// return null;
// }

      
    }
}
