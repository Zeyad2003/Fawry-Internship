package src.Message;

public class sendSMSmessage implements message {
    @Override
    public String getMessage(boolean smoke) {
        if(smoke)
            return "Sending SMS message to the owner: smoke detected";
        else
            return "Sending SMS message to the owner: motion detected";
    }
}
