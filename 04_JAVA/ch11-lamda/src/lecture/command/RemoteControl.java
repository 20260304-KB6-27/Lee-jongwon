package lecture.command;

public class RemoteControl {

    private Command command;

    //Setter
    public void setCommand(Command command) {
        this.command = command;
    }

    //단순히 command 실행만 함
    public void pressButton() {
        command.execute();
    }
}
