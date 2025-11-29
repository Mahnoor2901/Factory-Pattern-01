public enum NotificationType {

    EMAIL(EmailNotification.class),
    SMS(SMSNotification.class),
    PUSH(PushNotification.class),
    INAPP(InAppNotification.class);   // keeps compatibility with your demo

    private final Class<? extends Notification> clazz;

    NotificationType(Class<? extends Notification> clazz) {
        this.clazz = clazz;
    }

    public Class<? extends Notification> getClazz() {
        return clazz;
    }

    // Utility: Convert string -> enum safely
    public static NotificationType fromString(String type) {
        try {
            return NotificationType.valueOf(type.trim().toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
}
