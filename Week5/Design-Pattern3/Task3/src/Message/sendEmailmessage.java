package src.Message;

public class sendEmailmessage implements message {
    public String getMessage(boolean smoke) {
        if(smoke)
            return "Sending Email message to the owner: smoke detected";
        else
            return "Sending Email message to the owner: motion detected";
    }
}
