public class WeatherData {

    // 인스턴스 변수 선언

    public void measurementsChanged() {

        // 최신 측정값 가져오기.
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        // Display 갱신
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsConditionsDisplay.update(temp, humidity, pressure);
        forecastConditionsDisplay.update(temp, humidity, pressure);

        /*
         * 현재 구조에서는 display들이 update 메소드를 요청하는데 하나로 묶을 수 있을 것 같음.
         * 최신 측정 값을 가져오는 시점을 판단하기 어려움
         * Observer 패턴 도입.
         */
    }
}
