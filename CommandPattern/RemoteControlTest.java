public class RemoteControlTest {
    public static void main(String[] args) {
        // Light 커맨드 객체
        SimpleRemoteControl remote = new SimpleRemoteControl(); // invoker
        Light light = new Light(); // receiver
        LightOnCommand lightOn = new LightOnCommand(light); // command

        remote.setCommand(lightOn); // invocker <- command
        remote.buttonWasPressed();

        // Garage 커맨드 객체
        Garage garage = new Garage();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garage);

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
