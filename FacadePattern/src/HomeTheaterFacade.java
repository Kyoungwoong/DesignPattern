public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("start to watch movie");

        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amp.on();
        amp.setStereoSound();
        amp.setStreamingPlayer(player);
        amp.setVolume(5);

        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("turn off movie");

        popper.off();

        lights.on();

        screen.up();

        projector.off();

        amp.off();

        player.stop();
        player.off();
    }
}
