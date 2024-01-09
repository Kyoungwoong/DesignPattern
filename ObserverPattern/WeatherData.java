import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    // 인스턴스 변수 선언
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        // Observer들에게 갱신 값 보내주기.
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {

        notifyObservers();
//        float temp = getTemperature();
//        float humidity = getHumidity();
//        float pressure = getPressure();
//
//        // Display 갱신
//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsConditionsDisplay.update(temp, humidity, pressure);
//        forecastConditionsDisplay.update(temp, humidity, pressure);

        /*
         * 현재 구조에서는 display들이 update 메소드를 요청하는데 하나로 묶을 수 있을 것 같음.
         * 최신 측정 값을 가져오는 시점을 판단하기 어려움
         * Observer 패턴 도입.
         */
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged(); // 최신 측정값 Observer들에게 갱신 값 보내주기.
    }
}
