public interface Notification {
/**
* Send a message to a recipient (simple simulation).
* @param recipient where to send (email address, phone, or device id)
* @param message the message body
*/


boolean send(String recipient, String message);
}