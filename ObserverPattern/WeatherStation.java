public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        System.out.println("========================================================");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("========================================================");
        weatherData.setMeasurements(82, 60, 25.4f);
        System.out.println("========================================================");
        weatherData.setMeasurements(78, 51, 33.4f);

    }
}
