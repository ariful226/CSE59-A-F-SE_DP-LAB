public class Main {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        NotificationService notification = new NotificationService(email);

        notification.alertUser("Your account has been updated.");

        MessageSender sms = new SMSSender();
        NotificationService smsNotification = new NotificationService(sms);

        smsNotification.alertUser("Your OTP is 1234.");
    }
}


interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {

    private MessageSender sender;

    // Dependency Injection
    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void alertUser(String msg) {
        sender.sendMessage(msg);
    }
}
