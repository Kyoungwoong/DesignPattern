public class RemoteControlTest {
    public static void main(String[] args) {
        // Light 커맨드 객체
        SimpleRemoteControl remote = new SimpleRemoteControl(); // invoker
        Light light = new Light("1"); // receiver
        LightOnCommand lightOn = new LightOnCommand(light); // command

        remote.setCommand(lightOn); // invocker <- command
        remote.buttonWasPressed();

        // Garage 커맨드 객체
        GarageDoor garageDoor = new GarageDoor("2");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
