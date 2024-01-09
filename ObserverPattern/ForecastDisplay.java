public class ForecastDisplay implements Observer, DisplayElement{
    private float pressure;
    private float humidity;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;

        display();
    }

    public void update() {
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();
    }

    public void display() {
        System.out.println("Forecast Display");
        System.out.println("pressure = " + pressure + " humidity = " + humidity);

    }
}
