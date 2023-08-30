package org.fawry.Week5.DesignPattern3.Task3.Message;

public class sendEmailmessage implements message {
    public String getMessage(boolean smoke) {
        if(smoke)
            return "Sending Email message to the owner: smoke detected";
        else
            return "Sending Email message to the owner: motion detected";
    }
}
