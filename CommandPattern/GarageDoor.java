public class GarageDoor {

    String location = "";
    public GarageDoor(String location) {
        this.location = location;
    }
    public void up() {
        System.out.println("문 열리기");
    }

    public void down() {
        System.out.println("문 내리기");
    }

    public void stop() {
        System.out.println("멈추기");
    }

    public void lightOn() {
        System.out.println("불켜기");
    }

    public void lightOff() {
        System.out.println("불끄기");
    }
}
