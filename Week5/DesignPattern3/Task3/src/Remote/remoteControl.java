package src.Remote;

public class remoteControl {
    command command;

    public void setCommand(command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
