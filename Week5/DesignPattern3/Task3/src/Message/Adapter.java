package src.Message;

public class Adapter {
    static sendSMSmessage sms = new sendSMSmessage();
    static sendEmailmessage email = new sendEmailmessage();

    public static void sendSMS(boolean smoke) {
        System.out.println(sms.getMessage(smoke));
    }

    public static void sendEmail(boolean smoke) {
        System.out.println(email.getMessage(smoke));
    }

    public static void sendAll(boolean smoke) {
        sendSMS(smoke);
        sendEmail(smoke);
    }
}
