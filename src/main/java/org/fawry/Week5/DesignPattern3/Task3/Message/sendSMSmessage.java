package org.fawry.Week5.DesignPattern3.Task3.Message;

public class sendSMSmessage implements message {
    @Override
    public String getMessage(boolean smoke) {
        if(smoke)
            return "Sending SMS message to the owner: smoke detected";
        else
            return "Sending SMS message to the owner: motion detected";
    }
}
