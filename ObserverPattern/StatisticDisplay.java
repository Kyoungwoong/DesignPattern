public class StatisticDisplay implements Observer, DisplayElement {
    private float temperature;
    private float pressure;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;

        display();
    }

    public void display() {
        System.out.println("Statistic Display");
        System.out.println("temperature = " + temperature + " pressure = " + pressure);

    }
}
