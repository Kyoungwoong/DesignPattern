public class Test {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("amp");
        Tuner tuner = new Tuner("tuner", amp);
        StreamingPlayer player = new StreamingPlayer("cd", amp);
        Projector projector = new Projector("proj", player);
        Screen screen = new Screen("screen");
        TheaterLights lights = new TheaterLights("light");
        PopcornPopper popper = new PopcornPopper("popcorn");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheaterFacade.watchMovie("어바웃타임");
        homeTheaterFacade.endMovie();
    }
}
